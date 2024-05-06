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
import com.buffalo.entity.Longissimus_dorsi;

public interface Longissimus_dorsiRepository extends CrudRepository<Longissimus_dorsi, Integer>{
	
	@Query("SELECT u FROM Longissimus_dorsi u WHERE u.SRR8318866>=:lowerLimit and u.SRR8318867>=:lowerLimit and u.SRR8318868>=:lowerLimit and u.SRR12023710>=:lowerLimit and u.SRR12023712>=:lowerLimit and u.SRR12023714>=:lowerLimit and u.SRR12023715>=:lowerLimit and "
			+ "u.SRR8318866<=:upperLimit and u.SRR8318867<=:upperLimit and u.SRR8318868<=:upperLimit and u.SRR12023710<=:upperLimit and u.SRR12023712<=:upperLimit and u.SRR12023714<=:upperLimit and u.SRR12023715<=:upperLimit "
			+ "ORDER BY SRR8318866, SRR8318867, SRR8318868, SRR12023710, SRR12023712, SRR12023714, SRR12023715 LIMIT 100")
	public List<Longissimus_dorsi> getLongissimus_dorsiSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(SRR8318866) as SRR8318866, sum(SRR8318867) as SRR8318867, sum(SRR8318868) as SRR8318868,"
			+ " sum(SRR12023710) as SRR12023710, sum(SRR12023712) as SRR12023712, sum(SRR12023714) as SRR12023714,"
			+ " sum(SRR12023715) as SRR12023715 FROM Longissimus_dorsi")
	
	public Map <String, Double> getSum();
}
