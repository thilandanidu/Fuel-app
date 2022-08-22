package com.example.dispatch.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dispatch")
public class Dispatch {
	
	@Id
	private int orderRefId;
	private String date;
	
	public Dispatch() {
	
	}

	public Dispatch(int orderRefId, String date) {
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
