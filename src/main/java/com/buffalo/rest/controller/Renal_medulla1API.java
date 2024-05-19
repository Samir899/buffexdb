package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Renal_medulla1;

import com.buffalo.service.Renal_medulla1Service;
import com.buffalo.service.Renal_medulla2Service;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;

@RestController
@RequestMapping("/renal_medulla1/api") 
public class Renal_medulla1API { 
  
	@Autowired
    private Renal_medulla1Service renal_medulla1Service;
	
	@Autowired
	private Renal_medulla2Service renal_medulla2Service;
  
    public Renal_medulla1API(Renal_medulla1Service renal_medulla1Service, Renal_medulla2Service renal_medulla2Service) 
    { 
        this.renal_medulla1Service = renal_medulla1Service; 
        this.renal_medulla2Service = renal_medulla2Service;
    }
    
    @GetMapping("/renal_medulla1s")  
    public List<Renal_medulla1> getAllRenal_medulla1() 
    { 
    	return renal_medulla1Service.listAllRenal_medulla1();
    }
    
    @GetMapping("/renal_medulla1s/sum")  
    public Map<String, Double> getSum() 
    {
    	Map<String, Double> map_renal_medulla1 = renal_medulla1Service.getFPKMSum();
    	Map<String, Double> map_renal_medulla2 = renal_medulla2Service.getFPKMSum();
    	Map<String, Double> map = new HashMap<>();
    	map.putAll(map_renal_medulla1);
    	map.putAll(map_renal_medulla2);
    	return map;
    }
    
    @GetMapping("/renal_medulla1s/sorted")  
    public List<Renal_medulla1> getRenal_medulla1Sorted(@RequestParam("lowerLimit") double lowerLimit, @RequestParam("upperLimit") double upperLimit) 
    { 
    	return renal_medulla1Service.getRenal_medulla1Sorted(lowerLimit, upperLimit);
    }
    
//    @GetMapping("/genes/{geneId}")  
//    public Genes getGeneByGeneId(@PathVariable(name = "geneId")String geneId) 
//    { 
//    	return geneService.getGeneById(geneId);
//    }
//    
//    @GetMapping("/genes/query")  
//    public List<Genes> getAllProducts(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
//    { 
//    	System.out.println("SearchText: " + searchText);
//    	System.out.println("searchParam: " + searchParam);
//    	
//        return geneService.listByQueryAPI(searchText, searchParam);
//    }
//    
//    @GetMapping("/genes/query/geneIds")  
//    public List<String> getAllGeneIds(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
//    { 
//    	System.out.println("SearchText: " + searchText);
//    	System.out.println("searchParam: " + searchParam);
//    	
//        return geneService.listGeneIdsByQuery(searchText, searchParam);
//    }
//    
//    @GetMapping("/genes/geneId/all")  
//    public List<String> getAllGeneId() 
//    { 
//    	
//        return geneService.getAllGeneId();
//    }
//    
//	public void writeToCSV(List<Genes> genesList, String header, String filename) throws IOException {
//        PrintWriter writer = new PrintWriter(filename);
//        writer.println(header);
//
//        for (Genes gene : genesList) {
//            writer.println(gene.toString());
//        }
//        writer.close();
//    }
//	
//    @PostMapping("/genes/download/geneIds")
//    public ResponseEntity<ByteArrayResource> getAllGeneIds(GeneList data) {
//    	System.out.println(data.getGeneIds().size());
//    	List<Genes> genesList = geneService.getGenesWithGeneIds(data.getGeneIds());
//    	System.out.println(genesList.size());
//    	String filename = System.getProperty("user.dir") + "\\" +"csv\\genes.csv";
//		
//		try {
//			this.writeToCSV(genesList, Genes.getHeaders(), filename);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		File file = new File(filename);
//	      Path path = Paths.get(file.getAbsolutePath());
//	      ByteArrayResource resource = null;
//		try {
//			resource = new ByteArrayResource
//			        (Files.readAllBytes(path));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ResponseEntity<ByteArrayResource> obj = ResponseEntity.ok().headers(Utilities.headers("genes"+".csv"))
//	            .contentLength(file.length())
//	            .contentType(MediaType.parseMediaType
//	                  ("application/octet-stream")).body(resource);
//		//file.delete();
//	    return obj;
//    }
}