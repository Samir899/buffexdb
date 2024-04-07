package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Renal_medulla2;

public interface Renal_medulla2Repository extends CrudRepository<Renal_medulla2, Integer>{

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
	
	@Query("SELECT sum(ERR2354511) as ERR2354511, sum(ERR2354512) as ERR2354512, sum(ERR2354513) as ERR2354513, "
			+ "sum(ERR2354514) as ERR2354514, sum(ERR2354515) as ERR2354515, sum(ERR2354516) as ERR2354516, "
			+ "sum(ERR2354517) as ERR2354517, sum(ERR2354518) as ERR2354518, sum(ERR2354519) as ERR2354519, "
			+ "sum(ERR2354761) as ERR2354761, sum(ERR2354762) as ERR2354762, sum(ERR2354763) as ERR2354763, "
			+ "sum(ERR2354764) as ERR2354764, sum(ERR2354765) as ERR2354765, sum(ERR2354766) as ERR2354766, "
			+ "sum(ERR2354767) as ERR2354767, sum(ERR2354768) as ERR2354768, sum(ERR2354769) as ERR2354769, "
			+ "sum(ERR2354770) as ERR2354770, sum(ERR2354771) as ERR2354771, sum(ERR2354772) as ERR2354772, "
			+ "sum(ERR2354773) as ERR2354773, sum(ERR2354774) as ERR2354774, sum(ERR2354775) as ERR2354775, "
			+ "sum(ERR2354776) as ERR2354776, sum(ERR2354777) as ERR2354777, sum(ERR2354778) as ERR2354778, "
			+ "sum(ERR2354779) as ERR2354779, sum(ERR2354780) as ERR2354780, sum(ERR2354781) as ERR2354781, "
			+ "sum(ERR2354782) as ERR2354782, sum(ERR2354783) as ERR2354783, sum(ERR2354939) as ERR2354939, "
			+ "sum(ERR2354940) as ERR2354940, sum(ERR2354941) as ERR2354941, sum(ERR2354942) as ERR2354942, "
			+ "sum(ERR2354943) as ERR2354943, sum(ERR2354944) as ERR2354944, sum(ERR2354945) as ERR2354945, "
			+ "sum(ERR2354946) as ERR2354946, sum(ERR2354947) as ERR2354947, sum(ERR2354948) as ERR2354948, "
			+ "sum(ERR2354949) as ERR2354949, sum(ERR2354950) as ERR2354950, sum(ERR2354951) as ERR2354951, "
			+ "sum(ERR2354952) as ERR2354952, sum(ERR2354953) as ERR2354953, sum(ERR2354954) as ERR2354954, "
			+ "sum(ERR2354955) as ERR2354955, sum(ERR2354956) as ERR2354956, sum(ERR2354957) as ERR2354957, "
			+ "sum(ERR2354958) as ERR2354958, sum(ERR2354959) as ERR2354959, sum(ERR2354960) as ERR2354960, "
			+ "sum(ERR2354961) as ERR2354961 FROM Renal_medulla2")
	public Map <String, Double> getSum();
}
