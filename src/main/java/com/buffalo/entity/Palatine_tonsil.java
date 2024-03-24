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
@Table(name = "palatine_tonsil")
public class Palatine_tonsil {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2353010")
	 private double ERR2353010;

	@Column(name="ERR2353011")
	 private double ERR2353011;

	@Column(name="ERR2353012")
	 private double ERR2353012;

	@Column(name="ERR2353013")
	 private double ERR2353013;

	@Column(name="ERR2353014")
	 private double ERR2353014;

	@Column(name="ERR2353015")
	 private double ERR2353015;

	@Column(name="ERR2353016")
	 private double ERR2353016;

	@Column(name="ERR2353587")
	 private double ERR2353587;

	@Column(name="ERR2353588")
	 private double ERR2353588;

	@Column(name="ERR2353589")
	 private double ERR2353589;

	@Column(name="ERR2353590")
	 private double ERR2353590;

	@Column(name="ERR2353591")
	 private double ERR2353591;

	@Column(name="ERR2353592")
	 private double ERR2353592;

	@Column(name="ERR2353593")
	 private double ERR2353593;

	@Column(name="ERR2353594")
	 private double ERR2353594;

	@Column(name="ERR2353595")
	 private double ERR2353595;

	@Column(name="ERR2353861")
	 private double ERR2353861;

	@Column(name="ERR2353862")
	 private double ERR2353862;

	@Column(name="ERR2353863")
	 private double ERR2353863;

	@Column(name="ERR2353864")
	 private double ERR2353864;

	@Column(name="ERR2353865")
	 private double ERR2353865;

	@Column(name="ERR2353866")
	 private double ERR2353866;

	@Column(name="ERR2353867")
	 private double ERR2353867;

	@Column(name="ERR2353868")
	 private double ERR2353868;

	@Column(name="ERR2353869")
	 private double ERR2353869;

	@Column(name="ERR2353870")
	 private double ERR2353870;

	@Column(name="ERR2353871")
	 private double ERR2353871;

	@Column(name="ERR2353872")
	 private double ERR2353872;

	@Column(name="ERR2353873")
	 private double ERR2353873;

	@Column(name="ERR2353874")
	 private double ERR2353874;

	@Column(name="ERR2353875")
	 private double ERR2353875;

	@Column(name="ERR2353876")
	 private double ERR2353876;

	public Palatine_tonsil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Palatine_tonsil(int id, Genes gene, double eRR2353010, double eRR2353011, double eRR2353012,
			double eRR2353013, double eRR2353014, double eRR2353015, double eRR2353016, double eRR2353587,
			double eRR2353588, double eRR2353589, double eRR2353590, double eRR2353591, double eRR2353592,
			double eRR2353593, double eRR2353594, double eRR2353595, double eRR2353861, double eRR2353862,
			double eRR2353863, double eRR2353864, double eRR2353865, double eRR2353866, double eRR2353867,
			double eRR2353868, double eRR2353869, double eRR2353870, double eRR2353871, double eRR2353872,
			double eRR2353873, double eRR2353874, double eRR2353875, double eRR2353876) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2353010 = eRR2353010;
		ERR2353011 = eRR2353011;
		ERR2353012 = eRR2353012;
		ERR2353013 = eRR2353013;
		ERR2353014 = eRR2353014;
		ERR2353015 = eRR2353015;
		ERR2353016 = eRR2353016;
		ERR2353587 = eRR2353587;
		ERR2353588 = eRR2353588;
		ERR2353589 = eRR2353589;
		ERR2353590 = eRR2353590;
		ERR2353591 = eRR2353591;
		ERR2353592 = eRR2353592;
		ERR2353593 = eRR2353593;
		ERR2353594 = eRR2353594;
		ERR2353595 = eRR2353595;
		ERR2353861 = eRR2353861;
		ERR2353862 = eRR2353862;
		ERR2353863 = eRR2353863;
		ERR2353864 = eRR2353864;
		ERR2353865 = eRR2353865;
		ERR2353866 = eRR2353866;
		ERR2353867 = eRR2353867;
		ERR2353868 = eRR2353868;
		ERR2353869 = eRR2353869;
		ERR2353870 = eRR2353870;
		ERR2353871 = eRR2353871;
		ERR2353872 = eRR2353872;
		ERR2353873 = eRR2353873;
		ERR2353874 = eRR2353874;
		ERR2353875 = eRR2353875;
		ERR2353876 = eRR2353876;
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

	public double getERR2353010() {
		return ERR2353010;
	}

	public void setERR2353010(double eRR2353010) {
		ERR2353010 = eRR2353010;
	}

	public double getERR2353011() {
		return ERR2353011;
	}

	public void setERR2353011(double eRR2353011) {
		ERR2353011 = eRR2353011;
	}

	public double getERR2353012() {
		return ERR2353012;
	}

	public void setERR2353012(double eRR2353012) {
		ERR2353012 = eRR2353012;
	}

	public double getERR2353013() {
		return ERR2353013;
	}

	public void setERR2353013(double eRR2353013) {
		ERR2353013 = eRR2353013;
	}

	public double getERR2353014() {
		return ERR2353014;
	}

	public void setERR2353014(double eRR2353014) {
		ERR2353014 = eRR2353014;
	}

	public double getERR2353015() {
		return ERR2353015;
	}

	public void setERR2353015(double eRR2353015) {
		ERR2353015 = eRR2353015;
	}

	public double getERR2353016() {
		return ERR2353016;
	}

	public void setERR2353016(double eRR2353016) {
		ERR2353016 = eRR2353016;
	}

	public double getERR2353587() {
		return ERR2353587;
	}

