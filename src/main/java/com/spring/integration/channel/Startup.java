package com.spring.integration.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ajay
 */

public class Startup {

    ClassPathXmlApplicationContext context = null;
    MyGateway myGateway = null;

    public Startup() {
        context = new ClassPathXmlApplicationContext("/META-INF/spring/si-component.xml");
        myGateway = context.getBean("myGateway  ", MyGateway.class);
    }

    public void publishMessage(Email email) {
        boolean receivedEmailResponse = myGateway.sendMessage(email);
        System.out.println("Response from the consumer side :"+receivedEmailResponse);
    }

    public static void main(String args[]) {
        Startup startup = new Startup();
        Email email = new Email("ajay","46");
        startup.publishMessage(email);
    }
}
