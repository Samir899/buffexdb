package com.buffalo.rest.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.entity.Blood;
import com.buffalo.entity.CorpusLuteum;
import com.buffalo.service.CorpusLuteumService;

@RestController
@RequestMapping("/corpus_luteum/api") 
public class CorpusLuteumAPI { 
  
	@Autowired
    private CorpusLuteumService service;
  
    public CorpusLuteumAPI(CorpusLuteumService service) 
    { 
        this.service = service; 
    }
    
    @GetMapping("/corpus_luteums")  
    public List<CorpusLuteum> getAllCotyledon() 
    { 
    	System.out.println("corpus luteum");
    	return service.listAllCorpusLuteum();
    }
    
    @GetMapping("/corpus_luteums/sum")  
    public Map<String, Double> getSumOf() 
    {
    	return service.getFPKMSum();
    }
    

    @GetMapping("/corpus_luteums/sorted")  
    public List<CorpusLuteum> getCorpusLuteumSorted(@RequestParam("lowerLimit") double lowerLimit, @RequestParam("upperLimit") double upperLimit) 
    { 
    	return service.getCorpusLuteumSorted(lowerLimit, upperLimit);
    }
    
//    @GetMapping("/corpusluteums/err/{err}")  
//    public List<CorpusLuteum> getCotyledonByERR(@PathVariable(name = "err")String err) 
//    { 
//    	return service.getCorpusLuteumByERR(err);
//    }
    
    @GetMapping("/corpus_luteums/err/sum")  
    public Map <String, Double> getSum() 
    { 
    	return service.getSum();
    }

//    @GetMapping("/corpusluteums/err/sum")  
//    public Map <String, Double> getSum() 
//
//    { 
//    	return service.getSum();
//    }

}