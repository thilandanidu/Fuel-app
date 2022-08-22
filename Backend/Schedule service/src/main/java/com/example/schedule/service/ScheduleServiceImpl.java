package com.example.schedule.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.schedule.config.KafkaTopicConfig;
import com.example.schedule.config.KafkaTopicDispatch;
import com.example.schedule.model.Reserved;
import com.example.schedule.model.Schedule;
import com.example.schedule.repository.ScheduleRepo;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepo scheduleRepo;
	
	@Autowired
	KafkaTemplate<String, Schedule> kafkaTemplate;

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		kafkaTemplate.send(KafkaTopicConfig.MESSAGE_TOPIC,schedule);
		kafkaTemplate.send(KafkaTopicDispatch.MESSAGE_TOPIC,schedule);
		return scheduleRepo.save(schedule);
	}

	@Override
	public Schedule deliveryDate(int orderRefId) {
		
		Schedule schedule = new Schedule();
		schedule.setOrderRefId(orderRefId);
		schedule.setDate(LocalDate.now().plusDays(1).toString());
		saveSchedule(schedule);
		
		return schedule;
	}

	@Override
	public List<Schedule> getAllDeliveryDates() {
		return scheduleRepo.findAll();
	
	}

	
}
