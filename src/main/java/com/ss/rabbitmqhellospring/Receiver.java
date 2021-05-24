package com.ss.rabbitmqhellospring;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {
    // alert message received
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message){
        System.out.println("Received <" + message + ">");
        // only one message and stop listening
        latch.countDown();
    }

    public CountDownLatch getLatch(){
        return  latch;
    }

}
