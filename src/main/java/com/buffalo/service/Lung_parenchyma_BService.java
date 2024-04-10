package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Lung_parenchyma_B;
import com.buffalo.repo.BrainRepository;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;
import com.buffalo.repo.Lung_parenchyma_BRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Lung_parenchyma_BService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private Lung_parenchyma_BRepository lung_parenchyma_BRepo;
	
//	@Autowired
//	private GeneRepoPagingAndSorting geneRepoPaging;
	
//	public Genes save(Genes gene) {
//		boolean isExistingGene = isExistingGene(gene.getGeneId());
//		
//		if(isExistingGene) {
//			return null;
//		}
//		return geneRepo.save(gene);
//	}
	
	public List<Lung_parenchyma_B> listAllLung_parenchyma_B(){
		return (List<Lung_parenchyma_B>) lung_parenchyma_BRepo.findAll();
	}
	
	public Map<String, Double> getFPKMSum() {
		return lung_parenchyma_BRepo.getSum();
	}
//	public Genes getGeneById(String geneId){
//		return geneRepo.getGeneByGeneId(geneId);
//	}
//	public Page<Genes> listByPage(int pageNum){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.findAll(pageable);
//	}
//	
//	public Page<Genes> listByQuery(int pageNum,String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return geneRepoPaging.getGeneByGeneName(searchText, pageable);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepoPaging.getGeneByChromosome(searchText, pageable);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepoPaging.getGeneByStrand(searchText, pageable);
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
//			return geneRepo.getGeneByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepo.getGeneByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepo.getGeneByStrand(searchText);
//		}
//		return null;
//	}
//	public List<String> listGeneIdsByQuery(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return geneRepo.getGeneIdByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return geneRepo.getGeneIdByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return geneRepo.getGeneIdByStrand(searchText);
//		}
//		return null;
//	}
//	
//	public List<String> getAllGeneId(){
//		
//		return geneRepo.getAllGeneId();
//	}
//	
//	public List<Genes> getGenesWithGeneIds(List<String> geneIds){
//		
//		return geneRepo.getGenesByGeneList(geneIds);
//	}
//	
//	public Page<Genes> listByChromosome(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	public Page<Genes> listByPageWithQuery(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return geneRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	
//	public Iterable<Genes> saveAll(List<Genes> gene) {
//		
//		gene.forEach((element)->{
//			if(isExistingGene(element.getGeneId())) {
//				gene.remove(element);
//			}
//		});
//		return geneRepo.saveAll(gene);
//	}
//	
//public boolean isExistingGene(String geneId) {
//		
//		Genes geneByGeneId = geneRepo.getGeneByGeneId(geneId);
//		
//		if(geneByGeneId != null) return true;
//		return false;
//	}
}
