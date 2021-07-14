package com.everis.ms.monedero.yanki.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.everis.ms.monedero.yanki.entity.Wallet;
@Repository
public interface WalletRepository extends ReactiveMongoRepository<Wallet, String>{
}