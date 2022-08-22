package com.example.schedule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.schedule.model.Schedule;

@Repository
public interface ScheduleRepo extends MongoRepository<Schedule, Integer> {

}
