package com.electronics.eleccontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.eelesrevice.ElecServices;
import com.electronics.entity.ElectronicsEntity;
import com.electronics.exception.NameNotFoundException;

@RestController
public class ElecController {
	
	@Autowired
	ElecServices es;
	
	@PostMapping ("postele")
	
	public String insertElec(@RequestBody List<ElectronicsEntity> e ) {
		
		return es.insertElec(e);	
	}
	
	// service class implemntetion
	
	@GetMapping ("/getObject/{name}")
	
	public List<ElectronicsEntity>get(@PathVariable String name,@RequestBody List<ElectronicsEntity> a){
		return es.get(name,a);
		
	}
	
	
	// Exception Handling
	@GetMapping ("/getname/{ename}")
	
	public List<ElectronicsEntity> getName(@PathVariable String ename) throws NameNotFoundException {
		
		return es.getName(ename);
	}


}