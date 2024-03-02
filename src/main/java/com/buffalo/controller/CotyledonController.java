package com.buffalo.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.buffalo.entity.SampleDescription;
import com.buffalo.service.SampleDescriptionService;
import com.buffalo.tables.ListingTables;
import com.buffalo.utilities.Utilities;

@Controller
public class CotyledonController {

	@Autowired
	private SampleDescriptionService service;
	
//	@GetMapping("/database/sample_description")
//	public String databasePage(Model model) {
//		List<String> listDB = null;
//		try {
//			listDB = ListingTables.getAllTables();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(listDB);
//		model.addAttribute("listDB", listDB);
//		
//		
//		
//		return "database-samples";
//	}
//	
////	@RequestMapping("/database/BUFFALO_SAMPLE_DES/{pageNum}")
////	public String listByPage(@PathVariable(name = "pageNum")int pageNum, RedirectAttributes redirectAttributes, Model model) {
////		String currentDatabase = "BUFFALO_SAMPLE_DES";
////		System.out.println("pageNum:"+pageNum);
////		List<String> listDB = null;
////		try {
////			listDB = ListingTables.getAllTables();
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		model.addAttribute("listDB", listDB);
////		Page<BuffaloSampleDes> pageBuffalo = service.listByPage(pageNum);
////		List<BuffaloSampleDes> buffaloData = pageBuffalo.getContent();
////		System.out.println(buffaloData);
////		model.addAttribute("tableData", buffaloData);
////		long startCount = (pageNum - 1) * service.SAMPLE_PER_PAGE + 1;
////		long endCount = startCount + service.SAMPLE_PER_PAGE - 1;
////		if(endCount > pageBuffalo.getTotalElements()) endCount = pageBuffalo.getTotalElements();
////		List<BuffaloSampleDes> listBuffaloSample = pageBuffalo.getContent();
////		model.addAttribute("currentPage", pageNum);
////		model.addAttribute("nextPage", pageNum+1);
////		model.addAttribute("previousPage", pageNum-1);
////		model.addAttribute("totalPages", pageBuffalo.getTotalPages());
////		model.addAttribute("totalItems", pageBuffalo.getTotalElements());
////		model.addAttribute("startCount", startCount);
////		model.addAttribute("endCount", endCount);
////		model.addAttribute("listData", listBuffaloSample);
////		model.addAttribute("database", currentDatabase);
////		return "database";
////	}
////	
//	@GetMapping("/database/BUFFALO_SAMPLE_DES/downloads")
//	public ResponseEntity<ByteArrayResource> download(Model model) {
//		List<String> listDB = null;
//		try {
//			listDB = ListingTables.getAllTables();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(listDB);
//		model.addAttribute("listDB", listDB);
//		
//		
//		List<SampleDescription>buffaloSampleDesList = service.listAllSampleDescription();
//		String database = "BUFFALO_SAMPLE_DES";
//		String filename = System.getProperty("user.dir") + "\\" +"csv\\buffaloSampleDes.csv";
//		
//		try {
//			this.writeToCSV(buffaloSampleDesList, SampleDescription.getHeaders(), filename);
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
//		ResponseEntity<ByteArrayResource> obj = ResponseEntity.ok().headers(Utilities.headers(database+".csv"))
//	            .contentLength(file.length())
//	            .contentType(MediaType.parseMediaType
//	                  ("application/octet-stream")).body(resource);
//		file.delete();
//	    return obj;
//	}
//	
//	public void writeToCSV(List<SampleDescription> list, String header, String filename) throws IOException {
//        PrintWriter writer = new PrintWriter(filename);
//        writer.println(header);
//
//        for (SampleDescription buffaloSampleDes : list) {
//            writer.println(buffaloSampleDes.toString());
//        }
//        writer.close();
//    }
}
