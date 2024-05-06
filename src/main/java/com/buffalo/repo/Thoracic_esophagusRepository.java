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
import com.buffalo.entity.Thoracic_esophagus;

public interface Thoracic_esophagusRepository extends CrudRepository<Thoracic_esophagus, Integer>{
	
	@Query("SELECT u FROM Thoracic_esophagus u WHERE u.ERR2353546>=:lowerLimit and u.ERR2353547>=:lowerLimit and u.ERR2353548>=:lowerLimit and u.ERR2353549>=:lowerLimit and u.ERR2353550>=:lowerLimit and u.ERR2353551>=:lowerLimit and u.ERR2353552>=:lowerLimit and u.ERR2353553>=:lowerLimit and u.ERR2353554>=:lowerLimit and u.ERR2354388>=:lowerLimit and u.ERR2354389>=:lowerLimit and u.ERR2354390>=:lowerLimit and u.ERR2354391>=:lowerLimit and u.ERR2354392>=:lowerLimit and u.ERR2354393>=:lowerLimit and u.ERR2354394>=:lowerLimit and u.ERR2354395>=:lowerLimit and u.ERR2354396>=:lowerLimit and "
			+ "u.ERR2353546<=:upperLimit and u.ERR2353547<=:upperLimit and u.ERR2353548<=:upperLimit and u.ERR2353549<=:upperLimit and u.ERR2353550<=:upperLimit and u.ERR2353551<=:upperLimit and u.ERR2353552<=:upperLimit and u.ERR2353553<=:upperLimit and u.ERR2353554<=:upperLimit and u.ERR2354388<=:upperLimit and u.ERR2354389<=:upperLimit and u.ERR2354390<=:upperLimit and u.ERR2354391<=:upperLimit and u.ERR2354392<=:upperLimit and u.ERR2354393<=:upperLimit and u.ERR2354394<=:upperLimit and u.ERR2354395<=:upperLimit and u.ERR2354396<=:upperLimit "
			+ "ORDER BY ERR2353546, ERR2353547, ERR2353548, ERR2353549, ERR2353550, ERR2353551, ERR2353552, ERR2353553, ERR2353554, ERR2354388, ERR2354389, ERR2354390, ERR2354391, ERR2354392, ERR2354393, ERR2354394, ERR2354395, ERR2354396 LIMIT 100")
	public List<Thoracic_esophagus> getThoracic_esophagusSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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

		@Query("SELECT sum(ERR2353546) as ERR2353546, sum(ERR2353547) as ERR2353547, sum(ERR2353548) as ERR2353548, sum(ERR2353549) as ERR2353549, sum(ERR2353550) as ERR2353550, sum(ERR2353551) as ERR2353551, sum(ERR2353552) as ERR2353552, sum(ERR2353553) as ERR2353553, sum(ERR2353554) as ERR2353554, sum(ERR2354388) as ERR2354388, sum(ERR2354389) as ERR2354389, sum(ERR2354390) as ERR2354390, sum(ERR2354391) as ERR2354391, sum(ERR2354392) as ERR2354392, sum(ERR2354393) as ERR2354393, sum(ERR2354394) as ERR2354394, sum(ERR2354395) as ERR2354395, sum(ERR2354396) as ERR2354396 FROM Thoracic_esophagus")
		public Map <String, Double> getSum();
}
