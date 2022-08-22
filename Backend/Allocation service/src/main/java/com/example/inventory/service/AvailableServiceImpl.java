package com.example.inventory.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.inventory.model.Available;
import com.example.inventory.model.Order;
import com.example.inventory.repository.AvailableRepo;

@Service
public class AvailableServiceImpl implements AvailableService {
	
	@Autowired
	AvailableRepo availableRepo;
	
	@Autowired
	ReservedService reservedService;

	
	
	@Override
	public ResponseEntity<Available> saveAvailableFuel(Available available) {
		try {
		availableRepo.save(available);
		
		}catch(Exception e) {
			
		}
	
		return ResponseEntity.status(HttpStatus.OK).body(available);	
	}

	@Override
	public Available getCapacity(String fuelType, int fuelCapacity,int orderRefId) {
		

		Available byFuelType = availableRepo.findByFuelType(fuelType);
		int availableCapacity = byFuelType.getQty();
		String status = "Allocated";
		
		 if(availableCapacity>=fuelCapacity){
			 int newAvailableCapacity  = availableCapacity - fuelCapacity;
				byFuelType.setQty(newAvailableCapacity);
				saveAvailableFuel(byFuelType);
				reservedService.getFromAvailable(orderRefId,fuelType,fuelCapacity);
	
		 }
				
		return byFuelType;

	}
	

}
