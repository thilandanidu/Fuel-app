package com.example.schedule.listener;

import com.example.schedule.model.Reserved;
import com.example.schedule.service.ScheduleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaListeners {

    @Autowired
    ScheduleService scheduleService;



    @KafkaListener(topics = "inventory_topic", groupId = "sample-group")
    public void consumeJson(@Payload List<Reserved> data){

        String value = String.valueOf(data);
        int orderRefId = 0;
      
        ObjectMapper objectMapper = new ObjectMapper();
        try {

        	 List<Reserved> reservedOrders = objectMapper.readValue(value, new TypeReference<List<Reserved>>(){});
            for(Reserved order : reservedOrders) {
                orderRefId  = order.getOrderRefId();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(scheduleService.deliveryDate(orderRefId));

    }
}