//package com.buffalo.rest.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.buffalo.entity.Blood;
//import com.buffalo.service.BloodService;
//import com.buffalo.service.Liver_AService;
//import com.buffalo.service.Liver_BService;
//
//@RestController
//@RequestMapping("/liver/api") 
//public class LiverAPI {
//	
//	@Autowired
//    private Liver_AService liver_a_service;
//	@Autowired
//    private Liver_BService liver_b_service;
//	
//	public LiverAPI(Liver_AService liver_a_service, Liver_BService liver_b_service) 
//    { 
//        this.liver_a_service = liver_a_service; 
//        this.liver_b_service = liver_b_service;
//    }
//
//	@GetMapping("/livers")  
//    public List<Blood> getAllBlood() 
//    { 
//    	return bloodService.listAllBlood();
//    }
//
//    
//    @GetMapping("/bloods/sum")  
//    public Map<String, Double> getSum() 
//    {
//    	return bloodService.getFPKMSum();
//    }
//    
//
//    @GetMapping("/bloods/sorted")  
//    public List<Blood> getBloodSorted(@RequestParam("lowerLimit") double lowerLimit, @RequestParam("upperLimit") double upperLimit) 
//    { 
//    	return bloodService.getBloodSorted(lowerLimit, upperLimit);
//    }
//}
