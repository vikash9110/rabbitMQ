package com.vikash.rabbitMQ.config.consumer;

import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.vikash.rabbitMQ.config.dto.OrderStatus;

@Component
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	@RabbitListener(queues = "vikash_test_queue")
	public void receiveMessage(OrderStatus message) {
		System.out.println("Received <" + message + ">");
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}