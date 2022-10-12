package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {
	public static void main(String[] args) {
		
		HospitalDTO hospitalDTO=new HospitalDTO(1, "jay deva", "C.N.Manjunath", "Cardic", 1972);
		System.out.println(hospitalDTO);
		
		HospitalService hospitalService=new HospitalServiceImpl();
		hospitalService.validAndSave(hospitalDTO);
	}


	
}
