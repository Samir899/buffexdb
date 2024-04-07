package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Hepatic_lymph_node;

public interface Hepatic_lymph_nodeRepository extends CrudRepository<Hepatic_lymph_node, Integer>{

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
	
	@Query("SELECT sum(SRR7540873) as SRR7540873, sum(SRR7540874) as SRR7540874, sum(SRR7540875) as SRR7540875, "
			+ "sum(SRR7540876) as SRR7540876, sum(SRR7540877) as SRR7540877, sum(SRR7540878) as SRR7540878, "
			+ "sum(SRR7540879) as SRR7540879, sum(SRR7540880) as SRR7540880, sum(SRR7540881) as SRR7540881, "
			+ "sum(SRR7540882) as SRR7540882, sum(SRR7540883) as SRR7540883, sum(SRR7540884) as SRR7540884, "
			+ "sum(SRR7540885) as SRR7540885, sum(SRR7540886) as SRR7540886, sum(SRR7540887) as SRR7540887, "
			+ "sum(SRR7540888) as SRR7540888, sum(SRR7540889) as SRR7540889, sum(SRR7540890) as SRR7540890 FROM Hepatic_lymph_node")
	public Map <String, Double> getSum();
}
