package com.example.chatrealtimewebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * storm is a simple text-oriented messaging protocol.
 *
 * Messages are routed to @Controller message-handling methods or to a simple,
 */
@SpringBootApplication
public class ChatRealTimeWebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatRealTimeWebSocketApplication.class, args);
    }

}
