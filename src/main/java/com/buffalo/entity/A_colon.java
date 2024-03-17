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
@Table(name = "ascending_colon")
public class A_colon {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352796")
	 private double ERR2352796;
	 
	@Column(name="ERR2352797")
	 private double ERR2352797;
	
	@Column(name="ERR2352798")
	 private double ERR2352798;
	
	@Column(name="ERR2352799")
	 private double ERR2352799;
	
	@Column(name="ERR2352800")
	 private double ERR2352800;
	
	@Column(name="ERR2352801")
	 private double ERR2352801;
	
	@Column(name="ERR2352802")
	 private double ERR2352802;
	
	@Column(name="ERR2353150")
	 private double ERR2353150;
	
	@Column(name="ERR2353151")
	 private double ERR2353151;
	
	@Column(name="ERR2353152")
	 private double ERR2353152;
	
	@Column(name="ERR2353153")
	 private double ERR2353153;
	
	@Column(name="ERR2353154")
	 private double ERR2353154;
	
	@Column(name="ERR2353155")
	 private double ERR2353155;
	
	@Column(name="ERR2353156")
	 private double ERR2353156;
	
	@Column(name="ERR2353157")
	 private double ERR2353157;
	
	@Column(name="ERR2353158")
	 private double ERR2353158;
	
	@Column(name="ERR2353631")
	 private double ERR2353631;
	
	@Column(name="ERR2353632")
	 private double ERR2353632;
	
	@Column(name="ERR2353633")
	 private double ERR2353633;
	
	@Column(name="ERR2353634")
	 private double ERR2353634;
	
	@Column(name="ERR2353635")
	 private double ERR2353635;
	
	@Column(name="ERR2353636")
	 private double ERR2353636;
	
	@Column(name="ERR2353637")
	 private double ERR2353637;
	
	@Column(name="ERR2354010")
	 private double ERR2354010;
	
	@Column(name="ERR2354011")
	 private double ERR2354011;
	
	@Column(name="ERR2354012")
	 private double ERR2354012;
	
	@Column(name="ERR2354013")
	 private double ERR2354013;
	
	@Column(name="ERR2354014")
	 private double ERR2354014;
	
	@Column(name="ERR2354015")
	 private double ERR2354015;
	
	@Column(name="ERR2354016")
	 private double ERR2354016;
	
	@Column(name="ERR2354017")
	 private double ERR2354017;
	
	@Column(name="ERR2354018")
	 private double ERR2354018;

	public A_colon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A_colon(int id, Genes gene, double eRR2352796, double eRR2352797, double eRR2352798, double eRR2352799,
			double eRR2352800, double eRR2352801, double eRR2352802, double eRR2353150, double eRR2353151,
			double eRR2353152, double eRR2353153, double eRR2353154, double eRR2353155, double eRR2353156,
			double eRR2353157, double eRR2353158, double eRR2353631, double eRR2353632, double eRR2353633,
			double eRR2353634, double eRR2353635, double eRR2353636, double eRR2353637, double eRR2354010,
			double eRR2354011, double eRR2354012, double eRR2354013, double eRR2354014, double eRR2354015,
			double eRR2354016, double eRR2354017, double eRR2354018) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352796 = eRR2352796;
		ERR2352797 = eRR2352797;
		ERR2352798 = eRR2352798;
		ERR2352799 = eRR2352799;
		ERR2352800 = eRR2352800;
		ERR2352801 = eRR2352801;
		ERR2352802 = eRR2352802;
		ERR2353150 = eRR2353150;
		ERR2353151 = eRR2353151;
		ERR2353152 = eRR2353152;
		ERR2353153 = eRR2353153;
		ERR2353154 = eRR2353154;
		ERR2353155 = eRR2353155;
		ERR2353156 = eRR2353156;
		ERR2353157 = eRR2353157;
		ERR2353158 = eRR2353158;
		ERR2353631 = eRR2353631;
		ERR2353632 = eRR2353632;
		ERR2353633 = eRR2353633;
		ERR2353634 = eRR2353634;
		ERR2353635 = eRR2353635;
		ERR2353636 = eRR2353636;
		ERR2353637 = eRR2353637;
		ERR2354010 = eRR2354010;
		ERR2354011 = eRR2354011;
		ERR2354012 = eRR2354012;
		ERR2354013 = eRR2354013;
		ERR2354014 = eRR2354014;
		ERR2354015 = eRR2354015;
		ERR2354016 = eRR2354016;
		ERR2354017 = eRR2354017;
		ERR2354018 = eRR2354018;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Genes getGene() {
		return gene;
	}

	public void setGene(Genes gene) {
		this.gene = gene;
	}

	public double getERR2352796() {
		return ERR2352796;
	}

	public void setERR2352796(double eRR2352796) {
		ERR2352796 = eRR2352796;
	}

	public double getERR2352797() {
		return ERR2352797;
	}

	public void setERR2352797(double eRR2352797) {
		ERR2352797 = eRR2352797;
	}

	public double getERR2352798() {
		return ERR2352798;
	}

	public void setERR2352798(double eRR2352798) {
		ERR2352798 = eRR2352798;
	}

	public double getERR2352799() {
		return ERR2352799;
	}

	public void setERR2352799(double eRR2352799) {
		ERR2352799 = eRR2352799;
	}

	public double getERR2352800() {
		return ERR2352800;
	}

	public void setERR2352800(double eRR2352800) {
		ERR2352800 = eRR2352800;
	}

	public double getERR2352801() {
		return ERR2352801;
	}

	public void setERR2352801(double eRR2352801) {
		ERR2352801 = eRR2352801;
	}

	public double getERR2352802() {
		return ERR2352802;
	}

	public void setERR2352802(double eRR2352802) {
		ERR2352802 = eRR2352802;
	}

