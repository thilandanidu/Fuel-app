package com.example.dispatch.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.dispatch.model.Dispatch;


public interface DispatchService {
	public Dispatch dispatchDelivery( int orderRefId, String date);
	public ResponseEntity<List<Dispatch>> getDispatchables(); 
}
