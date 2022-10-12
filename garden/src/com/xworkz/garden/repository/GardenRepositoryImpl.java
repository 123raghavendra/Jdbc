package com.xworkz.garden.repository;

import com.xworkz.garden.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	public GardenRepositoryImpl() {
System.out.println("created"+getClass().getSimpleName());
}
	
	@Override
	public boolean save(GardenDTO gardenDTO) {
		System.out.println("method is saved sucessufuly");
		return false;
	}

}
