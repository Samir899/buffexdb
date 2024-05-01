package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Adipose;
import com.buffalo.entity.Blood;
import com.buffalo.entity.Genes;

public interface AdiposeRepository extends CrudRepository<Adipose, Integer>{
	
	@Query("SELECT u FROM Adipose u WHERE u.SRR6949367>=:lowerLimit and u.SRR6949368>=:lowerLimit and u.SRR6949369>=:lowerLimit and u.SRR6949370>=:lowerLimit and u.SRR6949371>=:lowerLimit and u.SRR6949372>=:lowerLimit and u.SRR24057941>=:lowerLimit and u.SRR24057952>=:lowerLimit and u.SRR24057963>=:lowerLimit and u.SRR24057964>=:lowerLimit and "
			+ "u.SRR6949367<=:upperLimit and u.SRR6949368<=:upperLimit and u.SRR6949369<=:upperLimit and u.SRR6949370<=:upperLimit and u.SRR6949371<=:upperLimit and u.SRR6949372<=:upperLimit and u.SRR24057941<=:upperLimit and u.SRR24057952<=:upperLimit and u.SRR24057963<=:upperLimit and u.SRR24057964<=:upperLimit "
			+ " ORDER BY SRR6949367, SRR6949368, SRR6949369, SRR6949370, SRR6949371, SRR6949372, SRR24057941, SRR24057952, SRR24057963, SRR24057964 LIMIT 50")
	public List<Adipose> getAdiposeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR6949367) as SRR6949367, sum(SRR6949368) as SRR6949368, sum(SRR6949369) as SRR6949369, sum(SRR6949370) as SRR6949370,"
			+	"sum(SRR6949371) as SRR6949371, sum(SRR6949372) as SRR6949372, sum(SRR24057941) as SRR24057941, sum(SRR24057952) as SRR24057952,"
			+ "sum(SRR24057963) as SRR24057963, sum(SRR24057964) as SRR24057964 FROM Adipose")
	public Map <String, Double> getSum();
			
}
