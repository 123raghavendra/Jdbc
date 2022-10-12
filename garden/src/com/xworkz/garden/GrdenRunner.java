package com.xworkz.garden;

import com.xworkz.garden.dto.GardenDTO;
import com.xworkz.garden.repository.GardenRepository;
import com.xworkz.garden.repository.GardenRepositoryImpl;
import com.xworkz.garden.service.GardenService;
import com.xworkz.garden.service.GardenServiceImpl;

public class GrdenRunner {

	public static void main(String[] args) {
GardenDTO dto=new GardenDTO("Sai Garden", "BTM LAYOUT ", 20,4);
System.out.println(dto);

GardenService gardenService=new GardenServiceImpl();
gardenService.validAndSave(dto);
	
	}

}
