package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Genes;
import com.buffalo.entity.Longissimus_thoracis;

public interface Longissimus_thoracisRepository extends CrudRepository<Longissimus_thoracis, Integer>{

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
	
	@Query("SELECT sum(ERR2353718) as ERR2353718, sum(ERR2353719) as ERR2353719, sum(ERR2353720) as ERR2353720, sum(ERR2353721) as ERR2353721, sum(ERR2353722) as ERR2353722, sum(ERR2353723) as ERR2353723, sum(ERR2353724) as ERR2353724, sum(ERR2353725) as ERR2353725, "
			+ "sum(ERR2353726) as ERR2353726, sum(ERR2354124) as ERR2354124, sum(ERR2354125) as ERR2354125, sum(ERR2354126) as ERR2354126, sum(ERR2354127) as ERR2354127, sum(ERR2354128) as ERR2354128, sum(ERR2354130) as ERR2354130, sum(ERR2354131) as ERR2354131, "
			+ "sum(ERR2354132) as ERR2354132, sum(ERR2354133) as ERR2354133, sum(ERR2354134) as ERR2354134, sum(ERR2354135) as ERR2354135, sum(ERR2354136) as ERR2354136, sum(ERR2354137) as ERR2354137, sum(ERR2354138) as ERR2354138, sum(ERR2354139) as ERR2354139,"
			+ " sum(ERR2354140) as ERR2354140, sum(ERR2354141) as ERR2354141, sum(ERR2354142) as ERR2354142, sum(ERR2354143) as ERR2354143, sum(ERR2354144) as ERR2354144, sum(ERR2354145) as ERR2354145, sum(ERR2354146) as ERR2354146, sum(ERR2352867) as ERR2352867,"
			+ " sum(ERR2352868) as ERR2352868, sum(ERR2352869) as ERR2352869, sum(ERR2352870) as ERR2352870, sum(ERR2352871) as ERR2352871, sum(ERR2352872) as ERR2352872, sum(ERR2352873) as ERR2352873, sum(ERR2352874) as ERR2352874, sum(ERR2352875) as ERR2352875, "
			+ "sum(ERR2353264) as ERR2353264, sum(ERR2353266) as ERR2353266, sum(ERR2353267) as ERR2353267, sum(ERR2353268) as ERR2353268, sum(ERR2353269) as ERR2353269, sum(ERR2353270) as ERR2353270, sum(ERR2353271) as ERR2353271, "
			+ "sum(ERR2353272) as ERR2353272, sum(ERR2353273) as ERR2353273, sum(ERR2353274) as ERR2353274, sum(ERR2353275) as ERR2353275, sum(ERR2353276) as ERR2353276, sum(ERR2353277) as ERR2353277, sum(ERR2353278) as ERR2353278, sum(ERR2353279) as ERR2353279, "
			+ "sum(ERR2353280) as ERR2353280, sum(ERR2353281) as ERR2353281, sum(ERR2353282) as ERR2353282, sum(ERR2353283) as ERR2353283, sum(ERR2353284) as ERR2353284, sum(ERR2353285) as ERR2353285, sum(ERR2353286) as ERR2353286 FROM Longissimus_thoracis")
	
	public Map <String, Double> getSum();
}
