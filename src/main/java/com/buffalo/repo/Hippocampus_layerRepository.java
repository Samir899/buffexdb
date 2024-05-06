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
import com.buffalo.entity.Genes;
import com.buffalo.entity.Hippocampus_layer;

public interface Hippocampus_layerRepository extends CrudRepository<Hippocampus_layer, Integer>{
	
	@Query("SELECT u FROM Hippocampus_layer u WHERE u.ERR2353668>=:lowerLimit and u.ERR2353669>=:lowerLimit and u.ERR2353670>=:lowerLimit and u.ERR2353671>=:lowerLimit and u.ERR2353672>=:lowerLimit and u.ERR2353673>=:lowerLimit and u.ERR2353674>=:lowerLimit and u.ERR2353675>=:lowerLimit and u.ERR2353676>=:lowerLimit and u.ERR2352825>=:lowerLimit and "
			+ "u.ERR2353668<=:upperLimit and u.ERR2353669<=:upperLimit and u.ERR2353670<=:upperLimit and u.ERR2353671<=:upperLimit and u.ERR2353672<=:upperLimit and u.ERR2353673<=:upperLimit and u.ERR2353674<=:upperLimit and u.ERR2353675<=:upperLimit and u.ERR2353676<=:upperLimit and u.ERR2352825<=:upperLimit "
			+ "ORDER BY ERR2353668, ERR2353669, ERR2353670, ERR2353671, ERR2353672, ERR2353673, ERR2353674, ERR2353675, ERR2353676, ERR2352825 LIMIT 100")
	public List<Hippocampus_layer> getHippocampus_layerSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR2353668) as ERR2353668, sum(ERR2353669) as ERR2353669, sum(ERR2353670) as ERR2353670, "
			+ "sum(ERR2353671) as ERR2353671, sum(ERR2353672) as ERR2353672, sum(ERR2353673) as ERR2353673, "
			+ "sum(ERR2353674) as ERR2353674, sum(ERR2353675) as ERR2353675, sum(ERR2353676) as ERR2353676, "
			+ "sum(ERR2352825) as ERR2352825 FROM Hippocampus_layer")
	public Map <String, Double> getSum();
}
