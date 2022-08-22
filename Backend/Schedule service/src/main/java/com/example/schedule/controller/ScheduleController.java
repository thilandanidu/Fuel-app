package com.example.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schedule.model.Schedule;
import com.example.schedule.service.ScheduleService;

@RestController
@RequestMapping("api/v1/schedules")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleService;
	
	@GetMapping("/allSchedules")
	public List<Schedule> getAllDeliveryDates() {
		return scheduleService.getAllDeliveryDates();
	
	}

}
