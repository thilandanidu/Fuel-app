package com.example.dispatch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.dispatch.model.Dispatch;


@Repository
public interface DispatchRepo extends MongoRepository<Dispatch, Integer> {

}
