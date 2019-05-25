package com.zth.p2p;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息生产者
 * @author zth
 * @Date 2019-05-25 17:01
 */
public class JMSProducer {
    // 默认连接用户名
    private static final String USENAME = ActiveMQConnection.DEFAULT_USER;
    // 默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    // 默认连接地址
    private static final String BROKERURL = ActiveMQConnection.DEFAULT_BROKER_URL;


    public static void main(String[] args){
        // 连接工厂
        ConnectionFactory connectionFactory;
        // 连接
        Connection connection = null;
        // 会话 （接受或者发送消息的线程）
        Session session;
        // 消息目的地
        Destination destination;
        // 消息的生产者
        MessageProducer messageProducer;

        // 实例化工厂
        connectionFactory = new ActiveMQConnectionFactory(USENAME,PASSWORD,BROKERURL);

        try {
            // 获取连接
            connection = connectionFactory.createConnection();
            // 启动连接
            connection.start();
            // 创建会话
            /**
             * 参数1：是否启动事务
             * 参数2：消息确认模式[
             *      AUTO_ACKNOWLEDGE = 1    自动确认
             *      CLIENT_ACKNOWLEDGE = 2    客户端手动确认
             *       DUPS_OK_ACKNOWLEDGE = 3    自动批量确认
             *       SESSION_TRANSACTED = 0    事务提交并确认
             *  ]
             */
            session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);
            // 创建消息队列
            destination = session.createQueue("FirstQueue");
            // 创建消息生产者
            messageProducer = session.createProducer(destination);
            // 发送消息
          /*  sendMessage(session,messageProducer);
            session.commit();

            // 关闭资源
            messageProducer.close();
            session.close();*/


        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /**
     * 发送消息
     */
    private static void sendMessage(Session session,MessageProducer messageProducer) throws JMSException {
        for (int i = 0; i <10; i++) {
            TextMessage message = session.createTextMessage("ActiveMQ 发的第 "+i+"条消息");
            System.out.println("发送消息："+message.toString());
            messageProducer.send(message);
        }
    }
}
