package com.electronics.eelesrevice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.electronics.dao.ElecDao;
import com.electronics.entity.ElectronicsEntity;
import com.electronics.exception.NameNotFoundException;

@Service
public class ElecServices {
	
	@Autowired 
	ElecDao ed;

	public String insertElec(List<ElectronicsEntity> e) {
		return ed.insertElec(e);
	}

	
      public List<ElectronicsEntity> get(String name, List<ElectronicsEntity>a) {
    	  
    	  List<ElectronicsEntity> x=a.stream().filter(y->y.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    	  
		return ed.get(name,a);
	}
	
	
	
	
	
	
	
	//Exception Handling
	public  List<ElectronicsEntity> getName(String ename) throws NameNotFoundException {
		if(ed.getName(ename).isEmpty()) {
			throw new NameNotFoundException("This name is not found in the db");
		}
		else {
			return ed.getName(ename);
		}
	}










	

}
