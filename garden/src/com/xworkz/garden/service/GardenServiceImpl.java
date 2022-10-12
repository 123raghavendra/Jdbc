package com.xworkz.garden.service;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.repository.GardenRepository;
import com.xworkz.garden.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {

	public GardenServiceImpl() {
System.out.println("created"+getClass().getSimpleName());	
}
	
	
	@Override
	public boolean validAndSave(GardenDTO gardenDTO) {
		String name = gardenDTO.getName();
		String location = gardenDTO.getLocation();
		int noOfChairs = gardenDTO.getNoOfChairs();
		int noOfEnterance = gardenDTO.getNoOfEnterance();

		if (name != null && name.length() > 5 && name.length() < 100) {
			System.out.println("name is valid");
			if (location != null && location.length() > 6 && location.length()<100) {
				System.out.println("Location is valid");
				if (noOfChairs > 0 && noOfChairs < 100) {
					System.out.println("noOfChairs is valid");
					if (noOfEnterance >2 && noOfEnterance < 10) {
						System.out.println("noOfEnterance is valid");
						System.out.println("All properties saved sucessfully");
						GardenRepository gardenRepository = new GardenRepositoryImpl();
						gardenRepository.save(gardenDTO);
					} else {
						System.err.println("noOfEnterance is not valid");
					}
				} else {
					System.err.println("noOfChairs not valid");
				}
			} else {
				System.err.println("location is not valid");
			}
		}

		else {
			System.err.println("name is not valid");
		}

		return false;
	}

}
