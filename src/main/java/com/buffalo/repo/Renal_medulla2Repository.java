package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Blood;
import com.buffalo.entity.Genes;
import com.buffalo.entity.Renal_medulla2;

public interface Renal_medulla2Repository extends CrudRepository<Renal_medulla2, Integer>{
	
	@Query("SELECT u FROM Renal_medulla2 u WHERE u.ERR2354511>=:lowerLimit and u.ERR2354512>=:lowerLimit and u.ERR2354513>=:lowerLimit and u.ERR2354514>=:lowerLimit and u.ERR2354515>=:lowerLimit and u.ERR2354516>=:lowerLimit and u.ERR2354517>=:lowerLimit and u.ERR2354518>=:lowerLimit and u.ERR2354519>=:lowerLimit and u.ERR2354761>=:lowerLimit and u.ERR2354762>=:lowerLimit and u.ERR2354763>=:lowerLimit and u.ERR2354764>=:lowerLimit and u.ERR2354765>=:lowerLimit and u.ERR2354766>=:lowerLimit and u.ERR2354767>=:lowerLimit and u.ERR2354768>=:lowerLimit and u.ERR2354769>=:lowerLimit and u.ERR2354770>=:lowerLimit and u.ERR2354771>=:lowerLimit and u.ERR2354772>=:lowerLimit and u.ERR2354773>=:lowerLimit and u.ERR2354774>=:lowerLimit and u.ERR2354775>=:lowerLimit and u.ERR2354776>=:lowerLimit and u.ERR2354777>=:lowerLimit and u.ERR2354778>=:lowerLimit and u.ERR2354779>=:lowerLimit and u.ERR2354780>=:lowerLimit and u.ERR2354781>=:lowerLimit and u.ERR2354782>=:lowerLimit and u.ERR2354783>=:lowerLimit and u.ERR2354939>=:lowerLimit and u.ERR2354940>=:lowerLimit and u.ERR2354941>=:lowerLimit and u.ERR2354942>=:lowerLimit and u.ERR2354943>=:lowerLimit and u.ERR2354944>=:lowerLimit and u.ERR2354945>=:lowerLimit and u.ERR2354946>=:lowerLimit and u.ERR2354947>=:lowerLimit and u.ERR2354948>=:lowerLimit and u.ERR2354949>=:lowerLimit and u.ERR2354950>=:lowerLimit and u.ERR2354951>=:lowerLimit and u.ERR2354952>=:lowerLimit and u.ERR2354953>=:lowerLimit and u.ERR2354954>=:lowerLimit and u.ERR2354955>=:lowerLimit and u.ERR2354956>=:lowerLimit and u.ERR2354957>=:lowerLimit and u.ERR2354958>=:lowerLimit and u.ERR2354959>=:lowerLimit and u.ERR2354960>=:lowerLimit and u.ERR2354961>=:lowerLimit and "
			+ "u.ERR2354511<=:upperLimit and u.ERR2354512<=:upperLimit and u.ERR2354513<=:upperLimit and u.ERR2354514<=:upperLimit and u.ERR2354515<=:upperLimit and u.ERR2354516<=:upperLimit and u.ERR2354517<=:upperLimit and u.ERR2354518<=:upperLimit and u.ERR2354519<=:upperLimit and u.ERR2354761<=:upperLimit and u.ERR2354762<=:upperLimit and u.ERR2354763<=:upperLimit and u.ERR2354764<=:upperLimit and u.ERR2354765<=:upperLimit and u.ERR2354766<=:upperLimit and u.ERR2354767<=:upperLimit and u.ERR2354768<=:upperLimit and u.ERR2354769<=:upperLimit and u.ERR2354770<=:upperLimit and u.ERR2354771<=:upperLimit and u.ERR2354772<=:upperLimit and u.ERR2354773<=:upperLimit and u.ERR2354774<=:upperLimit and u.ERR2354775<=:upperLimit and u.ERR2354776<=:upperLimit and u.ERR2354777<=:upperLimit and u.ERR2354778<=:upperLimit and u.ERR2354779<=:upperLimit and u.ERR2354780<=:upperLimit and u.ERR2354781<=:upperLimit and u.ERR2354782<=:upperLimit and u.ERR2354783<=:upperLimit and u.ERR2354939<=:upperLimit and u.ERR2354940<=:upperLimit and u.ERR2354941<=:upperLimit and u.ERR2354942<=:upperLimit and u.ERR2354943<=:upperLimit and u.ERR2354944<=:upperLimit and u.ERR2354945<=:upperLimit and u.ERR2354946<=:upperLimit and u.ERR2354947<=:upperLimit and u.ERR2354948<=:upperLimit and u.ERR2354949<=:upperLimit and u.ERR2354950<=:upperLimit and u.ERR2354951<=:upperLimit and u.ERR2354952<=:upperLimit and u.ERR2354953<=:upperLimit and u.ERR2354954<=:upperLimit and u.ERR2354955<=:upperLimit and u.ERR2354956<=:upperLimit and u.ERR2354957<=:upperLimit and u.ERR2354958<=:upperLimit and u.ERR2354959<=:upperLimit and u.ERR2354960<=:upperLimit and u.ERR2354961<=:upperLimit "
			+ "ORDER BY ERR2354511, ERR2354512, ERR2354513, ERR2354514, ERR2354515, ERR2354516, ERR2354517, ERR2354518, ERR2354519, ERR2354761, ERR2354762, ERR2354763, ERR2354764, ERR2354765, ERR2354766, ERR2354767, ERR2354768, ERR2354769, ERR2354770, ERR2354771, ERR2354772, ERR2354773, ERR2354774, ERR2354775, ERR2354776, ERR2354777, ERR2354778, ERR2354779, ERR2354780, ERR2354781, ERR2354782, ERR2354783, ERR2354939, ERR2354940, ERR2354941, ERR2354942, ERR2354943, ERR2354944, ERR2354945, ERR2354946, ERR2354947, ERR2354948, ERR2354949, ERR2354950, ERR2354951, ERR2354952, ERR2354953, ERR2354954, ERR2354955, ERR2354956, ERR2354957, ERR2354958, ERR2354959, ERR2354960, ERR2354961 LIMIT 100")
	public List<Renal_medulla2> getRenal_medulla2Sorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
