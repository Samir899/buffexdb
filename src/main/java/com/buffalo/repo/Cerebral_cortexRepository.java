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
import com.buffalo.entity.Cerebral_cortex;
import com.buffalo.entity.Genes;

public interface Cerebral_cortexRepository extends CrudRepository<Cerebral_cortex, Integer>{
	
	@Query("SELECT u FROM Cerebral_cortex u WHERE u.SRR24057948>=:lowerLimit and u.SRR24057949>=:lowerLimit and u.SRR24057950>=:lowerLimit and u.SRR24057951>=:SRR24057951 and "
			+ "u.SRR24057948<=:upperLimit and u.SRR24057949<=:upperLimit and u.SRR24057950<=:upperLimit and u.SRR24057951<=:upperLimit "
			+ "ORDER BY SRR24057948, SRR24057949, SRR24057950, SRR24057951 LIMIT 50")
	public List<Cerebral_cortex> getCerebral_cortexSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(SRR24057948) as SRR24057948, sum(SRR24057949) as SRR24057949, sum(SRR24057950) as SRR24057950,"
			+ " sum(SRR24057951) as SRR24057951 FROM Cerebral_cortex")
	public Map <String, Double> getSum();
}
