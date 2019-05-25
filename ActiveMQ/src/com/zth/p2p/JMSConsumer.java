package com.zth.p2p;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息消费者
 * @author zth
 * @Date 2019-05-25 19:28
 */
public class JMSConsumer {
    private static final String USENAME = ActiveMQConnection.DEFAULT_USER;
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String URL = ActiveMQConnection.DEFAULT_BROKER_URL;

    public static void main(String[] args){
        // 实例化工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USENAME,PASSWORD,URL);

        try {
            // 创建连接
            Connection connection = connectionFactory.createConnection();
            // 启动连接
            connection.start();
            // 创建 session
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            // 创建连接的消息队列
            Destination destination = session.createQueue("FirstQueue");
            // 创建消息的消费者
            MessageConsumer messageConsumer = session.createConsumer(destination);

            while (true){
                TextMessage textMessage = (TextMessage)messageConsumer.receive(100000);
                if (null != textMessage){
                    System.out.println("接收到消息："+textMessage.getText());
                }else {
                    break;
                }
            }

            // 关闭资源
            messageConsumer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
