package com.spring.integration.channel;

/**
 *
 * @author ajay
 */
public class ReceiverServiceActivator {
    public boolean receiveMessage(Email email) {
        System.out.println("====Service activator is calling=====");
        return true;
    }
}
