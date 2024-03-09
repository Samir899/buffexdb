package com.buffalo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.SampleDescription;


public interface SampleDescriptionRepository extends CrudRepository<SampleDescription, String>{

	@Query("SELECT u FROM SampleDescription u WHERE u.run = :run")
	public SampleDescription getSampleByRun(@Param("run") String run);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.condition_treatment = :condition_treatment")
	public List<SampleDescription> getSampleByConditionTreatment(@Param("condition_treatment") String condition_treatment);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.condition_treatment = :condition_treatment")
	public List<String> getRunIdByConditionTreatment(@Param("condition_treatment") String condition_treatment);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.breed = :breed")
	public List<SampleDescription> getSampleBybreed(@Param("breed") String breed);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.breed = :breed")
	public List<String> getRunIdByBreed(@Param("breed") String breed);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.development_stage = :development_stage")
	public List<SampleDescription> getSampleByDevelopmentStage(@Param("development_stage") String development_stage);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.development_stage = :development_stage")
	public List<String> getRunIdByDevelopmentStage(@Param("development_stage") String development_stage);
	
//	@Query("SELECT u FROM SampleDescription u WHERE u.source = :source")
//	public List<SampleDescription> getSampleBySource(@Param("source") String source);
//	
//	@Query("SELECT run FROM SampleDescription u WHERE u.source = :source")
//	public List<String> getRunIdBySource(@Param("source") String source);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.sub_species = :sub_species")
	public List<SampleDescription> getSampleBySpecies(@Param("sub_species") String species);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.sub_species = :sub_species")
	public List<String> getRunIdBySpecies(@Param("sub_species") String sub_species);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.tissue = :tissue")
	public List<SampleDescription> getSampleByTissues(@Param("tissue") String tissue);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.tissue = :tissue")
	public List<String> getRunIdByTissues(@Param("tissue") String tissue);
	
	@Query("SELECT u FROM SampleDescription u WHERE u.bioProject = :bioProject")
	public List<SampleDescription> getSampleByBioProject(@Param("bioProject") String bioProject);
	
	@Query("SELECT run FROM SampleDescription u WHERE u.bioProject = :bioProject")
	public List<String> getRunIdByBioProject(@Param("bioProject") String bioProject);
	
	@Query("SELECT run FROM SampleDescription")
	public List<String> getAllRunIds();
	
	@Query(value = "Select u from SampleDescription u where u.run In :sampleRunIds")
	public List<SampleDescription> getSampleDescriptionByRunIdList(List<String> sampleRunIds);
	
}
