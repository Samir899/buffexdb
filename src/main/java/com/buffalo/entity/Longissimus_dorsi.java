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
@Table(name = "longissimus_dorsi")
public class Longissimus_dorsi {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="SRR12023710")
	 private double SRR12023710;
	 
	 @Column(name="SRR12023712")
	 private double SRR12023712;
	 
	 @Column(name="SRR12023714")
	 private double SRR12023714;
	 
	 @Column(name="SRR12023715")
	 private double SRR12023715;
	 
	 @Column(name="SRR8318866")
	 private double SRR8318866;
	 
	 @Column(name="SRR8318867")
	 private double SRR8318867;
	 
	 @Column(name="SRR8318868")
	 private double SRR8318868;

	public Longissimus_dorsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Longissimus_dorsi(int id, Genes gene, double sRR12023710, double sRR12023712, double sRR12023714,
			double sRR12023715, double sRR8318866, double sRR8318867, double sRR8318868) {
		super();
		this.id = id;
		this.gene = gene;
		SRR12023710 = sRR12023710;
		SRR12023712 = sRR12023712;
		SRR12023714 = sRR12023714;
		SRR12023715 = sRR12023715;
		SRR8318866 = sRR8318866;
		SRR8318867 = sRR8318867;
		SRR8318868 = sRR8318868;
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

	public double getSRR12023710() {
		return SRR12023710;
	}

	public void setSRR12023710(double sRR12023710) {
		SRR12023710 = sRR12023710;
	}

	public double getSRR12023712() {
		return SRR12023712;
	}

	public void setSRR12023712(double sRR12023712) {
		SRR12023712 = sRR12023712;
	}

	public double getSRR12023714() {
		return SRR12023714;
	}

	public void setSRR12023714(double sRR12023714) {
		SRR12023714 = sRR12023714;
	}

	public double getSRR12023715() {
		return SRR12023715;
	}

	public void setSRR12023715(double sRR12023715) {
		SRR12023715 = sRR12023715;
	}

	public double getSRR8318866() {
		return SRR8318866;
	}

	public void setSRR8318866(double sRR8318866) {
		SRR8318866 = sRR8318866;
	}

	public double getSRR8318867() {
		return SRR8318867;
	}

	public void setSRR8318867(double sRR8318867) {
		SRR8318867 = sRR8318867;
	}

	public double getSRR8318868() {
		return SRR8318868;
	}

	public void setSRR8318868(double sRR8318868) {
		SRR8318868 = sRR8318868;
	}

	@Override
	public String toString() {
		return "Longissimus_dorsi [id=" + id + ", gene=" + gene + ", SRR12023710=" + SRR12023710 + ", SRR12023712="
				+ SRR12023712 + ", SRR12023714=" + SRR12023714 + ", SRR12023715=" + SRR12023715 + ", SRR8318866="
				+ SRR8318866 + ", SRR8318867=" + SRR8318867 + ", SRR8318868=" + SRR8318868 + "]";
	}
}
