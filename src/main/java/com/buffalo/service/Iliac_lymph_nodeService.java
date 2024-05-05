package com.buffalo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Iliac_lymph_node;
import com.buffalo.entity.Intestine;
import com.buffalo.repo.Iliac_lymph_nodeRepository;
import com.buffalo.repo.IntestineRepository;

import com.buffalo.repo.IntestineRepository;
import com.buffalo.repo.IntestineRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Iliac_lymph_nodeService {
	
	public final int GENE_PER_PAGE = 10;
	
	@Autowired
	private Iliac_lymph_nodeRepository iliac_lymph_nodeRepo;
	
//	public Genes save(Genes gene) {
//		boolean isExistingGene = isExistingGene(gene.getGeneId());
//		
//		if(isExistingGene) {
//			return null;
//		}
//		return IntestineRepo.save(gene);
//	}
	
	public List<Iliac_lymph_node> listAllIliac_lymph_node(){
		return (List<Iliac_lymph_node>) iliac_lymph_nodeRepo.findAll();
	}
	
	public Map<String, Double> getFPKMSum() {
		return iliac_lymph_nodeRepo.getSum();
	}
//	public Genes getGeneById(String geneId){
//		return intestineRepo.getGeneByGeneId(geneId);
//	}
//	public Page<Genes> listByPage(int pageNum){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return IntestineRepoPaging.findAll(pageable);
//	}
//	
//	public Page<Genes> listByQuery(int pageNum,String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return IntestineRepoPaging.getGeneByGeneName(searchText, pageable);
//		}
//		if(searchParam.equals("chromosome"))
//			return IntestineRepoPaging.getGeneByChromosome(searchText, pageable);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return IntestineRepoPaging.getGeneByStrand(searchText, pageable);
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
//			return IntestineRepo.getGeneByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return IntestineRepo.getGeneByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return IntestineRepo.getGeneByStrand(searchText);
//		}
//		return null;
//	}
//	public List<String> listGeneIdsByQuery(String searchText, String searchParam){
//		System.out.println("SearchText: "+searchText);
//		System.out.println("SearchParam: "+searchParam);
//		if(searchParam.equals("gene_name")) {
//			System.out.println("Inside gene");
//			return IntestineRepo.getGeneIdByGeneName(searchText);
//		}
//		if(searchParam.equals("chromosome"))
//			return IntestineRepo.getGeneIdByChromosome(searchText);
//		if(searchParam.equals("strand")) {
//			System.out.println("searchText is :" + searchText);
//			return IntestineRepo.getGeneIdByStrand(searchText);
//		}
//		return null;
//	}
//	
//	public List<String> getAllGeneId(){
//		
//		return IntestineRepo.getAllGeneId();
//	}
//	
//	public List<Genes> getGenesWithGeneIds(List<String> geneIds){
//		
//		return IntestineRepo.getGenesByGeneList(geneIds);
//	}
//	
//	public Page<Genes> listByChromosome(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return IntestineRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	public Page<Genes> listByPageWithQuery(int pageNum, String geneName){
////		Sort sort = Sort.by(sortField);
////		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//		Pageable pageable = PageRequest.of(pageNum - 1, GENE_PER_PAGE);
//		return IntestineRepoPaging.getGeneByGeneName(geneName, pageable);
//	}
//	
//	public Iterable<Genes> saveAll(List<Genes> gene) {
//		
//		gene.forEach((element)->{
//			if(isExistingGene(element.getGeneId())) {
//				gene.remove(element);
//			}
//		});
//		return IntestineRepo.saveAll(gene);
//	}
//	
//public boolean isExistingGene(String geneId) {
//		
//		Genes geneByGeneId = IntestineRepo.getGeneByGeneId(geneId);
//		
//		if(geneByGeneId != null) return true;
//		return false;
//	}
}
