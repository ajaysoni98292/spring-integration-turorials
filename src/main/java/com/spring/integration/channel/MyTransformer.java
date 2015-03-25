package com.spring.integration.channel;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author ajay
 */

@Component
public class MyTransformer {

    @Transformer
    public Message<String> myMessage(Message<String> message) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(message.getPayload().toString() + " Successful!!!");
        return MessageBuilder.withPayload(stringBuilder.toString()).build();
    }

}
