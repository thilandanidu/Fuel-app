package com.example.inventory.service;

import com.example.inventory.model.Reserved;

public interface ReservedService {

	public Reserved saveReserved(Reserved reserved);

	public Reserved getFromAvailable(int orderRefId, String fuelType, int fuelCapacity);
	
}
