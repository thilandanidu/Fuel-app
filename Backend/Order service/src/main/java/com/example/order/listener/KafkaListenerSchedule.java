package com.example.order.listener;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.order.model.Reserved;
import com.example.order.model.Schedule;
import com.example.order.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class KafkaListenerSchedule {

	@Autowired
    OrderService orderService;



    @KafkaListener(topics = "schedule_topic", groupId = "sample-group")
    public void consumeJson(@Payload List<Schedule> data){

        String value = String.valueOf(data);
        int orderRefId = 0;
        String status = "Scheduled";
        String date = "";
       
      
        ObjectMapper objectMapper = new ObjectMapper();
        try {

        	 List<Schedule> orders = objectMapper.readValue(value, new TypeReference<List<Schedule>>(){});
            for(Schedule order : orders) {
                orderRefId  = order.getOrderRefId();
                date = order.getDate();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        orderService.orderReceived(orderRefId, status, date);

    }
}
