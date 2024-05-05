package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.buffalo.entity.Genes;
import com.buffalo.entity.Renal_medulla1;

public interface Renal_medulla1Repository extends CrudRepository<Renal_medulla1, Integer>{

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
	
	@Query("SELECT sum(ERR2352642) as ERR2352642, sum(ERR2352643) as ERR2352643, sum(ERR2352644) as ERR2352644, "
			+ "sum(ERR2352645) as ERR2352645, sum(ERR2352646) as ERR2352646, sum(ERR2352647) as ERR2352647, "
			+ "sum(ERR2352648) as ERR2352648, sum(ERR2352649) as ERR2352649, sum(ERR2352650) as ERR2352650, "
			+ "sum(ERR2352651) as ERR2352651, sum(ERR2352652) as ERR2352652, sum(ERR2352653) as ERR2352653, "
			+ "sum(ERR2352654) as ERR2352654, sum(ERR2352655) as ERR2352655, sum(ERR2352656) as ERR2352656, "
			+ "sum(ERR2352657) as ERR2352657, sum(ERR2352658) as ERR2352658, sum(ERR2352659) as ERR2352659, "
			+ "sum(ERR2352660) as ERR2352660, sum(ERR2352661) as ERR2352661, sum(ERR2352662) as ERR2352662, "
			+ "sum(ERR2352663) as ERR2352663, sum(ERR2352664) as ERR2352664, sum(ERR2352849) as ERR2352849, "
			+ "sum(ERR2352850) as ERR2352850, sum(ERR2352851) as ERR2352851, sum(ERR2352852) as ERR2352852, "
			+ "sum(ERR2352853) as ERR2352853, sum(ERR2352854) as ERR2352854, sum(ERR2352855) as ERR2352855, "
			+ "sum(ERR2352857) as ERR2352857, sum(ERR2353218) as ERR2353218, sum(ERR2353219) as ERR2353219, "
			+ "sum(ERR2353220) as ERR2353220, sum(ERR2353221) as ERR2353221, sum(ERR2353222) as ERR2353222, "
			+ "sum(ERR2353223) as ERR2353223, sum(ERR2353224) as ERR2353224, sum(ERR2353225) as ERR2353225, "
			+ "sum(ERR2353226) as ERR2353226, sum(ERR2353227) as ERR2353227, sum(ERR2353228) as ERR2353228, "
			+ "sum(ERR2353229) as ERR2353229, sum(ERR2353230) as ERR2353230, sum(ERR2353231) as ERR2353231, "
			+ "sum(ERR2353232) as ERR2353232, sum(ERR2353233) as ERR2353233, sum(ERR2353234) as ERR2353234, "
			+ "sum(ERR2353235) as ERR2353235, sum(ERR2353236) as ERR2353236, sum(ERR2353237) as ERR2353237, "
			+ "sum(ERR2353238) as ERR2353238, sum(ERR2353239) as ERR2353239, sum(ERR2353240) as ERR2353240, "
			+ "sum(ERR2353700) as ERR2353700, sum(ERR2353701) as ERR2353701, sum(ERR2353702) as ERR2353702, "
			+ "sum(ERR2353703) as ERR2353703, sum(ERR2353704) as ERR2353704, sum(ERR2353705) as ERR2353705, "
			+ "sum(ERR2353706) as ERR2353706, sum(ERR2353707) as ERR2353707, sum(ERR2353708) as ERR2353708, "
			+ "sum(ERR2354078) as ERR2354078, sum(ERR2354079) as ERR2354079, sum(ERR2354080) as ERR2354080, "
			+ "sum(ERR2354081) as ERR2354081, sum(ERR2354082) as ERR2354082, sum(ERR2354083) as ERR2354083, "
			+ "sum(ERR2354084) as ERR2354084, sum(ERR2354085) as ERR2354085, sum(ERR2354086) as ERR2354086, "
			+ "sum(ERR2354087) as ERR2354087, sum(ERR2354088) as ERR2354088, sum(ERR2354089) as ERR2354089, "
			+ "sum(ERR2354090) as ERR2354090, sum(ERR2354091) as ERR2354091, sum(ERR2354092) as ERR2354092, "
			+ "sum(ERR2354093) as ERR2354093, sum(ERR2354094) as ERR2354094, sum(ERR2354095) as ERR2354095, "
			+ "sum(ERR2354096) as ERR2354096, sum(ERR2354097) as ERR2354097, sum(ERR2354098) as ERR2354098, "
			+ "sum(ERR2354099) as ERR2354099, sum(ERR2354100) as ERR2354100, sum(ERR2354497) as ERR2354497, "
			+ "sum(ERR2354498) as ERR2354498, sum(ERR2354499) as ERR2354499, sum(ERR2354500) as ERR2354500, "
			+ "sum(ERR2354501) as ERR2354501, sum(ERR2354502) as ERR2354502, sum(ERR2354503) as ERR2354503, "
			+ "sum(ERR2354504) as ERR2354504, sum(ERR2354505) as ERR2354505, sum(ERR2354506) as ERR2354506, "
			+ "sum(ERR2354507) as ERR2354507, sum(ERR2354508) as ERR2354508, sum(ERR2354509) as ERR2354509, "
			+ "sum(ERR2354510) as ERR2354510 FROM Renal_medulla1")
	public Map <String, Double> getSum();
}
