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
import com.buffalo.entity.Longissimus_thoracis;

public interface Longissimus_thoracisRepository extends CrudRepository<Longissimus_thoracis, Integer>{
	
	@Query("SELECT u FROM Longissimus_thoracis u WHERE u.ERR2353718>=:lowerLimit and u.ERR2353719>=:lowerLimit and u.ERR2353720>=:lowerLimit and u.ERR2353721>=:lowerLimit and u.ERR2353722>=:lowerLimit and u.ERR2353723>=:lowerLimit and u.ERR2353724>=:lowerLimit and u.ERR2353725>=:lowerLimit and u.ERR2353726>=:lowerLimit and u.ERR2354124>=:lowerLimit and u.ERR2354125>=:lowerLimit and u.ERR2354126>=:lowerLimit and u.ERR2354127>=:lowerLimit and u.ERR2354128>=:lowerLimit and u.ERR2354130>=:lowerLimit and u.ERR2354131>=:lowerLimit and u.ERR2354132>=:lowerLimit and u.ERR2354133>=:lowerLimit and u.ERR2354134>=:lowerLimit and u.ERR2354135>=:lowerLimit and u.ERR2354136>=:lowerLimit and u.ERR2354137>=:lowerLimit and u.ERR2354138>=:lowerLimit and u.ERR2354139>=:lowerLimit and u.ERR2354140>=:lowerLimit and u.ERR2354141>=:lowerLimit and u.ERR2354142>=:lowerLimit and u.ERR2354143>=:lowerLimit and u.ERR2354144>=:lowerLimit and u.ERR2354145>=:lowerLimit and u.ERR2354146>=:lowerLimit and u.ERR2352867>=:lowerLimit and u.ERR2352868>=:lowerLimit and u.ERR2352869>=:lowerLimit and u.ERR2352870>=:lowerLimit and u.ERR2352871>=:lowerLimit and u.ERR2352872>=:lowerLimit and u.ERR2352873>=:lowerLimit and u.ERR2352874>=:lowerLimit and u.ERR2352875>=:lowerLimit and u.ERR2353264>=:lowerLimit and u.ERR2353266>=:lowerLimit and u.ERR2353267>=:lowerLimit and u.ERR2353268>=:lowerLimit and u.ERR2353269>=:lowerLimit and u.ERR2353270>=:lowerLimit and u.ERR2353271>=:lowerLimit and u.ERR2353272>=:lowerLimit and u.ERR2353273>=:lowerLimit and u.ERR2353274>=:lowerLimit and u.ERR2353275>=:lowerLimit and u.ERR2353276>=:lowerLimit and u.ERR2353277>=:lowerLimit and u.ERR2353278>=:lowerLimit and u.ERR2353279>=:lowerLimit and u.ERR2353280>=:lowerLimit and u.ERR2353281>=:lowerLimit and u.ERR2353282>=:lowerLimit and u.ERR2353283>=:lowerLimit and u.ERR2353284>=:lowerLimit and u.ERR2353285>=:lowerLimit and u.ERR2353286>=:lowerLimit and "
			+ "u.ERR2353718<=:upperLimit and u.ERR2353719<=:upperLimit and u.ERR2353720<=:upperLimit and u.ERR2353721<=:upperLimit and u.ERR2353722<=:upperLimit and u.ERR2353723<=:upperLimit and u.ERR2353724<=:upperLimit and u.ERR2353725<=:upperLimit and u.ERR2353726<=:upperLimit and u.ERR2354124<=:upperLimit and u.ERR2354125<=:upperLimit and u.ERR2354126<=:upperLimit and u.ERR2354127<=:upperLimit and u.ERR2354128<=:upperLimit and u.ERR2354130<=:upperLimit and u.ERR2354131<=:upperLimit and u.ERR2354132<=:upperLimit and u.ERR2354133<=:upperLimit and u.ERR2354134<=:upperLimit and u.ERR2354135<=:upperLimit and u.ERR2354136<=:upperLimit and u.ERR2354137<=:upperLimit and u.ERR2354138<=:upperLimit and u.ERR2354139<=:upperLimit and u.ERR2354140<=:upperLimit and u.ERR2354141<=:upperLimit and u.ERR2354142<=:upperLimit and u.ERR2354143<=:upperLimit and u.ERR2354144<=:upperLimit and u.ERR2354145<=:upperLimit and u.ERR2354146<=:upperLimit and u.ERR2352867<=:upperLimit and u.ERR2352868<=:upperLimit and u.ERR2352869<=:upperLimit and u.ERR2352870<=:upperLimit and u.ERR2352871<=:upperLimit and u.ERR2352872<=:upperLimit and u.ERR2352873<=:upperLimit and u.ERR2352874<=:upperLimit and u.ERR2352875<=:upperLimit and u.ERR2353264<=:upperLimit and u.ERR2353266<=:upperLimit and u.ERR2353267<=:upperLimit and u.ERR2353268<=:upperLimit and u.ERR2353269<=:upperLimit and u.ERR2353270<=:upperLimit and u.ERR2353271<=:upperLimit and u.ERR2353272<=:upperLimit and u.ERR2353273<=:upperLimit and u.ERR2353274<=:upperLimit and u.ERR2353275<=:upperLimit and u.ERR2353276<=:upperLimit and u.ERR2353277<=:upperLimit and u.ERR2353278<=:upperLimit and u.ERR2353279<=:upperLimit and u.ERR2353280<=:upperLimit and u.ERR2353281<=:upperLimit and u.ERR2353282<=:upperLimit and u.ERR2353283<=:upperLimit and u.ERR2353284<=:upperLimit and u.ERR2353285<=:upperLimit and u.ERR2353286<=:upperLimit "
			+ "ORDER BY ERR2353718, ERR2353719, ERR2353720, ERR2353721, ERR2353722, ERR2353723, ERR2353724, ERR2353725, ERR2353726, ERR2354124, ERR2354125, ERR2354126, ERR2354127, ERR2354128, ERR2354130, ERR2354131, ERR2354132, ERR2354133, ERR2354134, ERR2354135, ERR2354136, ERR2354137, ERR2354138, ERR2354139, ERR2354140, ERR2354141, ERR2354142, ERR2354143, ERR2354144, ERR2354145, ERR2354146, ERR2352867, ERR2352868, ERR2352869, ERR2352870, ERR2352871, ERR2352872, ERR2352873, ERR2352874, ERR2352875, ERR2353264, ERR2353266, ERR2353267, ERR2353268, ERR2353269, ERR2353270, ERR2353271, ERR2353272, ERR2353273, ERR2353274, ERR2353275, ERR2353276, ERR2353277, ERR2353278, ERR2353279, ERR2353280, ERR2353281, ERR2353282, ERR2353283, ERR2353284, ERR2353285, ERR2353286 LIMIT 100")
	public List<Longissimus_thoracis> getLongissimus_thoracisSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
