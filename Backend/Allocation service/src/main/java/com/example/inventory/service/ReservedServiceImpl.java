package com.example.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.inventory.config.KafkaTopicConfig;
import com.example.inventory.config.KafkaTopicInOrder;
import com.example.inventory.model.Reserved;
import com.example.inventory.repository.ReservedRepo;

@Service
public class ReservedServiceImpl implements ReservedService{
	
	@Autowired
	ReservedRepo reservedRepo;
	
	@Autowired
	KafkaTemplate<String, Reserved> kafkaTemplate;

	@Override
	public Reserved saveReserved(Reserved reserved) {
		
		kafkaTemplate.send(KafkaTopicConfig.MESSAGE_TOPIC,reserved);
		kafkaTemplate.send(KafkaTopicInOrder.MESSAGE_TOPIC,reserved);
		return reservedRepo.save(reserved);
	}
	
	@Override
	public Reserved getFromAvailable(int orderRefId, String fuelType, int fuelCapacity) {
		Reserved reserved = new Reserved();
		reserved.setOrderRefId(orderRefId);
		reserved.setFuelType(fuelType);
		reserved.setQty(fuelCapacity);
		return saveReserved(reserved);
		
		
	}

}
