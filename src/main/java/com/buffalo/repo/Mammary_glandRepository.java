package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Mammary_gland;

public interface Mammary_glandRepository extends CrudRepository<Mammary_gland, Integer>{
	
	@Query("SELECT u FROM Mammary_gland u WHERE u.ERR315636>=:lowerLimit and u.SRR7523531>=:lowerLimit and u.SRR7523532>=:lowerLimit and u.SRR7523533>=:lowerLimit and u.SRR7523534>=:lowerLimit and u.SRR7523535>=:lowerLimit and u.SRR7523536>=:lowerLimit and u.SRR7523537>=:lowerLimit and u.SRR7523538>=:lowerLimit and u.SRR24057921>=:lowerLimit and u.SRR24057922>=:lowerLimit and u.SRR24057923>=:lowerLimit and u.SRR24057924>=:lowerLimit and\r\n"
			+ "u.ERR315636<=:upperLimit and u.SRR7523531<=:upperLimit and u.SRR7523532<=:upperLimit and u.SRR7523533<=:upperLimit and u.SRR7523534<=:upperLimit and u.SRR7523535<=:upperLimit and u.SRR7523536<=:upperLimit and u.SRR7523537<=:upperLimit and u.SRR7523538<=:upperLimit and u.SRR24057921<=:upperLimit and u.SRR24057922<=:upperLimit and u.SRR24057923<=:upperLimit and u.SRR24057924<=:upperLimit "
			+ "ORDER BY ERR315636, SRR7523531, SRR7523532, SRR7523533, SRR7523534, SRR7523535, SRR7523536, SRR7523537, SRR7523538, SRR24057921, SRR24057922, SRR24057923, SRR24057924 LIMIT 100")
	public List<Mammary_gland> getMammary_glandSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
