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
import com.buffalo.entity.Intestinal_lymph_node;

public interface Intestinal_lymph_nodeRepository extends CrudRepository<Intestinal_lymph_node, Integer>{

	@Query("SELECT u FROM Intestinal_lymph_node u WHERE u.SRR24057892>=:lowerLimit and u.SRR24057893>=:lowerLimit and u.SRR24057961>=:lowerLimit and u.SRR24057962>=:lowerLimit and u.SRR24057892<=:upperLimit and u.SRR24057893<=:upperLimit and u.SRR24057961<=:upperLimit and u.SRR24057962<=:upperLimit "
			+ " ORDER BY SRR24057892, SRR24057893, SRR24057961, SRR24057962 LIMIT 50")
	public List<Intestinal_lymph_node> getIntestinal_lymph_nodeSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);
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
	
	@Query("SELECT sum(SRR24057892) as SRR24057892, sum(SRR24057893) as SRR24057893, sum(SRR24057961) as SRR24057961,"
			+ " sum(SRR24057962) as SRR24057962 FROM Intestinal_lymph_node")
	public Map <String, Double> getSum();
}
