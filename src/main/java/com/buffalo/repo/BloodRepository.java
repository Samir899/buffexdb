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

public interface BloodRepository extends CrudRepository<Blood, Integer>{

	@Query("SELECT u FROM Blood u WHERE u.SRR14879259>=:lowerLimit and u.SRR14879260>=:lowerLimit and u.SRR14879261>=:lowerLimit  and u.SRR14879263>=:lowerLimit and u.SRR14879264>=:lowerLimit and u.SRR14879265>=:lowerLimit and u.SRR14879267>=:lowerLimit and u.SRR14879268>=:lowerLimit"
			+ " and u.SRR14879269>=:lowerLimit and u.SRR14879270>=:lowerLimit and u.SRR14879271>=:lowerLimit and u.SRR20281532>=:lowerLimit and u.SRR20281533>=:lowerLimit and u.SRR20281534>=:lowerLimit and u.SRR23563044>=:lowerLimit and u.SRR23563045>=:lowerLimit and u.SRR23563046>=:lowerLimit and u.SRR23563047>=:lowerLimit "
			+ "and u.SRR23563048>=:lowerLimit and u.SRR23563054>=:lowerLimit and u.SRR8494323>=:lowerLimit and u.SRR8494324>=:lowerLimit and u.SRR8494326>=:lowerLimit and u.SRR8494328>=:lowerLimit and u.SRR8494329>=:lowerLimit and u.SRR8494332>=:lowerLimit and u.SRR8494334>=:lowerLimit "
			+ "and u.SRR8494335>=:lowerLimit and u.SRR14879259<=:upperLimit and u.SRR14879260<=:upperLimit and u.SRR14879261<=:upperLimit  and u.SRR14879263<=:upperLimit and u.SRR14879264<=:upperLimit and u.SRR14879265<=:upperLimit and u.SRR14879267<=:upperLimit and u.SRR14879268<=:upperLimit"
			+ " and u.SRR14879269<=:upperLimit and u.SRR14879270<=:upperLimit and u.SRR14879271<=:upperLimit and u.SRR20281532<=:upperLimit and u.SRR20281533<=:upperLimit and u.SRR20281534<=:upperLimit and u.SRR23563044<=:upperLimit and u.SRR23563045<=:upperLimit and u.SRR23563046<=:upperLimit and u.SRR23563047<=:upperLimit"
			+ "	and u.SRR23563048<=:upperLimit and u.SRR23563054<=:upperLimit and u.SRR8494323<=:upperLimit and u.SRR8494324<=:upperLimit and u.SRR8494326<=:upperLimit and u.SRR8494328<=:upperLimit and u.SRR8494329<=:upperLimit and u.SRR8494332<=:upperLimit and u.SRR8494334<=:upperLimit"
			+ "	and u.SRR8494335<=:upperLimit"
			+ " ORDER BY SRR14879259, SRR14879260, SRR14879261, SRR14879263, SRR14879264, SRR14879265, SRR14879267, SRR14879268, SRR14879269, SRR14879270, "
			+ "SRR14879271, SRR20281532, SRR20281533, SRR20281534, SRR23563044, SRR23563045, SRR23563046, SRR23563047, SRR23563048, SRR23563054, SRR8494323, SRR8494324, SRR8494326,"
			+ "SRR8494328, SRR8494329, SRR8494332, SRR8494334, SRR8494335 LIMIT 50")
	public List<Blood> getBloodSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(SRR8494323) as SRR8494323, sum(SRR8494324) as SRR8494324, sum(SRR8494326) as SRR8494326,"
			+ " sum(SRR8494328) as SRR8494328, sum(SRR8494329) as SRR8494329, sum(SRR8494332) as SRR8494332, "
			+ "sum(SRR8494334) as SRR8494334, sum(SRR8494335) as SRR8494335, sum(SRR14879263) as SRR14879263, "
			+ "sum(SRR14879271) as SRR14879271, sum(SRR14879259) as SRR14879259, sum(SRR14879260) as SRR14879260, "
			+ "sum(SRR14879261) as SRR14879261, sum(SRR14879264) as SRR14879264, sum(SRR14879265) as SRR14879265, "
			+ "sum(SRR14879267) as SRR14879267, sum(SRR14879268) as SRR14879268, sum(SRR14879269) as SRR14879269, "
			+ "sum(SRR14879270) as SRR14879270, sum(SRR23563044) as SRR23563044, sum(SRR23563045) as SRR23563045, "
			+ "sum(SRR23563046) as SRR23563046, sum(SRR23563047) as SRR23563047, sum(SRR23563048) as SRR23563048, "
			+ "sum(SRR23563054) as SRR23563054 FROM Blood")
	public Map <String, Double> getSum();
}
