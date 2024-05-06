package com.buffalo.rest.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.buffalo.entity.CorpusLuteum;
import com.buffalo.service.CorpusLuteumService;

@RestController
@RequestMapping("/corpusluteum/api") 
public class CorpusLuteumAPI { 
  
	@Autowired
    private CorpusLuteumService service;
  
    public CorpusLuteumAPI(CorpusLuteumService service) 
    { 
        this.service = service; 
    }
    
    @GetMapping("/corpusluteums")  
    public List<CorpusLuteum> getAllCotyledon() 
    { 
    	return service.listAllCorpusLuteum();
    }
    
    
//    @GetMapping("/corpusluteums/err/{err}")  
//    public List<CorpusLuteum> getCotyledonByERR(@PathVariable(name = "err")String err) 
//    { 
//    	return service.getCorpusLuteumByERR(err);
//    }
    
    @GetMapping("/corpusluteums/err/sum")  
    public  Map <String, Double> getSum() 
    { 
    	return service.getSum();
    }
}