	public double getERR2353150() {
		return ERR2353150;
	}

	public void setERR2353150(double eRR2353150) {
		ERR2353150 = eRR2353150;
	}

	public double getERR2353151() {
		return ERR2353151;
	}

	public void setERR2353151(double eRR2353151) {
		ERR2353151 = eRR2353151;
	}

	public double getERR2353152() {
		return ERR2353152;
	}

	public void setERR2353152(double eRR2353152) {
		ERR2353152 = eRR2353152;
	}

	public double getERR2353153() {
		return ERR2353153;
	}

	public void setERR2353153(double eRR2353153) {
		ERR2353153 = eRR2353153;
	}

	public double getERR2353154() {
		return ERR2353154;
	}

	public void setERR2353154(double eRR2353154) {
		ERR2353154 = eRR2353154;
	}

	public double getERR2353155() {
		return ERR2353155;
	}

	public void setERR2353155(double eRR2353155) {
		ERR2353155 = eRR2353155;
	}

	public double getERR2353156() {
		return ERR2353156;
	}

	public void setERR2353156(double eRR2353156) {
		ERR2353156 = eRR2353156;
	}

	public double getERR2353157() {
		return ERR2353157;
	}

	public void setERR2353157(double eRR2353157) {
		ERR2353157 = eRR2353157;
	}

	public double getERR2353158() {
		return ERR2353158;
	}

	public void setERR2353158(double eRR2353158) {
		ERR2353158 = eRR2353158;
	}

	public double getERR2353631() {
		return ERR2353631;
	}

	public void setERR2353631(double eRR2353631) {
		ERR2353631 = eRR2353631;
	}

	public double getERR2353632() {
		return ERR2353632;
	}

	public void setERR2353632(double eRR2353632) {
		ERR2353632 = eRR2353632;
	}

	public double getERR2353633() {
		return ERR2353633;
	}

	public void setERR2353633(double eRR2353633) {
		ERR2353633 = eRR2353633;
	}

	public double getERR2353634() {
		return ERR2353634;
	}

	public void setERR2353634(double eRR2353634) {
		ERR2353634 = eRR2353634;
	}

	public double getERR2353635() {
		return ERR2353635;
	}

	public void setERR2353635(double eRR2353635) {
		ERR2353635 = eRR2353635;
	}

	public double getERR2353636() {
		return ERR2353636;
	}

	public void setERR2353636(double eRR2353636) {
		ERR2353636 = eRR2353636;
	}

	public double getERR2353637() {
		return ERR2353637;
	}

	public void setERR2353637(double eRR2353637) {
		ERR2353637 = eRR2353637;
	}

	public double getERR2354010() {
		return ERR2354010;
	}

	public void setERR2354010(double eRR2354010) {
		ERR2354010 = eRR2354010;
	}

	public double getERR2354011() {
		return ERR2354011;
	}

	public void setERR2354011(double eRR2354011) {
		ERR2354011 = eRR2354011;
	}

	public double getERR2354012() {
		return ERR2354012;
	}

	public void setERR2354012(double eRR2354012) {
		ERR2354012 = eRR2354012;
	}

	public double getERR2354013() {
		return ERR2354013;
	}

	public void setERR2354013(double eRR2354013) {
		ERR2354013 = eRR2354013;
	}

	public double getERR2354014() {
		return ERR2354014;
	}

	public void setERR2354014(double eRR2354014) {
		ERR2354014 = eRR2354014;
	}

	public double getERR2354015() {
		return ERR2354015;
	}

	public void setERR2354015(double eRR2354015) {
		ERR2354015 = eRR2354015;
	}

	public double getERR2354016() {
		return ERR2354016;
	}

	public void setERR2354016(double eRR2354016) {
		ERR2354016 = eRR2354016;
	}

	public double getERR2354017() {
		return ERR2354017;
	}

	public void setERR2354017(double eRR2354017) {
		ERR2354017 = eRR2354017;
	}

	public double getERR2354018() {
		return ERR2354018;
	}

	public void setERR2354018(double eRR2354018) {
		ERR2354018 = eRR2354018;
	}

	@Override
	public String toString() {
		return "A_colon [id=" + id + ", gene=" + gene + ", ERR2352796=" + ERR2352796 + ", ERR2352797=" + ERR2352797
				+ ", ERR2352798=" + ERR2352798 + ", ERR2352799=" + ERR2352799 + ", ERR2352800=" + ERR2352800
				+ ", ERR2352801=" + ERR2352801 + ", ERR2352802=" + ERR2352802 + ", ERR2353150=" + ERR2353150
				+ ", ERR2353151=" + ERR2353151 + ", ERR2353152=" + ERR2353152 + ", ERR2353153=" + ERR2353153
				+ ", ERR2353154=" + ERR2353154 + ", ERR2353155=" + ERR2353155 + ", ERR2353156=" + ERR2353156
				+ ", ERR2353157=" + ERR2353157 + ", ERR2353158=" + ERR2353158 + ", ERR2353631=" + ERR2353631
				+ ", ERR2353632=" + ERR2353632 + ", ERR2353633=" + ERR2353633 + ", ERR2353634=" + ERR2353634
				+ ", ERR2353635=" + ERR2353635 + ", ERR2353636=" + ERR2353636 + ", ERR2353637=" + ERR2353637
				+ ", ERR2354010=" + ERR2354010 + ", ERR2354011=" + ERR2354011 + ", ERR2354012=" + ERR2354012
				+ ", ERR2354013=" + ERR2354013 + ", ERR2354014=" + ERR2354014 + ", ERR2354015=" + ERR2354015
				+ ", ERR2354016=" + ERR2354016 + ", ERR2354017=" + ERR2354017 + ", ERR2354018=" + ERR2354018 + "]";
	}
}
