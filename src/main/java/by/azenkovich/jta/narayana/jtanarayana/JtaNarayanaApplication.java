package by.azenkovich.jta.narayana.jtanarayana;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

import javax.annotation.PostConstruct;
import javax.jms.Message;

@SpringBootApplication
public class JtaNarayanaApplication {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private DefaultJmsListenerContainerFactory factory;

    public static void main(final String[] args) {
        SpringApplication.run(JtaNarayanaApplication.class, args);
    }

    @PostConstruct
    public void init() {
        jmsTemplate.setSessionTransacted(true);
        factory.setErrorHandler(new SomeHandler());
    }

    @Service
    public class SomeHandler implements ErrorHandler {

        @Override
        public void handleError(Throwable t) {
            System.out.println("Error in listener" + t);
        }
    }

    @Bean
    public Message message() {
        return new ActiveMQTextMessage();
    }
}
