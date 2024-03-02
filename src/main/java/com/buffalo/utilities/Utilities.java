package com.buffalo.utilities;
import com.opencsv.CSVReader;



import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.buffalo.entity.Genes;
import java.io.PrintWriter;
public class Utilities {
	
	public static List<Genes> csvToArrayList(String directory, String filename, String database){
		
		try{
			
	        boolean isHeaderRecord = true;
	    	BufferedReader reader;
	        switch(database){
	        	case "GENES": List<Genes> genes = new ArrayList<>();
	        	try {
					reader = new BufferedReader(new FileReader(directory+filename));
					String line = reader.readLine();
					List<String> headers=null;
					List<String> values;
					while (line != null) {
						Genes gene = new Genes();
						if(isHeaderRecord) {
							headers = Arrays.asList(line.trim().split(","));
							isHeaderRecord=false;
							
						}else {
							values =  Arrays.asList(line.trim().split(","));
							gene.setGeneId(values.get(headers.indexOf("geneId")));
							gene.setGeneName(values.get(headers.indexOf("geneName")));
							gene.setLocus(values.get(headers.indexOf("locus")));
							gene.setStrand(values.get(headers.indexOf("strand")));
							gene.setChromosome(values.get(headers.indexOf("chromosome")));
							genes.add(gene);
						}
						
//						System.out.println(line);
						// read next line
						line = reader.readLine();
					}
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	return genes;
	        	default: System.out.println("Database not found");
	        }
		}catch(Exception ex) {
			System.out.println("could not convert csv file: " + ex);
		}
		return null;
	}
	
//	public static void writeToCSV(List<Genes> genesList, String header, String filename) throws IOException {
//        PrintWriter writer = new PrintWriter(filename);
//        writer.println(header);
//
//        for (Genes gene : genesList) {
//            writer.println(gene.toString());
//        }
//        writer.close();
//    }
	public static HttpHeaders headers(String name) {

	      HttpHeaders header = new HttpHeaders();
	      header.add(HttpHeaders.CONTENT_DISPOSITION, 
	            "attachment; filename=" + name);
	      header.add("Cache-Control", "no-cache, no-store,"
	            + " must-revalidate");
	      header.add("Pragma", "no-cache");
	      header.add("Expires", "0");
	      return header;

	   }
}
