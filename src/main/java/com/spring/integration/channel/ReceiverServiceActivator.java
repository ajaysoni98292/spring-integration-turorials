package com.spring.integration.channel;

/**
 *
 * @author ajay
 */
public class ReceiverServiceActivator {
    public boolean receiveMessage(Email email) {
        System.out.println("Service is running : You can write here business logic");
        return true;
    }
}
