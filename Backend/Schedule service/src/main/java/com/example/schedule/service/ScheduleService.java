package com.example.schedule.service;

import java.util.List;

import com.example.schedule.model.Reserved;
import com.example.schedule.model.Schedule;

public interface ScheduleService {
	public Schedule saveSchedule(Schedule schedule);
	public Schedule deliveryDate(int orderRefId);
	public List<Schedule> getAllDeliveryDates();

}
