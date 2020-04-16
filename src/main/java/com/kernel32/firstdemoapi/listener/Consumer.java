package com.kernel32.firstdemoapi.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "Zakaria fahraoui")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
