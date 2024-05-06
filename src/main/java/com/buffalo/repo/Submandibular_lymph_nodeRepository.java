package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Submandibular_lymph_node;

public interface Submandibular_lymph_nodeRepository extends CrudRepository<Submandibular_lymph_node, Integer>{
	
	@Query("SELECT u FROM Submandibular_lymph_node u WHERE u.ERR2353528>=:lowerLimit and u.ERR2353529>=:lowerLimit and u.ERR2353530>=:lowerLimit and u.ERR2353531>=:lowerLimit and u.ERR2353532>=:lowerLimit and u.ERR2353533>=:lowerLimit and u.ERR2353534>=:lowerLimit and u.ERR2353535>=:lowerLimit and u.ERR2353536>=:lowerLimit and u.ERR2354347>=:lowerLimit and u.ERR2354348>=:lowerLimit and u.ERR2354349>=:lowerLimit and u.ERR2354350>=:lowerLimit and u.ERR2354351>=:lowerLimit and u.ERR2354352>=:lowerLimit and u.ERR2354353>=:lowerLimit and u.ERR2354354>=:lowerLimit and u.ERR2354355>=:lowerLimit and u.ERR2354912>=:lowerLimit and u.ERR2354913>=:lowerLimit and u.ERR2354914>=:lowerLimit and u.ERR2354915>=:lowerLimit and u.ERR2354916>=:lowerLimit and u.ERR2354917>=:lowerLimit and u.ERR2354918>=:lowerLimit and u.ERR2354919>=:lowerLimit and u.ERR2354920>=:lowerLimit and "
			+ "u.ERR2353528<=:upperLimit and u.ERR2353529<=:upperLimit and u.ERR2353530<=:upperLimit and u.ERR2353531<=:upperLimit and u.ERR2353532<=:upperLimit and u.ERR2353533<=:upperLimit and u.ERR2353534<=:upperLimit and u.ERR2353535<=:upperLimit and u.ERR2353536<=:upperLimit and u.ERR2354347<=:upperLimit and u.ERR2354348<=:upperLimit and u.ERR2354349<=:upperLimit and u.ERR2354350<=:upperLimit and u.ERR2354351<=:upperLimit and u.ERR2354352<=:upperLimit and u.ERR2354353<=:upperLimit and u.ERR2354354<=:upperLimit and u.ERR2354355<=:upperLimit and u.ERR2354912<=:upperLimit and u.ERR2354913<=:upperLimit and u.ERR2354914<=:upperLimit and u.ERR2354915<=:upperLimit and u.ERR2354916<=:upperLimit and u.ERR2354917<=:upperLimit and u.ERR2354918<=:upperLimit and u.ERR2354919<=:upperLimit and u.ERR2354920<=:upperLimit "
			+ "ORDER BY ERR2353528, ERR2353529, ERR2353530, ERR2353531, ERR2353532, ERR2353533, ERR2353534, ERR2353535, ERR2353536, ERR2354347, ERR2354348, ERR2354349, ERR2354350, ERR2354351, ERR2354352, ERR2354353, ERR2354354, ERR2354355, ERR2354912, ERR2354913, ERR2354914, ERR2354915, ERR2354916, ERR2354917, ERR2354918, ERR2354919, ERR2354920 LIMIT 100")
	public List<Submandibular_lymph_node> getSubmandibular_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

//	@Query("SELECT u FROM Genes u WHERE u.geneId = :geneId")
//	public Genes getGeneByGeneId(@Param("geneId") String geneId);
//	
//	@Query("SELECT u FROM Genes u WHERE u.geneName = :geneName")
//	public List<Genes> getGeneByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.geneName = :geneName")
//	public List<String> getGeneIdByGeneName(@Param("geneName") String geneName);
//	
//	@Query("SELECT u FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<Genes> getGeneByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.chromosome = :chromosome")
//	public List<String> getGeneIdByChromosome(@Param("chromosome") String chromosome);
//	
//	@Query("SELECT u FROM Genes u WHERE u.strand = :strand")
//	public List<Genes> getGeneByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes u WHERE u.strand = :strand")
//	public List<String> getGeneIdByStrand(@Param("strand") String strand);
//	
//	@Query("SELECT geneId FROM Genes")
//	public List<String> getAllGeneId();
//	
//	@Query(value = "Select u from Genes u where u.geneId In :geneIds")
//	public List<Genes> getGenesByGeneList(List<String> geneIds);
	
	@Query("SELECT sum(ERR2353528) as ERR2353528, sum(ERR2353529) as ERR2353529, sum(ERR2353530) as ERR2353530, sum(ERR2353531) as ERR2353531, sum(ERR2353532) as ERR2353532, sum(ERR2353533) as ERR2353533, sum(ERR2353534) as ERR2353534, sum(ERR2353535) as ERR2353535, sum(ERR2353536) as ERR2353536, sum(ERR2354347) as ERR2354347, sum(ERR2354348) as ERR2354348, sum(ERR2354349) as ERR2354349, sum(ERR2354350) as ERR2354350, sum(ERR2354351) as ERR2354351, sum(ERR2354352) as ERR2354352, sum(ERR2354353) as ERR2354353, sum(ERR2354354) as ERR2354354, sum(ERR2354355) as ERR2354355, sum(ERR2354912) as ERR2354912, sum(ERR2354913) as ERR2354913, sum(ERR2354914) as ERR2354914, sum(ERR2354915) as ERR2354915, sum(ERR2354916) as ERR2354916, sum(ERR2354917) as ERR2354917, sum(ERR2354918) as ERR2354918, sum(ERR2354919) as ERR2354919, sum(ERR2354920) as ERR2354920 FROM Submandibular_lymph_node")
	public Map <String, Double> getSum();
}
