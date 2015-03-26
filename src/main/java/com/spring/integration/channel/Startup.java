package com.spring.integration.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author ajay
 */

public class Startup {

    ClassPathXmlApplicationContext context = null;
    MyGateway myGateway = null;

    public Startup() {
        context = new ClassPathXmlApplicationContext("/META-INF/spring/si-component.xml");
        myGateway = context.getBean("myGateway", MyGateway.class);
    }

    public void publishMessage(Email email) {
        Future<Boolean> future = myGateway.sendMessage(email);
        Boolean isSuccessful = false;
        try {
            isSuccessful = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Response from the consumer side :" + isSuccessful);
    }

    public static void main(String args[]) {
        Startup startup = new Startup();
        Email email = new Email("ajay", "46");
        startup.publishMessage(email);
    }
}
