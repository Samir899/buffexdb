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
import com.buffalo.entity.Leg_muscle;

public interface Leg_muscleRepository extends CrudRepository<Leg_muscle, Integer>{
	
	@Query("SELECT u FROM Leg_muscle u WHERE u.SRR15721747>=:lowerLimit and SRR15721760>=:lowerLimit and u.SRR15721747<=:upperLimit and SRR15721760<=:upperLimit "
			+ "ORDER BY SRR15721747, SRR15721760 LIMIT 100")
	public List<Leg_muscle> getLeg_muscleSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR15721747) as SRR15721747, sum(SRR15721760) as SRR15721760 FROM Leg_muscle")
	public Map <String, Double> getSum();
}
