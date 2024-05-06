package com.buffalo.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buffalo.entity.Thymus;

public interface ThymusRepository extends CrudRepository<Thymus, Integer>{
	
	@Query("SELECT u FROM Thymus u WHERE u.ERR315639>=:lowerLimit and u.ERR2353564>=:lowerLimit and u.ERR2353565>=:lowerLimit and u.ERR2353566>=:lowerLimit and u.ERR2353567>=:lowerLimit and u.ERR2353568>=:lowerLimit and u.ERR2353569>=:lowerLimit and u.ERR2353570>=:lowerLimit and u.ERR2353571>=:lowerLimit and u.ERR2353572>=:lowerLimit and u.ERR2353573>=:lowerLimit and u.ERR2353574>=:lowerLimit and u.ERR2353575>=:lowerLimit and u.ERR2353576>=:lowerLimit and u.ERR2353577>=:lowerLimit and u.ERR2353578>=:lowerLimit and u.ERR2353579>=:lowerLimit and u.ERR2353580>=:lowerLimit and u.ERR2353581>=:lowerLimit and u.ERR2353582>=:lowerLimit and u.ERR2353583>=:lowerLimit and u.ERR2353584>=:lowerLimit and u.ERR2353585>=:lowerLimit and u.ERR2353586>=:lowerLimit and u.ERR2353852>=:lowerLimit and u.ERR2353853>=:lowerLimit and u.ERR2353854>=:lowerLimit and u.ERR2353855>=:lowerLimit and u.ERR2353856>=:lowerLimit and u.ERR2353857>=:lowerLimit and u.ERR2353858>=:lowerLimit and u.ERR2353859>=:lowerLimit and u.ERR2353860>=:lowerLimit and u.ERR2354406>=:lowerLimit and u.ERR2354407>=:lowerLimit and u.ERR2354408>=:lowerLimit and u.ERR2354409>=:lowerLimit and u.ERR2354410>=:lowerLimit and u.ERR2354411>=:lowerLimit and u.ERR2354412>=:lowerLimit and u.ERR2354413>=:lowerLimit and u.ERR2354414>=:lowerLimit and u.ERR2354415>=:lowerLimit and u.ERR2354416>=:lowerLimit and u.ERR2354417>=:lowerLimit and u.ERR2354418>=:lowerLimit and u.ERR2354419>=:lowerLimit and u.ERR2354420>=:lowerLimit and u.ERR2354421>=:lowerLimit and u.ERR2354422>=:lowerLimit and u.ERR2354423>=:lowerLimit and u.ERR2354424>=:lowerLimit and u.ERR2354425>=:lowerLimit and u.ERR2354426>=:lowerLimit and u.ERR2354427>=:lowerLimit and u.ERR2354428>=:lowerLimit and u.ERR2353001>=:lowerLimit and u.ERR2353002>=:lowerLimit and u.ERR2353003>=:lowerLimit and u.ERR2353004>=:lowerLimit and u.ERR2353005>=:lowerLimit and u.ERR2353006>=:lowerLimit and u.ERR2353007>=:lowerLimit and u.ERR2353008>=:lowerLimit and u.ERR2353009>=:lowerLimit and "
			+ "u.ERR315639<=:upperLimit and u.ERR2353564<=:upperLimit and u.ERR2353565<=:upperLimit and u.ERR2353566<=:upperLimit and u.ERR2353567<=:upperLimit and u.ERR2353568<=:upperLimit and u.ERR2353569<=:upperLimit and u.ERR2353570<=:upperLimit and u.ERR2353571<=:upperLimit and u.ERR2353572<=:upperLimit and u.ERR2353573<=:upperLimit and u.ERR2353574<=:upperLimit and u.ERR2353575<=:upperLimit and u.ERR2353576<=:upperLimit and u.ERR2353577<=:upperLimit and u.ERR2353578<=:upperLimit and u.ERR2353579<=:upperLimit and u.ERR2353580<=:upperLimit and u.ERR2353581<=:upperLimit and u.ERR2353582<=:upperLimit and u.ERR2353583<=:upperLimit and u.ERR2353584<=:upperLimit and u.ERR2353585<=:upperLimit and u.ERR2353586<=:upperLimit and u.ERR2353852<=:upperLimit and u.ERR2353853<=:upperLimit and u.ERR2353854<=:upperLimit and u.ERR2353855<=:upperLimit and u.ERR2353856<=:upperLimit and u.ERR2353857<=:upperLimit and u.ERR2353858<=:upperLimit and u.ERR2353859<=:upperLimit and u.ERR2353860<=:upperLimit and u.ERR2354406<=:upperLimit and u.ERR2354407<=:upperLimit and u.ERR2354408<=:upperLimit and u.ERR2354409<=:upperLimit and u.ERR2354410<=:upperLimit and u.ERR2354411<=:upperLimit and u.ERR2354412<=:upperLimit and u.ERR2354413<=:upperLimit and u.ERR2354414<=:upperLimit and u.ERR2354415<=:upperLimit and u.ERR2354416<=:upperLimit and u.ERR2354417<=:upperLimit and u.ERR2354418<=:upperLimit and u.ERR2354419<=:upperLimit and u.ERR2354420<=:upperLimit and u.ERR2354421<=:upperLimit and u.ERR2354422<=:upperLimit and u.ERR2354423<=:upperLimit and u.ERR2354424<=:upperLimit and u.ERR2354425<=:upperLimit and u.ERR2354426<=:upperLimit and u.ERR2354427<=:upperLimit and u.ERR2354428<=:upperLimit and u.ERR2353001<=:upperLimit and u.ERR2353002<=:upperLimit and u.ERR2353003<=:upperLimit and u.ERR2353004<=:upperLimit and u.ERR2353005<=:upperLimit and u.ERR2353006<=:upperLimit and u.ERR2353007<=:upperLimit and u.ERR2353008<=:upperLimit and u.ERR2353009<=:upperLimit "
			+ "ORDER BY ERR315639, ERR2353564, ERR2353565, ERR2353566, ERR2353567, ERR2353568, ERR2353569, ERR2353570, ERR2353571, ERR2353572, ERR2353573, ERR2353574, ERR2353575, ERR2353576, ERR2353577, ERR2353578, ERR2353579, ERR2353580, ERR2353581, ERR2353582, ERR2353583, ERR2353584, ERR2353585, ERR2353586, ERR2353852, ERR2353853, ERR2353854, ERR2353855, ERR2353856, ERR2353857, ERR2353858, ERR2353859, ERR2353860, ERR2354406, ERR2354407, ERR2354408, ERR2354409, ERR2354410, ERR2354411, ERR2354412, ERR2354413, ERR2354414, ERR2354415, ERR2354416, ERR2354417, ERR2354418, ERR2354419, ERR2354420, ERR2354421, ERR2354422, ERR2354423, ERR2354424, ERR2354425, ERR2354426, ERR2354427, ERR2354428, ERR2353001, ERR2353002, ERR2353003, ERR2353004, ERR2353005, ERR2353006, ERR2353007, ERR2353008, ERR2353009 LIMIT 100")
	public List<Thymus> getThymusSorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
	
