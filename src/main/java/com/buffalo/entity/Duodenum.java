package com.buffalo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "duodenum")
public class Duodenum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352803")
	 private double ERR2352803;
	 
	@Column(name="ERR2352804")
	 private double ERR2352804;
	
	@Column(name="ERR2352805")
	 private double ERR2352805;
	
	@Column(name="ERR2352806")
	 private double ERR2352806;
	
	@Column(name="ERR2352807")
	 private double ERR2352807;
	
	@Column(name="ERR2352808")
	 private double ERR2352808;
	
	@Column(name="ERR2352809")
	 private double ERR2352809;
	
	@Column(name="ERR2353159")
	 private double ERR2353159;
	
	@Column(name="ERR2353160")
	 private double ERR2353160;
	
	@Column(name="ERR2353161")
	 private double ERR2353161;
	
	@Column(name="ERR2353162")
	 private double ERR2353162;
	
	@Column(name="ERR2353163")
	 private double ERR2353163;
	
	@Column(name="ERR2353164")
	 private double ERR2353164;
	
	@Column(name="ERR2353165")
	 private double ERR2353165;
	
	@Column(name="ERR2353166")
	 private double ERR2353166;
	
	@Column(name="ERR2353167")
	 private double ERR2353167;
	
	@Column(name="ERR2353638")
	 private double ERR2353638;
	
	@Column(name="ERR2353639")
	 private double ERR2353639;
	
	@Column(name="ERR2353640")
	 private double ERR2353640;
	
	@Column(name="ERR2353641")
	 private double ERR2353641;
	
	@Column(name="ERR2353642")
	 private double ERR2353642;
	
	@Column(name="ERR2353643")
	 private double ERR2353643;
	
	@Column(name="ERR2353644")
	 private double ERR2353644;
	
	@Column(name="ERR2354019")
	 private double ERR2354019;
	
	@Column(name="ERR2354020")
	 private double ERR2354020;
	
	@Column(name="ERR2354021")
	 private double ERR2354021;
	
	@Column(name="ERR2354022")
	 private double ERR2354022;
	
	@Column(name="ERR2354023")
	 private double ERR2354023;
	
	@Column(name="ERR2354024")
	 private double ERR2354024;
	
	@Column(name="ERR2354025")
	 private double ERR2354025;
	
	@Column(name="ERR2354026")
	 private double ERR2354026;
	
	@Column(name="ERR2354027")
	 private double ERR2354027;

	public Duodenum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duodenum(int id, String geneId, double eRR2352803, double eRR2352804, double eRR2352805, double eRR2352806,
			double eRR2352807, double eRR2352808, double eRR2352809, double eRR2353159, double eRR2353160,
			double eRR2353161, double eRR2353162, double eRR2353163, double eRR2353164, double eRR2353165,
			double eRR2353166, double eRR2353167, double eRR2353638, double eRR2353639, double eRR2353640,
			double eRR2353641, double eRR2353642, double eRR2353643, double eRR2353644, double eRR2354019,
			double eRR2354020, double eRR2354021, double eRR2354022, double eRR2354023, double eRR2354024,
			double eRR2354025, double eRR2354026, double eRR2354027) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352803 = eRR2352803;
		ERR2352804 = eRR2352804;
		ERR2352805 = eRR2352805;
		ERR2352806 = eRR2352806;
		ERR2352807 = eRR2352807;
		ERR2352808 = eRR2352808;
		ERR2352809 = eRR2352809;
		ERR2353159 = eRR2353159;
		ERR2353160 = eRR2353160;
		ERR2353161 = eRR2353161;
		ERR2353162 = eRR2353162;
		ERR2353163 = eRR2353163;
		ERR2353164 = eRR2353164;
		ERR2353165 = eRR2353165;
		ERR2353166 = eRR2353166;
		ERR2353167 = eRR2353167;
		ERR2353638 = eRR2353638;
		ERR2353639 = eRR2353639;
		ERR2353640 = eRR2353640;
		ERR2353641 = eRR2353641;
		ERR2353642 = eRR2353642;
		ERR2353643 = eRR2353643;
		ERR2353644 = eRR2353644;
		ERR2354019 = eRR2354019;
		ERR2354020 = eRR2354020;
		ERR2354021 = eRR2354021;
		ERR2354022 = eRR2354022;
		ERR2354023 = eRR2354023;
		ERR2354024 = eRR2354024;
		ERR2354025 = eRR2354025;
		ERR2354026 = eRR2354026;
		ERR2354027 = eRR2354027;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneId() {
		return geneId;
	}

	public void setGene(String geneId) {
		this.geneId = geneId;
	}

	public double getERR2352803() {
		return ERR2352803;
	}

	public void setERR2352803(double eRR2352803) {
		ERR2352803 = eRR2352803;
	}

	public double getERR2352804() {
		return ERR2352804;
	}

	public void setERR2352804(double eRR2352804) {
		ERR2352804 = eRR2352804;
	}

	public double getERR2352805() {
		return ERR2352805;
	}

	public void setERR2352805(double eRR2352805) {
		ERR2352805 = eRR2352805;
	}

	public double getERR2352806() {
		return ERR2352806;
	}

	public void setERR2352806(double eRR2352806) {
		ERR2352806 = eRR2352806;
	}

	public double getERR2352807() {
		return ERR2352807;
	}

	public void setERR2352807(double eRR2352807) {
		ERR2352807 = eRR2352807;
	}

	public double getERR2352808() {
		return ERR2352808;
	}

	public void setERR2352808(double eRR2352808) {
		ERR2352808 = eRR2352808;
	}

	public double getERR2352809() {
		return ERR2352809;
	}

	public void setERR2352809(double eRR2352809) {
		ERR2352809 = eRR2352809;
	}

	public double getERR2353159() {
		return ERR2353159;
	}

	public void setERR2353159(double eRR2353159) {
		ERR2353159 = eRR2353159;
	}

	public double getERR2353160() {
		return ERR2353160;
	}

	public void setERR2353160(double eRR2353160) {
		ERR2353160 = eRR2353160;
	}

	public double getERR2353161() {
		return ERR2353161;
	}

	public void setERR2353161(double eRR2353161) {
		ERR2353161 = eRR2353161;
	}

	public double getERR2353162() {
		return ERR2353162;
	}

	public void setERR2353162(double eRR2353162) {
		ERR2353162 = eRR2353162;
	}

	public double getERR2353163() {
		return ERR2353163;
	}

	public void setERR2353163(double eRR2353163) {
		ERR2353163 = eRR2353163;
	}

	public double getERR2353164() {
		return ERR2353164;
	}

	public void setERR2353164(double eRR2353164) {
		ERR2353164 = eRR2353164;
	}

	public double getERR2353165() {
		return ERR2353165;
	}

	public void setERR2353165(double eRR2353165) {
		ERR2353165 = eRR2353165;
	}

	public double getERR2353166() {
		return ERR2353166;
	}

	public void setERR2353166(double eRR2353166) {
		ERR2353166 = eRR2353166;
	}

	public double getERR2353167() {
		return ERR2353167;
	}

	public void setERR2353167(double eRR2353167) {
		ERR2353167 = eRR2353167;
	}

	public double getERR2353638() {
		return ERR2353638;
	}

	public void setERR2353638(double eRR2353638) {
		ERR2353638 = eRR2353638;
	}

	public double getERR2353639() {
		return ERR2353639;
	}

	public void setERR2353639(double eRR2353639) {
		ERR2353639 = eRR2353639;
	}

	public double getERR2353640() {
		return ERR2353640;
	}

	public void setERR2353640(double eRR2353640) {
		ERR2353640 = eRR2353640;
	}

	public double getERR2353641() {
		return ERR2353641;
	}

	public void setERR2353641(double eRR2353641) {
		ERR2353641 = eRR2353641;
	}

	public double getERR2353642() {
		return ERR2353642;
	}

	public void setERR2353642(double eRR2353642) {
		ERR2353642 = eRR2353642;
	}

	public double getERR2353643() {
		return ERR2353643;
	}

	public void setERR2353643(double eRR2353643) {
		ERR2353643 = eRR2353643;
	}

	public double getERR2353644() {
		return ERR2353644;
	}

	public void setERR2353644(double eRR2353644) {
		ERR2353644 = eRR2353644;
	}

	public double getERR2354019() {
		return ERR2354019;
	}

	public void setERR2354019(double eRR2354019) {
		ERR2354019 = eRR2354019;
	}

	public double getERR2354020() {
		return ERR2354020;
	}

	public void setERR2354020(double eRR2354020) {
		ERR2354020 = eRR2354020;
	}

	public double getERR2354021() {
		return ERR2354021;
	}

	public void setERR2354021(double eRR2354021) {
		ERR2354021 = eRR2354021;
	}

	public double getERR2354022() {
		return ERR2354022;
	}

	public void setERR2354022(double eRR2354022) {
		ERR2354022 = eRR2354022;
	}

	public double getERR2354023() {
		return ERR2354023;
	}

	public void setERR2354023(double eRR2354023) {
		ERR2354023 = eRR2354023;
	}

	public double getERR2354024() {
		return ERR2354024;
	}

	public void setERR2354024(double eRR2354024) {
		ERR2354024 = eRR2354024;
	}

	public double getERR2354025() {
		return ERR2354025;
	}

	public void setERR2354025(double eRR2354025) {
		ERR2354025 = eRR2354025;
	}

	public double getERR2354026() {
		return ERR2354026;
	}

	public void setERR2354026(double eRR2354026) {
		ERR2354026 = eRR2354026;
	}

	public double getERR2354027() {
		return ERR2354027;
	}

	public void setERR2354027(double eRR2354027) {
		ERR2354027 = eRR2354027;
	}

	@Override
	public String toString() {
		return "Duodenum [id=" + id + ", geneId=" + geneId + ", ERR2352803=" + ERR2352803 + ", ERR2352804=" + ERR2352804
				+ ", ERR2352805=" + ERR2352805 + ", ERR2352806=" + ERR2352806 + ", ERR2352807=" + ERR2352807
				+ ", ERR2352808=" + ERR2352808 + ", ERR2352809=" + ERR2352809 + ", ERR2353159=" + ERR2353159
				+ ", ERR2353160=" + ERR2353160 + ", ERR2353161=" + ERR2353161 + ", ERR2353162=" + ERR2353162
				+ ", ERR2353163=" + ERR2353163 + ", ERR2353164=" + ERR2353164 + ", ERR2353165=" + ERR2353165
				+ ", ERR2353166=" + ERR2353166 + ", ERR2353167=" + ERR2353167 + ", ERR2353638=" + ERR2353638
				+ ", ERR2353639=" + ERR2353639 + ", ERR2353640=" + ERR2353640 + ", ERR2353641=" + ERR2353641
				+ ", ERR2353642=" + ERR2353642 + ", ERR2353643=" + ERR2353643 + ", ERR2353644=" + ERR2353644
				+ ", ERR2354019=" + ERR2354019 + ", ERR2354020=" + ERR2354020 + ", ERR2354021=" + ERR2354021
				+ ", ERR2354022=" + ERR2354022 + ", ERR2354023=" + ERR2354023 + ", ERR2354024=" + ERR2354024
				+ ", ERR2354025=" + ERR2354025 + ", ERR2354026=" + ERR2354026 + ", ERR2354027=" + ERR2354027 + "]";
	}
}
