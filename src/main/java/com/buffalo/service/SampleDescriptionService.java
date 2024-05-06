package com.buffalo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.buffalo.entity.SampleDescription;
import com.buffalo.entity.Genes;
import com.buffalo.repo.BuffaloSampleDesRepoPagingAndSorting;
import com.buffalo.repo.SampleDescriptionRepository;
import com.buffalo.repo.GeneRepoPagingAndSorting;
import com.buffalo.repo.GeneRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SampleDescriptionService {
	
	public final int SAMPLE_PER_PAGE = 10;
	
	@Autowired
	private SampleDescriptionRepository repo;
	
	@Autowired
	private BuffaloSampleDesRepoPagingAndSorting repoPaging;
	
	public SampleDescription save(SampleDescription buffaloSample) {
		boolean isExistingSample = isExistingGene(buffaloSample.getRun());
		
		if(isExistingSample) {
			return null;
		}
		return repo.save(buffaloSample);
	}
	
	public List<SampleDescription> listAllSampleDescription(){
		return (List<SampleDescription>) repo.findAll();
	}
	
	public Page<SampleDescription> listByPage(int pageNum){
		Pageable pageable = PageRequest.of(pageNum - 1, SAMPLE_PER_PAGE);
		return repoPaging.findAll(pageable);
	}
	
	public Iterable<SampleDescription> saveAll(List<SampleDescription> buffaloSample) {
		
		buffaloSample.forEach((element)->{
			if(isExistingGene(element.getRun())) {
				buffaloSample.remove(element);
			}
		});
		return repo.saveAll(buffaloSample);
	}
	public boolean isExistingGene(String run) {
		
		SampleDescription buffaloSampleByRun = repo.getSampleByRun(run);
		
		if(buffaloSampleByRun != null) return true;
		return false;
	}

	public SampleDescription getSampleDescriptionByRunId(String runId) {	
	 return repo.getSampleByRun(runId);	
	}
	
	public List<SampleDescription> listByQueryAPI(String searchText, String searchParam){
		
		if(searchParam.equals("breed")) {
			return repo.getSampleBybreed(searchText);
		}
		if(searchParam.equals("bioProject")) {
			return repo.getSampleByBioProject(searchText);
		}
		if(searchParam.equals("condition_treatment"))
			return repo.getSampleByConditionTreatment(searchText);
		
		if(searchParam.equals("development_stage")) {
			System.out.println("searchText is :" + searchText);
			return repo.getSampleByDevelopmentStage(searchText);
		}
		if(searchParam.equals("category")) {
			System.out.println("searchText is :" + searchText);
			return repo.getSampleByCategory(searchText);
		}
//		if(searchParam.equals("source")) {
//			System.out.println("searchText is :" + searchText);
//			return repo.getSampleBySource(searchText);
//		}
		if(searchParam.equals("species")) {
			System.out.println("searchText is :" + searchText);
			return repo.getSampleBySpecies(searchText);
		}
		if(searchParam.equals("tissue")) {
			System.out.println("searchText is :" + searchText);
			return repo.getSampleByTissues(searchText);
		}
		return null;
	}
	
	public List<String> listRunIdsByQuery(String searchText, String searchParam){
		
		if(searchParam.equals("bioProject")) {
			return repo.getRunIdByBioProject(searchText);
		}
		
		if(searchParam.equals("breed")) {
			return repo.getRunIdByBreed(searchText);
		}
		if(searchParam.equals("condition_treatment"))
			return repo.getRunIdByConditionTreatment(searchText);
		
		if(searchParam.equals("development_stage")) {

			return repo.getRunIdByDevelopmentStage(searchText);
		}
		if(searchParam.equals("category")) {

			return repo.getRunIdByCategory(searchText);
		}
//		if(searchParam.equals("source")) {
//			System.out.println("searchText is :" + searchText);
//			return repo.getRunIdBySource(searchText);
//		}
		if(searchParam.equals("species")) {
			System.out.println("searchText is :" + searchText);
			return repo.getRunIdBySpecies(searchText);
		}
		if(searchParam.equals("tissue")) {
			System.out.println("searchText is :" + searchText);
			return repo.getRunIdByTissues(searchText);
		}
		return null;
	}
	
	public List<String> getAllRunIds(){
		
		return repo.getAllRunIds();
	}
	
	public List<SampleDescription> getSamplesByRunIdList(List<String> SampleRunIds){
		
		return repo.getSampleDescriptionByRunIdList(SampleRunIds);
	}
}
