package com.spring.integration.channel;

import com.spring.integration.channel.domain.Shiporder;
import org.springframework.messaging.Message;

/**
 *
 * @author ajay
 */
public class MyEnricher {

    public double computeTotal(Message<Shiporder> order) {
        double sum = 0;
        for (Shiporder.Item item : order.getPayload().getItem()) {
            sum = sum
                    + (item.getPrice().doubleValue() * item.getQuantity().intValue());
        }
        return sum;
    }
}
