package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Peyer_patch;

public interface Peyer_patchRepository extends CrudRepository<Peyer_patch, Integer>{
	
	@Query("SELECT u FROM Peyer_patch u WHERE u.ERR2353757>=:lowerLimit and u.ERR2353758>=:lowerLimit and u.ERR2353759>=:lowerLimit and u.ERR2353760>=:lowerLimit and u.ERR2353761>=:lowerLimit and u.ERR2353762>=:lowerLimit and u.ERR2353763>=:lowerLimit and u.ERR2354252>=:lowerLimit and u.ERR2354253>=:lowerLimit and u.ERR2354254>=:lowerLimit and u.ERR2354255>=:lowerLimit and u.ERR2354256>=:lowerLimit and u.ERR2354257>=:lowerLimit and u.ERR2354258>=:lowerLimit and u.ERR2354259>=:lowerLimit and u.ERR2354260>=:lowerLimit and u.ERR2352915>=:lowerLimit and u.ERR2352916>=:lowerLimit and u.ERR2352917>=:lowerLimit and u.ERR2352918>=:lowerLimit and u.ERR2352919>=:lowerLimit and u.ERR2352920>=:lowerLimit and u.ERR2352921>=:lowerLimit and u.ERR2353424>=:lowerLimit and u.ERR2353425>=:lowerLimit and u.ERR2353426>=:lowerLimit and u.ERR2353427>=:lowerLimit and u.ERR2353428>=:lowerLimit and u.ERR2353429>=:lowerLimit and u.ERR2353430>=:lowerLimit and u.ERR2353431>=:lowerLimit and u.ERR2353432>=:lowerLimit and "
			+ "u.ERR2353757<=:upperLimit and u.ERR2353758<=:upperLimit and u.ERR2353759<=:upperLimit and u.ERR2353760<=:upperLimit and u.ERR2353761<=:upperLimit and u.ERR2353762<=:upperLimit and u.ERR2353763<=:upperLimit and u.ERR2354252<=:upperLimit and u.ERR2354253<=:upperLimit and u.ERR2354254<=:upperLimit and u.ERR2354255<=:upperLimit and u.ERR2354256<=:upperLimit and u.ERR2354257<=:upperLimit and u.ERR2354258<=:upperLimit and u.ERR2354259<=:upperLimit and u.ERR2354260<=:upperLimit and u.ERR2352915<=:upperLimit and u.ERR2352916<=:upperLimit and u.ERR2352917<=:upperLimit and u.ERR2352918<=:upperLimit and u.ERR2352919<=:upperLimit and u.ERR2352920<=:upperLimit and u.ERR2352921<=:upperLimit and u.ERR2353424<=:upperLimit and u.ERR2353425<=:upperLimit and u.ERR2353426<=:upperLimit and u.ERR2353427<=:upperLimit and u.ERR2353428<=:upperLimit and u.ERR2353429<=:upperLimit and u.ERR2353430<=:upperLimit and u.ERR2353431<=:upperLimit and u.ERR2353432<=:upperLimit "
			+ "ORDER BY ERR2353757, ERR2353758, ERR2353759, ERR2353760, ERR2353761, ERR2353762, ERR2353763, ERR2354252, ERR2354253, ERR2354254, ERR2354255, ERR2354256, ERR2354257, ERR2354258, ERR2354259, ERR2354260, ERR2352915, ERR2352916, ERR2352917, ERR2352918, ERR2352919, ERR2352920, ERR2352921, ERR2353424, ERR2353425, ERR2353426, ERR2353427, ERR2353428, ERR2353429, ERR2353430, ERR2353431, ERR2353432 LIMIT 100")
	public List<Peyer_patch> getPeyer_patchSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353757) as ERR2353757, sum(ERR2353758) as ERR2353758, sum(ERR2353759) as ERR2353759, sum(ERR2353760) as ERR2353760, sum(ERR2353761) as ERR2353761, sum(ERR2353762) as ERR2353762, sum(ERR2353763) as ERR2353763, sum(ERR2354252) as ERR2354252, sum(ERR2354253) as ERR2354253, sum(ERR2354254) as ERR2354254, sum(ERR2354255) as ERR2354255, sum(ERR2354256) as ERR2354256, sum(ERR2354257) as ERR2354257, sum(ERR2354258) as ERR2354258, sum(ERR2354259) as ERR2354259, sum(ERR2354260) as ERR2354260, sum(ERR2352915) as ERR2352915, sum(ERR2352916) as ERR2352916, sum(ERR2352917) as ERR2352917, sum(ERR2352918) as ERR2352918, sum(ERR2352919) as ERR2352919, sum(ERR2352920) as ERR2352920, sum(ERR2352921) as ERR2352921, sum(ERR2353424) as ERR2353424, sum(ERR2353425) as ERR2353425, sum(ERR2353426) as ERR2353426, sum(ERR2353427) as ERR2353427, sum(ERR2353428) as ERR2353428, sum(ERR2353429) as ERR2353429, sum(ERR2353430) as ERR2353430, sum(ERR2353431) as ERR2353431, sum(ERR2353432) as ERR2353432 FROM Peyer_patch")
	public Map <String, Double> getSum();
}
