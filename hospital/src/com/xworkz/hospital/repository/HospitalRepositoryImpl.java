package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("all properties saved sucessufuly");

		return true;
	}

}
