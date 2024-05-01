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

public interface BrainRepository extends CrudRepository<Brain, Integer>{
	
	@Query("SELECT u FROM Brain u WHERE u.SRR15721738>=:lowerLimit and u.SRR15721741>=:lowerLimit and u.SRR15721752>=:lowerLimit and u.SRR15721753>=:lowerLimit and u.SRR15721754>=:lowerLimit and u.SRR15721756>=:lowerLimit and u.SRR15721757>=:lowerLimit and u.SRR15721761>=:lowerLimit and "
			+ "u.SRR15721738<=:upperLimit and u.SRR15721741<=:upperLimit and u.SRR15721752<=:upperLimit and u.SRR15721753<=:upperLimit and u.SRR15721754<=:upperLimit and u.SRR15721756<=:upperLimit and u.SRR15721757<=:upperLimit and u.SRR15721761<=:upperLimit "
			+ "ORDER BY SRR15721738, SRR15721741, SRR15721752, SRR15721753, SRR15721754, SRR15721756, SRR15721757, SRR15721761 LIMIT 50")
	public List<Brain> getBrainSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR15721738) as SRR15721738, sum(SRR15721741) as SRR15721741, "
			+ "sum(SRR15721752) as SRR15721752, sum(SRR15721753) as SRR15721753, "
			+ "sum(SRR15721754) as SRR15721754, sum(SRR15721756) as SRR15721756, "
			+ "sum(SRR15721757) as SRR15721757, sum(SRR15721761) as SRR15721761 FROM Brain")
	public Map <String, Double> getSum();
}