	@Query("SELECT sum(ERR315639) as ERR315639, sum(ERR2353564) as ERR2353564, sum(ERR2353565) as ERR2353565, sum(ERR2353566) as ERR2353566, sum(ERR2353567) as ERR2353567, sum(ERR2353568) as ERR2353568, sum(ERR2353569) as ERR2353569, sum(ERR2353570) as ERR2353570, sum(ERR2353571) as ERR2353571, sum(ERR2353572) as ERR2353572, sum(ERR2353573) as ERR2353573, sum(ERR2353574) as ERR2353574, sum(ERR2353575) as ERR2353575, sum(ERR2353576) as ERR2353576, sum(ERR2353577) as ERR2353577, sum(ERR2353578) as ERR2353578, sum(ERR2353579) as ERR2353579, sum(ERR2353580) as ERR2353580, sum(ERR2353581) as ERR2353581, sum(ERR2353582) as ERR2353582, sum(ERR2353583) as ERR2353583, sum(ERR2353584) as ERR2353584, sum(ERR2353585) as ERR2353585, sum(ERR2353586) as ERR2353586, sum(ERR2353852) as ERR2353852, sum(ERR2353853) as ERR2353853, sum(ERR2353854) as ERR2353854, sum(ERR2353855) as ERR2353855, sum(ERR2353856) as ERR2353856, sum(ERR2353857) as ERR2353857, sum(ERR2353858) as ERR2353858, sum(ERR2353859) as ERR2353859, sum(ERR2353860) as ERR2353860, sum(ERR2354406) as ERR2354406, sum(ERR2354407) as ERR2354407, sum(ERR2354408) as ERR2354408, sum(ERR2354409) as ERR2354409, sum(ERR2354410) as ERR2354410, sum(ERR2354411) as ERR2354411, sum(ERR2354412) as ERR2354412, sum(ERR2354413) as ERR2354413, sum(ERR2354414) as ERR2354414, sum(ERR2354415) as ERR2354415, sum(ERR2354416) as ERR2354416, sum(ERR2354417) as ERR2354417, sum(ERR2354418) as ERR2354418, sum(ERR2354419) as ERR2354419, sum(ERR2354420) as ERR2354420, sum(ERR2354421) as ERR2354421, sum(ERR2354422) as ERR2354422, sum(ERR2354423) as ERR2354423, sum(ERR2354424) as ERR2354424, sum(ERR2354425) as ERR2354425, sum(ERR2354426) as ERR2354426, sum(ERR2354427) as ERR2354427, sum(ERR2354428) as ERR2354428, sum(ERR2353001) as ERR2353001, sum(ERR2353002) as ERR2353002, sum(ERR2353003) as ERR2353003, sum(ERR2353004) as ERR2353004, sum(ERR2353005) as ERR2353005, sum(ERR2353006) as ERR2353006, sum(ERR2353007) as ERR2353007, sum(ERR2353008) as ERR2353008, sum(ERR2353009) as ERR2353009 FROM Thymus")
	public Map <String, Double> getSum();
}
