package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Renal_medulla2;
import com.buffalo.service.Renal_medulla2Service;


@RestController
@RequestMapping("/renal_medulla2/api") 
public class Renal_medulla2API { 
  
	@Autowired
    private Renal_medulla2Service renal_medulla2Service;
  
    public Renal_medulla2API(Renal_medulla2Service productService) 
    { 
        this.renal_medulla2Service = productService; 
    }
    
    @GetMapping("/renal_medulla2s")  
    public List<Renal_medulla2> getAllRenal_medulla2() 
    { 
    	return renal_medulla2Service.listAllRenal_medulla2();
    }
    
    @GetMapping("/renal_medulla2s/sum")  
    public Map<String, Double> getSum() 
    {
    	return renal_medulla2Service.getFPKMSum();
    }
    
    @GetMapping("/renal_medulla2s/sorted")  
    public List<Renal_medulla2> getRenal_medulla2Sorted(@RequestParam("lowerLimit") double lowerLimit, @RequestParam("upperLimit") double upperLimit) 
    { 
    	return renal_medulla2Service.getRenal_medulla2Sorted(lowerLimit, upperLimit);
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