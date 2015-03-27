package com.spring.integration.channel;

import org.springframework.messaging.Message;

/**
 *
 * @author ajay
 */

public class ExampleServiceActivator {
    public void printShiporder(Message message){
        System.out.println("======Header value====="+message.getHeaders().get("NAME"));
    }
}
