package com.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.ElectronicsEntity;

public interface ElecJba extends JpaRepository<ElectronicsEntity ,Integer> {

	
//	Exception Handling Query
	@Query (value="select * from elec where name=?",nativeQuery=true)
	List<ElectronicsEntity> getName(String ename);

	
	
	List<ElectronicsEntity> get(String name, List<ElectronicsEntity> a);
	
}

