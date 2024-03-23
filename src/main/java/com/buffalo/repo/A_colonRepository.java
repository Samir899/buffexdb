package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.A_colon;
import com.buffalo.entity.Genes;

public interface A_colonRepository extends CrudRepository<A_colon, Integer>{

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
	
	@Query("SELECT sum(ERR2352796) as ERR2352796, sum(ERR2352797) as ERR2352797, "
			+ "sum(ERR2352798) as ERR2352798, sum(ERR2352799) as ERR2352799, sum(ERR2352800) as ERR2352800,"
			+ "sum(ERR2352801) as ERR2352801, sum(ERR2352802) as ERR2352802, sum(ERR2353150) as ERR2353150,"
			+ "sum(ERR2353151) as ERR2353151, sum(ERR2353152) as ERR2353152, sum(ERR2353153) as ERR2353153, "
			+ "sum(ERR2353154) as ERR2353154, sum(ERR2353155) as ERR2353155, sum(ERR2353156) as ERR2353156,"
			+ "sum(ERR2353157) as ERR2353157, sum(ERR2353158) as ERR2353158, sum(ERR2353631) as ERR2353631,"
			+ "sum(ERR2353632) as ERR2353632, sum(ERR2353633) as ERR2353633, sum(ERR2353634) as ERR2353634,"
			+ "sum(ERR2353635) as ERR2353635, sum(ERR2353636) as ERR2353636, sum(ERR2353637) as ERR2353637,"
			+ "sum(ERR2354010) as ERR2354010, sum(ERR2354011) as ERR2354011, sum(ERR2354012) as ERR2354012,"
			+ "sum(ERR2354013) as ERR2354013, sum(ERR2354014) as ERR2354014, sum(ERR2354015) as ERR2354015,"
			+ "sum(ERR2354016) as ERR2354016, sum(ERR2354017) as ERR2354017, sum(ERR2354018) as ERR2354018 FROM A_colon")
	public Map <String, Double> getSum();
}
