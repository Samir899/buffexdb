package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Popliteal_lymph_node;

public interface Popliteal_lymph_nodeRepository extends CrudRepository<Popliteal_lymph_node, Integer>{
	
	@Query("SELECT u FROM Popliteal_lymph_node u WHERE u.ERR2353433>=:lowerLimit and u.ERR2353435>=:lowerLimit and u.ERR2353436>=:lowerLimit and u.ERR2353437>=:lowerLimit and u.ERR2353438>=:lowerLimit and u.ERR2353439>=:lowerLimit and u.ERR2353440>=:lowerLimit and u.ERR2353441>=:lowerLimit and "
			+ "u.ERR2353433<=:upperLimit and u.ERR2353435<=:upperLimit and u.ERR2353436<=:upperLimit and u.ERR2353437<=:upperLimit and u.ERR2353438<=:upperLimit and u.ERR2353439<=:upperLimit and u.ERR2353440<=:upperLimit and u.ERR2353441<=:upperLimit "
			+ "ORDER BY ERR2353433, ERR2353435, ERR2353436, ERR2353437, ERR2353438, ERR2353439, ERR2353440, ERR2353441 LIMIT 100")
	public List<Popliteal_lymph_node> getPopliteal_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353433) as ERR2353433, sum(ERR2353435) as ERR2353435, sum(ERR2353436) as ERR2353436, sum(ERR2353437) as ERR2353437, sum(ERR2353438) as ERR2353438, sum(ERR2353439) as ERR2353439, sum(ERR2353440) as ERR2353440, sum(ERR2353441) as ERR2353441 FROM Popliteal_lymph_node")
	public Map <String, Double> getSum();
}
