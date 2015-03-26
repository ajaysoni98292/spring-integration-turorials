package com.spring.integration.channel;

import java.util.concurrent.Future;

/**
 *
 * @author ajay
 */
public interface MyGateway {
    public Future<Boolean> sendMessage(Email e);
}
