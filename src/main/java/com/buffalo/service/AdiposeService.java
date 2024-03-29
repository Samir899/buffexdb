package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Adipose;
import com.buffalo.entity.Genes;
import com.buffalo.repo.AdiposeRepository;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdiposeService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private AdiposeRepository adiposeRepo;
	
//	public Genes save(Genes gene) {
//		boolean isExistingGene = isExistingGene(gene.getGeneId());
//		
//		if(isExistingGene) {
//			return null;
//		}
//		return adiposeRepo.save(gene);
//	}
	
	public List<Adipose> listAllAdipose(){
		return (List<Adipose>) adiposeRepo.findAll();
	}
	
	public Map<String, Double> getFPKMSum() {
		return adiposeRepo.getSum();
	}
//	public Genes getGeneById(String geneId){
//		return adiposeRepo.getGeneByGeneId(geneId);
//	}
//	public Page<Genes> listByPage(int pageNum){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return adiposeRepoPaging.findAll(pageable);
//	}
//	
//	public Page<Genes> listByQuery(int pageNum,String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return adiposeRepoPaging.getGeneByGeneName(searchText, pageable);
//		}
//		if(searchParam.equals("chromosome"))
//			return adiposeRepoPaging.getGeneByChromosome(searchText, pageable);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return adiposeRepoPaging.getGeneByStrand(searchText, pageable);
//			
//		}
//			
//		return null;
//	}
//	
//	public List<Genes> listByQueryAPI(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return adiposeRepo.getGeneByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return adiposeRepo.getGeneByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return adiposeRepo.getGeneByStrand(searchText);
//		}
//		return null;
//	}
//	public List<String> listGeneIdsByQuery(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return adiposeRepo.getGeneIdByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return adiposeRepo.getGeneIdByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return adiposeRepo.getGeneIdByStrand(searchText);
//		}
//		return null;
//	}
//	
//	public List<String> getAllGeneId(){
//		
//		return adiposeRepo.getAllGeneId();
//	}
//	
//	public List<Genes> getGenesWithGeneIds(List<String> geneIds){
//		
//		return adiposeRepo.getGenesByGeneList(geneIds);
//	}
//	
//	public Page<Genes> listByChromosome(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return adiposeRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	public Page<Genes> listByPageWithQuery(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return adiposeRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	
//	public Iterable<Genes> saveAll(List<Genes> gene) {
//		
//		gene.forEach((element)->{
//			if(isExistingGene(element.getGeneId())) {
//				gene.remove(element);
//			}
//		});
//		return adiposeRepo.saveAll(gene);
//	}
//	
//public boolean isExistingGene(String geneId) {
//		
//		Genes geneByGeneId = adiposeRepo.getGeneByGeneId(geneId);
//		
//		if(geneByGeneId != null) return true;
//		return false;
//	}
}
