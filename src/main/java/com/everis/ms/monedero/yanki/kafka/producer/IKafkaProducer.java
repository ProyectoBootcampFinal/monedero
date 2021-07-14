package com.everis.ms.monedero.yanki.kafka.producer;

import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import com.everis.ms.monedero.yanki.entity.Wallet;



public interface IKafkaProducer{
	
	ListenableFuture<SendResult<String, Wallet>> sendJson(String topic, Wallet noCustomer);	
}
