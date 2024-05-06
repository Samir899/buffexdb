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
import com.buffalo.entity.Renal_medulla1;

public interface Renal_medulla1Repository extends CrudRepository<Renal_medulla1, Integer>{
	
	@Query("SELECT u FROM Renal_medulla1 u WHERE u.ERR2352642>=:lowerLimit and u.ERR2352643>=:lowerLimit and u.ERR2352644>=:lowerLimit and u.ERR2352645>=:lowerLimit and u.ERR2352646>=:lowerLimit and u.ERR2352647>=:lowerLimit and u.ERR2352648>=:lowerLimit and u.ERR2352649>=:lowerLimit and u.ERR2352650>=:lowerLimit and u.ERR2352651>=:lowerLimit and u.ERR2352652>=:lowerLimit and u.ERR2352653>=:lowerLimit and u.ERR2352654>=:lowerLimit and u.ERR2352655>=:lowerLimit and u.ERR2352656>=:lowerLimit and u.ERR2352657>=:lowerLimit and u.ERR2352658>=:lowerLimit and u.ERR2352659>=:lowerLimit and u.ERR2352660>=:lowerLimit and u.ERR2352661>=:lowerLimit and u.ERR2352662>=:lowerLimit and u.ERR2352663>=:lowerLimit and u.ERR2352664>=:lowerLimit and u.ERR2352849>=:lowerLimit and u.ERR2352850>=:lowerLimit and u.ERR2352851>=:lowerLimit and u.ERR2352852>=:lowerLimit and u.ERR2352853>=:lowerLimit and u.ERR2352854>=:lowerLimit and u.ERR2352855>=:lowerLimit and u.ERR2352857>=:lowerLimit and u.ERR2353218>=:lowerLimit and u.ERR2353219>=:lowerLimit and u.ERR2353220>=:lowerLimit and u.ERR2353221>=:lowerLimit and u.ERR2353222>=:lowerLimit and u.ERR2353223>=:lowerLimit and u.ERR2353224>=:lowerLimit and u.ERR2353225>=:lowerLimit and u.ERR2353226>=:lowerLimit and u.ERR2353227>=:lowerLimit and u.ERR2353228>=:lowerLimit and u.ERR2353229>=:lowerLimit and u.ERR2353230>=:lowerLimit and u.ERR2353231>=:lowerLimit and u.ERR2353232>=:lowerLimit and u.ERR2353233>=:lowerLimit and u.ERR2353234>=:lowerLimit and u.ERR2353235>=:lowerLimit and u.ERR2353236>=:lowerLimit and u.ERR2353237>=:lowerLimit and u.ERR2353238>=:lowerLimit and u.ERR2353239>=:lowerLimit and u.ERR2353240>=:lowerLimit and u.ERR2353700>=:lowerLimit and u.ERR2353701>=:lowerLimit and u.ERR2353702>=:lowerLimit and u.ERR2353703>=:lowerLimit and u.ERR2353704>=:lowerLimit and u.ERR2353705>=:lowerLimit and u.ERR2353706>=:lowerLimit and u.ERR2353707>=:lowerLimit and u.ERR2353708>=:lowerLimit and u.ERR2354078>=:lowerLimit and u.ERR2354079>=:lowerLimit and u.ERR2354080>=:lowerLimit and u.ERR2354081>=:lowerLimit and u.ERR2354082>=:lowerLimit and u.ERR2354083>=:lowerLimit and u.ERR2354084>=:lowerLimit and u.ERR2354085>=:lowerLimit and u.ERR2354086>=:lowerLimit and u.ERR2354087>=:lowerLimit and u.ERR2354088>=:lowerLimit and u.ERR2354089>=:lowerLimit and u.ERR2354090>=:lowerLimit and u.ERR2354091>=:lowerLimit and u.ERR2354092>=:lowerLimit and u.ERR2354093>=:lowerLimit and u.ERR2354094>=:lowerLimit and u.ERR2354095>=:lowerLimit and u.ERR2354096>=:lowerLimit and u.ERR2354097>=:lowerLimit and u.ERR2354098>=:lowerLimit and u.ERR2354099>=:lowerLimit and u.ERR2354100>=:lowerLimit and u.ERR2354497>=:lowerLimit and u.ERR2354498>=:lowerLimit and u.ERR2354499>=:lowerLimit and u.ERR2354500>=:lowerLimit and u.ERR2354501>=:lowerLimit and u.ERR2354502>=:lowerLimit and u.ERR2354503>=:lowerLimit and u.ERR2354504>=:lowerLimit and u.ERR2354505>=:lowerLimit and u.ERR2354506>=:lowerLimit and u.ERR2354507>=:lowerLimit and u.ERR2354508>=:lowerLimit and u.ERR2354509>=:lowerLimit and u.ERR2354510>=:lowerLimit and "
			+ "u.ERR2352642<=:upperLimit and u.ERR2352643<=:upperLimit and u.ERR2352644<=:upperLimit and u.ERR2352645<=:upperLimit and u.ERR2352646<=:upperLimit and u.ERR2352647<=:upperLimit and u.ERR2352648<=:upperLimit and u.ERR2352649<=:upperLimit and u.ERR2352650<=:upperLimit and u.ERR2352651<=:upperLimit and u.ERR2352652<=:upperLimit and u.ERR2352653<=:upperLimit and u.ERR2352654<=:upperLimit and u.ERR2352655<=:upperLimit and u.ERR2352656<=:upperLimit and u.ERR2352657<=:upperLimit and u.ERR2352658<=:upperLimit and u.ERR2352659<=:upperLimit and u.ERR2352660<=:upperLimit and u.ERR2352661<=:upperLimit and u.ERR2352662<=:upperLimit and u.ERR2352663<=:upperLimit and u.ERR2352664<=:upperLimit and u.ERR2352849<=:upperLimit and u.ERR2352850<=:upperLimit and u.ERR2352851<=:upperLimit and u.ERR2352852<=:upperLimit and u.ERR2352853<=:upperLimit and u.ERR2352854<=:upperLimit and u.ERR2352855<=:upperLimit and u.ERR2352857<=:upperLimit and u.ERR2353218<=:upperLimit and u.ERR2353219<=:upperLimit and u.ERR2353220<=:upperLimit and u.ERR2353221<=:upperLimit and u.ERR2353222<=:upperLimit and u.ERR2353223<=:upperLimit and u.ERR2353224<=:upperLimit and u.ERR2353225<=:upperLimit and u.ERR2353226<=:upperLimit and u.ERR2353227<=:upperLimit and u.ERR2353228<=:upperLimit and u.ERR2353229<=:upperLimit and u.ERR2353230<=:upperLimit and u.ERR2353231<=:upperLimit and u.ERR2353232<=:upperLimit and u.ERR2353233<=:upperLimit and u.ERR2353234<=:upperLimit and u.ERR2353235<=:upperLimit and u.ERR2353236<=:upperLimit and u.ERR2353237<=:upperLimit and u.ERR2353238<=:upperLimit and u.ERR2353239<=:upperLimit and u.ERR2353240<=:upperLimit and u.ERR2353700<=:upperLimit and u.ERR2353701<=:upperLimit and u.ERR2353702<=:upperLimit and u.ERR2353703<=:upperLimit and u.ERR2353704<=:upperLimit and u.ERR2353705<=:upperLimit and u.ERR2353706<=:upperLimit and u.ERR2353707<=:upperLimit and u.ERR2353708<=:upperLimit and u.ERR2354078<=:upperLimit and u.ERR2354079<=:upperLimit and u.ERR2354080<=:upperLimit and u.ERR2354081<=:upperLimit and u.ERR2354082<=:upperLimit and u.ERR2354083<=:upperLimit and u.ERR2354084<=:upperLimit and u.ERR2354085<=:upperLimit and u.ERR2354086<=:upperLimit and u.ERR2354087<=:upperLimit and u.ERR2354088<=:upperLimit and u.ERR2354089<=:upperLimit and u.ERR2354090<=:upperLimit and u.ERR2354091<=:upperLimit and u.ERR2354092<=:upperLimit and u.ERR2354093<=:upperLimit and u.ERR2354094<=:upperLimit and u.ERR2354095<=:upperLimit and u.ERR2354096<=:upperLimit and u.ERR2354097<=:upperLimit and u.ERR2354098<=:upperLimit and u.ERR2354099<=:upperLimit and u.ERR2354100<=:upperLimit and u.ERR2354497<=:upperLimit and u.ERR2354498<=:upperLimit and u.ERR2354499<=:upperLimit and u.ERR2354500<=:upperLimit and u.ERR2354501<=:upperLimit and u.ERR2354502<=:upperLimit and u.ERR2354503<=:upperLimit and u.ERR2354504<=:upperLimit and u.ERR2354505<=:upperLimit and u.ERR2354506<=:upperLimit and u.ERR2354507<=:upperLimit and u.ERR2354508<=:upperLimit and u.ERR2354509<=:upperLimit and u.ERR2354510<=:upperLimit "
			+ "ORDER BY ERR2352642, ERR2352643, ERR2352644, ERR2352645, ERR2352646, ERR2352647, ERR2352648, ERR2352649, ERR2352650, ERR2352651, ERR2352652, ERR2352653, ERR2352654, ERR2352655, ERR2352656, ERR2352657, ERR2352658, ERR2352659, ERR2352660, ERR2352661, ERR2352662, ERR2352663, ERR2352664, ERR2352849, ERR2352850, ERR2352851, ERR2352852, ERR2352853, ERR2352854, ERR2352855, ERR2352857, ERR2353218, ERR2353219, ERR2353220, ERR2353221, ERR2353222, ERR2353223, ERR2353224, ERR2353225, ERR2353226, ERR2353227, ERR2353228, ERR2353229, ERR2353230, ERR2353231, ERR2353232, ERR2353233, ERR2353234, ERR2353235, ERR2353236, ERR2353237, ERR2353238, ERR2353239, ERR2353240, ERR2353700, ERR2353701, ERR2353702, ERR2353703, ERR2353704, ERR2353705, ERR2353706, ERR2353707, ERR2353708, ERR2354078, ERR2354079, ERR2354080, ERR2354081, ERR2354082, ERR2354083, ERR2354084, ERR2354085, ERR2354086, ERR2354087, ERR2354088, ERR2354089, ERR2354090, ERR2354091, ERR2354092, ERR2354093, ERR2354094, ERR2354095, ERR2354096, ERR2354097, ERR2354098, ERR2354099, ERR2354100, ERR2354497, ERR2354498, ERR2354499, ERR2354500, ERR2354501, ERR2354502, ERR2354503, ERR2354504, ERR2354505, ERR2354506, ERR2354507, ERR2354508, ERR2354509, ERR2354510 LIMIT 100")
	public List<Renal_medulla1> getRenal_medulla1Sorted(@Param("lowerLimit") Double lowerLimit, @Param("upperLimit") Double upperLimit);

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
