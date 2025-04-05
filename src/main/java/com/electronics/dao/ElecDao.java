package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.ElectronicsEntity;
import com.electronics.repository.ElecJba;

@Repository
public class ElecDao {
    
	@Autowired
	ElecJba ej;

	public String insertElec(List<ElectronicsEntity> e) {
		ej.saveAll(e);	
		return "updated Successfully";
	}

	public List<ElectronicsEntity> get(String name, List<ElectronicsEntity> a) {
		return ej.get(name, a);
	}
	
	
	// Exception Handling
	
	public List<ElectronicsEntity> getName(String ename) {
		return ej.getName(ename);
	}
	
}
