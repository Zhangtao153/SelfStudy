package com.zth.PubSub;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息发布者
 * @author zth
 * @Date 2019-05-25 20:34
 */
public class JMSProducer {
    public static void main(String[] args){
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                ActiveMQConnectionFactory.DEFAULT_BROKER_URL
        );
        try {
            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createTopic("FirstTopic");
            MessageProducer messageProducer = session.createProducer(destination);

            sendMessage(session,messageProducer);
            session.commit();

            messageProducer.close();
            session.close();
            connection.close();

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessage(Session session,MessageProducer messageProducer) throws JMSException {
        for (int i = 0; i < 10; i++) {
            TextMessage message = session.createTextMessage("ActiveMQ 发布的第 "+i+" 条消息");
            System.out.println("发送的消息是："+message.getText());
            messageProducer.send(message);
        }
    }
}
