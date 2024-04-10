package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Mammary_gland;

public interface Mammary_glandRepository extends CrudRepository<Mammary_gland, Integer>{

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
	
	@Query("SELECT sum(ERR315636) as ERR315636, sum(SRR24057921) as SRR24057921, sum(SRR24057922) as SRR24057922, "
			+ "sum(SRR24057923) as SRR24057923, sum(SRR24057924) as SRR24057924, sum(SRR7523531) as SRR7523531, "
			+ "sum(SRR7523532) as SRR7523532, sum(SRR7523533) as SRR7523533, sum(SRR7523534) as SRR7523534, "
			+ "sum(SRR7523535) as SRR7523535, sum(SRR7523536) as SRR7523536, sum(SRR7523537) as SRR7523537, "
			+ "sum(SRR7523538) as SRR7523538 FROM Mammary_gland")
	public Map <String, Double> getSum();
}
