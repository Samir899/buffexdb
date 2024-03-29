package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Brain;
import com.buffalo.entity.Cerebellum;
import com.buffalo.entity.Genes;

public interface CerebellumRepository extends CrudRepository<Cerebellum, Integer>{

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
	
	@Query("SELECT sum(ERR2353617) as ERR2353617, sum(ERR2353618) as ERR2353618, sum(ERR2353619) as ERR2353619,"
			+ " sum(ERR2353620) as ERR2353620, sum(ERR2353621) as ERR2353621, sum(ERR2353622) as ERR2353622,"
			+ " sum(ERR2353623) as ERR2353623, sum(ERR2354001) as ERR2354001, sum(ERR2354002) as ERR2354002, "
			+ "sum(ERR2354003) as ERR2354003, sum(ERR2354004) as ERR2354004, sum(ERR2354005) as ERR2354005, "
			+ "sum(ERR2354006) as ERR2354006, sum(ERR2354007) as ERR2354007, sum(ERR2354008) as ERR2354008, "
			+ "sum(ERR2354009) as ERR2354009, sum(ERR2352782) as ERR2352782, sum(ERR2352783) as ERR2352783, "
			+ "sum(ERR2352784) as ERR2352784, sum(ERR2352785) as ERR2352785, sum(ERR2352786) as ERR2352786, "
			+ "sum(ERR2352787) as ERR2352787, sum(ERR2352788) as ERR2352788, sum(ERR2353132) as ERR2353132, "
			+ "sum(ERR2353133) as ERR2353133, sum(ERR2353134) as ERR2353134, sum(ERR2353135) as ERR2353135, "
			+ "sum(ERR2353136) as ERR2353136, sum(ERR2353137) as ERR2353137, sum(ERR2353138) as ERR2353138, "
			+ "sum(ERR2353139) as ERR2353139, sum(ERR2353140) as ERR2353140, sum(SRR15721751) as SRR15721751, "
			+ "sum(SRR24057953) as SRR24057953, sum(SRR24057954) as SRR24057954, sum(SRR24057955) as SRR24057955, "
			+ "sum(SRR24057956) as SRR24057956 FROM Cerebellum")
	public Map <String, Double> getSum();
}
