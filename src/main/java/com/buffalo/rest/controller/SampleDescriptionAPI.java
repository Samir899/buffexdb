package com.buffalo.rest.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.buffalo.entity.GeneList;
import com.buffalo.entity.Genes;
import com.buffalo.entity.SampleDescription;
import com.buffalo.entity.SampleDescriptionList;
import com.buffalo.service.GeneService;
import com.buffalo.service.SampleDescriptionService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;

@RestController
@RequestMapping("/sample_description/api") 
public class SampleDescriptionAPI { 
  
	@Autowired
    private SampleDescriptionService service;
  
    public SampleDescriptionAPI(SampleDescriptionService service) 
    { 
        this.service = service; 
    }
    
    @GetMapping("/sample_descriptions")  
    public List<SampleDescription> getAllSampleDescriptions() 
    { 
    	return service.listAllSampleDescription();
    }
    
    @GetMapping("/sample_descriptions/{runId}")  
    public SampleDescription getSampleByRunId(@PathVariable(name = "runId")String runId) 
    { 
    	return service.getSampleDescriptionByRunId(runId);
    }
    
    @GetMapping("/sample_descriptions/query")  
    public List<SampleDescription> getAllProducts(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
    { 	
        return service.listByQueryAPI(searchText, searchParam);
    }
    
    @GetMapping("/sample_descriptions/query/runIds")  
    public List<String> getAllRunIdsByQuery(@RequestParam("searchText") String searchText, @RequestParam("searchParam") String searchParam) 
    {     	
        return service.listRunIdsByQuery(searchText, searchParam);
    }
    
    @GetMapping("/sample_descriptions/runIds/all")  
    public List<String> getAllRunIds() 
    { 
    	
        return service.getAllRunIds();
    }
    
	public void writeToCSV(List<SampleDescription> sampleList, String header, String filename) throws IOException {
        PrintWriter writer = new PrintWriter(filename);
        writer.println(header);

        for (SampleDescription sample : sampleList) {
            writer.println(sample.toString());
        }
        writer.close();
    }
	
    @PostMapping("/sample_descriptions/download/runIds")
    public ResponseEntity<ByteArrayResource> getAllSampleDescriptions(SampleDescriptionList data) {
    	List<SampleDescription> sampleList = service.getSamplesByRunIdList(data.getRunIds());
    	String filename = System.getProperty("user.dir") + "\\" +"csv\\SampleDescription.csv";
		
		try {
			this.writeToCSV(sampleList, SampleDescription.getHeaders(), filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(filename);
	      Path path = Paths.get(file.getAbsolutePath());
	      ByteArrayResource resource = null;
		try {
			resource = new ByteArrayResource
			        (Files.readAllBytes(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResponseEntity<ByteArrayResource> obj = ResponseEntity.ok().headers(Utilities.headers("SampleDescription"+".csv"))
	            .contentLength(file.length())
	            .contentType(MediaType.parseMediaType
	                  ("application/octet-stream")).body(resource);
		//file.delete();
	    return obj;
    }
}