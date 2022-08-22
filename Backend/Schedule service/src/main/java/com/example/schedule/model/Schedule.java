package com.example.schedule.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Schedule")
public class Schedule {
	
	@Id
	private int orderRefId;
	private String date;
	
	public Schedule() {
	
	}

	public Schedule(int orderRefId, String date) {
		this.orderRefId = orderRefId;
		this.date = date;
	}

	public int getOrderRefId() {
		return orderRefId;
	}

	public void setOrderRefId(int orderRefId) {
		this.orderRefId = orderRefId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	

}