	public void setERR2353587(double eRR2353587) {
		ERR2353587 = eRR2353587;
	}

	public double getERR2353588() {
		return ERR2353588;
	}

	public void setERR2353588(double eRR2353588) {
		ERR2353588 = eRR2353588;
	}

	public double getERR2353589() {
		return ERR2353589;
	}

	public void setERR2353589(double eRR2353589) {
		ERR2353589 = eRR2353589;
	}

	public double getERR2353590() {
		return ERR2353590;
	}

	public void setERR2353590(double eRR2353590) {
		ERR2353590 = eRR2353590;
	}

	public double getERR2353591() {
		return ERR2353591;
	}

	public void setERR2353591(double eRR2353591) {
		ERR2353591 = eRR2353591;
	}

	public double getERR2353592() {
		return ERR2353592;
	}

	public void setERR2353592(double eRR2353592) {
		ERR2353592 = eRR2353592;
	}

	public double getERR2353593() {
		return ERR2353593;
	}

	public void setERR2353593(double eRR2353593) {
		ERR2353593 = eRR2353593;
	}

	public double getERR2353594() {
		return ERR2353594;
	}

	public void setERR2353594(double eRR2353594) {
		ERR2353594 = eRR2353594;
	}

	public double getERR2353595() {
		return ERR2353595;
	}

	public void setERR2353595(double eRR2353595) {
		ERR2353595 = eRR2353595;
	}

	public double getERR2353861() {
		return ERR2353861;
	}

	public void setERR2353861(double eRR2353861) {
		ERR2353861 = eRR2353861;
	}

	public double getERR2353862() {
		return ERR2353862;
	}

	public void setERR2353862(double eRR2353862) {
		ERR2353862 = eRR2353862;
	}

	public double getERR2353863() {
		return ERR2353863;
	}

	public void setERR2353863(double eRR2353863) {
		ERR2353863 = eRR2353863;
	}

	public double getERR2353864() {
		return ERR2353864;
	}

	public void setERR2353864(double eRR2353864) {
		ERR2353864 = eRR2353864;
	}

	public double getERR2353865() {
		return ERR2353865;
	}

	public void setERR2353865(double eRR2353865) {
		ERR2353865 = eRR2353865;
	}

	public double getERR2353866() {
		return ERR2353866;
	}

	public void setERR2353866(double eRR2353866) {
		ERR2353866 = eRR2353866;
	}

	public double getERR2353867() {
		return ERR2353867;
	}

	public void setERR2353867(double eRR2353867) {
		ERR2353867 = eRR2353867;
	}

	public double getERR2353868() {
		return ERR2353868;
	}

	public void setERR2353868(double eRR2353868) {
		ERR2353868 = eRR2353868;
	}

	public double getERR2353869() {
		return ERR2353869;
	}

	public void setERR2353869(double eRR2353869) {
		ERR2353869 = eRR2353869;
	}

	public double getERR2353870() {
		return ERR2353870;
	}

	public void setERR2353870(double eRR2353870) {
		ERR2353870 = eRR2353870;
	}

	public double getERR2353871() {
		return ERR2353871;
	}

	public void setERR2353871(double eRR2353871) {
		ERR2353871 = eRR2353871;
	}

	public double getERR2353872() {
		return ERR2353872;
	}

	public void setERR2353872(double eRR2353872) {
		ERR2353872 = eRR2353872;
	}

	public double getERR2353873() {
		return ERR2353873;
	}

	public void setERR2353873(double eRR2353873) {
		ERR2353873 = eRR2353873;
	}

	public double getERR2353874() {
		return ERR2353874;
	}

	public void setERR2353874(double eRR2353874) {
		ERR2353874 = eRR2353874;
	}

	public double getERR2353875() {
		return ERR2353875;
	}

	public void setERR2353875(double eRR2353875) {
		ERR2353875 = eRR2353875;
	}

	public double getERR2353876() {
		return ERR2353876;
	}

	public void setERR2353876(double eRR2353876) {
		ERR2353876 = eRR2353876;
	}

	@Override
	public String toString() {
		return "Palatine_tonsil [id=" + id + ", gene=" + gene + ", ERR2353010=" + ERR2353010 + ", ERR2353011="
				+ ERR2353011 + ", ERR2353012=" + ERR2353012 + ", ERR2353013=" + ERR2353013 + ", ERR2353014="
				+ ERR2353014 + ", ERR2353015=" + ERR2353015 + ", ERR2353016=" + ERR2353016 + ", ERR2353587="
				+ ERR2353587 + ", ERR2353588=" + ERR2353588 + ", ERR2353589=" + ERR2353589 + ", ERR2353590="
				+ ERR2353590 + ", ERR2353591=" + ERR2353591 + ", ERR2353592=" + ERR2353592 + ", ERR2353593="
				+ ERR2353593 + ", ERR2353594=" + ERR2353594 + ", ERR2353595=" + ERR2353595 + ", ERR2353861="
				+ ERR2353861 + ", ERR2353862=" + ERR2353862 + ", ERR2353863=" + ERR2353863 + ", ERR2353864="
				+ ERR2353864 + ", ERR2353865=" + ERR2353865 + ", ERR2353866=" + ERR2353866 + ", ERR2353867="
				+ ERR2353867 + ", ERR2353868=" + ERR2353868 + ", ERR2353869=" + ERR2353869 + ", ERR2353870="
				+ ERR2353870 + ", ERR2353871=" + ERR2353871 + ", ERR2353872=" + ERR2353872 + ", ERR2353873="
				+ ERR2353873 + ", ERR2353874=" + ERR2353874 + ", ERR2353875=" + ERR2353875 + ", ERR2353876="
				+ ERR2353876 + "]";
	}
}
