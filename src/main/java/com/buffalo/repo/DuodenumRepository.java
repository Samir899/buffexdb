package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Duodenum;
import com.buffalo.entity.Genes;

public interface DuodenumRepository extends CrudRepository<Duodenum, Integer>{

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
	
	@Query("SELECT sum(ERR2353638) as ERR2353638, sum(ERR2353639) as ERR2353639, sum(ERR2353640) as ERR2353640, "
			+ "sum(ERR2353641) as ERR2353641, sum(ERR2353642) as ERR2353642, sum(ERR2353643) as ERR2353643, "
			+ "sum(ERR2353644) as ERR2353644, sum(ERR2354019) as ERR2354019, sum(ERR2354020) as ERR2354020, "
			+ "sum(ERR2354021) as ERR2354021, sum(ERR2354022) as ERR2354022, sum(ERR2354023) as ERR2354023, "
			+ "sum(ERR2354024) as ERR2354024, sum(ERR2354025) as ERR2354025, sum(ERR2354026) as ERR2354026, "
			+ "sum(ERR2354027) as ERR2354027, sum(ERR2352803) as ERR2352803, sum(ERR2352804) as ERR2352804, "
			+ "sum(ERR2352805) as ERR2352805, sum(ERR2352806) as ERR2352806, sum(ERR2352807) as ERR2352807, "
			+ "sum(ERR2352808) as ERR2352808, sum(ERR2352809) as ERR2352809, sum(ERR2353159) as ERR2353159, "
			+ "sum(ERR2353160) as ERR2353160, sum(ERR2353161) as ERR2353161, sum(ERR2353162) as ERR2353162, "
			+ "sum(ERR2353163) as ERR2353163, sum(ERR2353164) as ERR2353164, sum(ERR2353165) as ERR2353165, "
			+ "sum(ERR2353166) as ERR2353166, sum(ERR2353167) as ERR2353167 FROM Duodenum")
	public Map <String, Double> getSum();
}
