package com.example.client_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.client_service.Model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
