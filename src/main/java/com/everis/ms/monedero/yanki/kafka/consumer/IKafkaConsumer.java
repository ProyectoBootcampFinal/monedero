package com.everis.ms.monedero.yanki.kafka.consumer;

import com.everis.ms.monedero.yanki.entity.Wallet;

public interface IKafkaConsumer {

    public void consumeJson(Wallet noCustomer);
}
