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
import com.buffalo.entity.Cerebellum;
import com.buffalo.entity.Genes;

public interface CerebellumRepository extends CrudRepository<Cerebellum, Integer>{
	
	@Query("SELECT u FROM Cerebellum u WHERE u.ERR2353617>=:lowerLimit and u.ERR2353618>=:lowerLimit and u.ERR2353619>=:lowerLimit and u.ERR2353620>=:lowerLimit and u.ERR2353621>=:lowerLimit and u.ERR2353622>=:lowerLimit and u.ERR2353623>=:lowerLimit and u.ERR2354001>=:lowerLimit and u.ERR2354002>=:lowerLimit and u.ERR2354003>=:lowerLimit and u.ERR2354004>=:lowerLimit and u.ERR2354005>=:lowerLimit and u.ERR2354006>=:lowerLimit and u.ERR2354007>=:lowerLimit and u.ERR2354008>=:lowerLimit and u.ERR2354009>=:lowerLimit and u.ERR2352782>=:lowerLimit and u.ERR2352783>=:lowerLimit and u.ERR2352784>=:lowerLimit and u.ERR2352785>=:lowerLimit and u.ERR2352786>=:lowerLimit and u.ERR2352787>=:lowerLimit and u.ERR2352788>=:lowerLimit and u.ERR2353132>=:lowerLimit and u.ERR2353133>=:lowerLimit and u.ERR2353134>=:lowerLimit and u.ERR2353135>=:lowerLimit and u.ERR2353136>=:lowerLimit and u.ERR2353137>=:lowerLimit and u.ERR2353138>=:lowerLimit and u.ERR2353139>=:lowerLimit and u.ERR2353140>=:lowerLimit and u.SRR15721751>=:lowerLimit and u.SRR24057953>=:lowerLimit and u.SRR24057954>=:lowerLimit and u.SRR24057955>=:lowerLimit and u.SRR24057956>=:lowerLimit and "
			+ "u.ERR2353617<=:upperLimit and u.ERR2353618<=:upperLimit and u.ERR2353619<=:upperLimit and u.ERR2353620<=:upperLimit and u.ERR2353621<=:upperLimit and u.ERR2353622<=:upperLimit and u.ERR2353623<=:upperLimit and u.ERR2354001<=:upperLimit and u.ERR2354002<=:upperLimit and u.ERR2354003<=:upperLimit and u.ERR2354004<=:upperLimit and u.ERR2354005<=:upperLimit and u.ERR2354006<=:upperLimit and u.ERR2354007<=:upperLimit and u.ERR2354008<=:upperLimit and u.ERR2354009<=:upperLimit and u.ERR2352782<=:upperLimit and u.ERR2352783<=:upperLimit and u.ERR2352784<=:upperLimit and u.ERR2352785<=:upperLimit and u.ERR2352786<=:upperLimit and u.ERR2352787<=:upperLimit and u.ERR2352788<=:upperLimit and u.ERR2353132<=:upperLimit and u.ERR2353133<=:upperLimit and u.ERR2353134<=:upperLimit and u.ERR2353135<=:upperLimit and u.ERR2353136<=:upperLimit and u.ERR2353137<=:upperLimit and u.ERR2353138<=:upperLimit and u.ERR2353139<=:upperLimit and u.ERR2353140<=:upperLimit and u.SRR15721751<=:upperLimit and u.SRR24057953<=:upperLimit and u.SRR24057954<=:upperLimit and u.SRR24057955<=:upperLimit and u.SRR24057956<=:upperLimit "
			+ "ORDER BY ERR2353617, ERR2353618, ERR2353619, ERR2353620, ERR2353621, ERR2353622, ERR2353623, ERR2354001, ERR2354002, ERR2354003, ERR2354004, ERR2354005, ERR2354006, ERR2354007, ERR2354008, ERR2354009, ERR2352782, ERR2352783, ERR2352784, ERR2352785, ERR2352786, ERR2352787, ERR2352788, ERR2353132, ERR2353133, ERR2353134, ERR2353135, ERR2353136, ERR2353137, ERR2353138, ERR2353139, ERR2353140, SRR15721751, SRR24057953, SRR24057954, SRR24057955, SRR24057956 LIMIT 50")
	public List<Cerebellum> getCerebellumSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
