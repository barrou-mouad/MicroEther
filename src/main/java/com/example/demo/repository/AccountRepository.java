package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.ethereum.entities.Account;

public interface AccountRepository extends MongoRepository<com.demo.ethereum.entities.Account, Integer>{

}
