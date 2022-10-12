package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;

import lombok.Getter;

public class HospitalServiceImpl implements HospitalService {

	public HospitalServiceImpl() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	public boolean validAndSave(HospitalDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		String specilist = dto.getSpecilist();
		int since = dto.getSince();
		if (id > 0 && id < 10000) {
			System.out.println("id is valid ");
			if (name != null && name.length() > 3 && name.length() < 100) {
				System.out.println("name is valid ");
				if (founder != null && founder.length() > 8 && founder.length() < 100) {
					System.out.println("founder is valid ");
					if (specilist != null && specilist.length() > 4 && specilist.length() < 100) {
						System.out.println("Specilist is valid ");
						if (since > 1960 && since < 2022) {
							System.out.println("Since is valid ");
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
						} else {
							System.err.println("since is not valid ");
						}
					} else {
						System.err.println("specilist is not valid ");
					}

				} else {
					System.err.println("Founder is not valid");
				}
			} else {
				System.err.println("Name is not valid ");
			}
		} else {
			System.err.println("id is not valid ");
		}
		return false;
	}
}
