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
@Table(name = "prescapular_lymph_node")
public class Prescapular_lymph_node {


	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @ManyToOne
	 @JoinColumn(name = "geneId")
	 Genes gene;
	 
	 @Column(name="ERR2352929")
	 private double ERR2352929;

	@Column(name="ERR2352930")
	 private double ERR2352930;

	@Column(name="ERR2352931")
	 private double ERR2352931;

	@Column(name="ERR2352932")
	 private double ERR2352932;

	@Column(name="ERR2352933")
	 private double ERR2352933;

	@Column(name="ERR2352934")
	 private double ERR2352934;

	@Column(name="ERR2352935")
	 private double ERR2352935;

	@Column(name="ERR2353442")
	 private double ERR2353442;

	@Column(name="ERR2353443")
	 private double ERR2353443;

	@Column(name="ERR2353444")
	 private double ERR2353444;

	@Column(name="ERR2353445")
	 private double ERR2353445;

	@Column(name="ERR2353446")
	 private double ERR2353446;

	@Column(name="ERR2353447")
	 private double ERR2353447;

	@Column(name="ERR2353448")
	 private double ERR2353448;

	@Column(name="ERR2353449")
	 private double ERR2353449;

	@Column(name="ERR2353450")
	 private double ERR2353450;

	@Column(name="ERR2353771")
	 private double ERR2353771;

	@Column(name="ERR2353772")
	 private double ERR2353772;

	@Column(name="ERR2353773")
	 private double ERR2353773;

	@Column(name="ERR2353774")
	 private double ERR2353774;

	@Column(name="ERR2353775")
	 private double ERR2353775;

	@Column(name="ERR2353776")
	 private double ERR2353776;

	@Column(name="ERR2353777")
	 private double ERR2353777;

	@Column(name="ERR2354261")
	 private double ERR2354261;

	@Column(name="ERR2354262")
	 private double ERR2354262;

	@Column(name="ERR2354263")
	 private double ERR2354263;

	@Column(name="ERR2354264")
	 private double ERR2354264;

	@Column(name="ERR2354265")
	 private double ERR2354265;

	@Column(name="ERR2354266")
	 private double ERR2354266;

	@Column(name="ERR2354267")
	 private double ERR2354267;

	@Column(name="ERR2354268")
	 private double ERR2354268;

	@Column(name="ERR2354269")
	 private double ERR2354269;

	public Prescapular_lymph_node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prescapular_lymph_node(int id, Genes gene, double eRR2352929, double eRR2352930, double eRR2352931,
			double eRR2352932, double eRR2352933, double eRR2352934, double eRR2352935, double eRR2353442,
			double eRR2353443, double eRR2353444, double eRR2353445, double eRR2353446, double eRR2353447,
			double eRR2353448, double eRR2353449, double eRR2353450, double eRR2353771, double eRR2353772,
			double eRR2353773, double eRR2353774, double eRR2353775, double eRR2353776, double eRR2353777,
			double eRR2354261, double eRR2354262, double eRR2354263, double eRR2354264, double eRR2354265,
			double eRR2354266, double eRR2354267, double eRR2354268, double eRR2354269) {
		super();
		this.id = id;
		this.gene = gene;
		ERR2352929 = eRR2352929;
		ERR2352930 = eRR2352930;
		ERR2352931 = eRR2352931;
		ERR2352932 = eRR2352932;
		ERR2352933 = eRR2352933;
		ERR2352934 = eRR2352934;
		ERR2352935 = eRR2352935;
		ERR2353442 = eRR2353442;
		ERR2353443 = eRR2353443;
		ERR2353444 = eRR2353444;
		ERR2353445 = eRR2353445;
		ERR2353446 = eRR2353446;
		ERR2353447 = eRR2353447;
		ERR2353448 = eRR2353448;
		ERR2353449 = eRR2353449;
		ERR2353450 = eRR2353450;
		ERR2353771 = eRR2353771;
		ERR2353772 = eRR2353772;
		ERR2353773 = eRR2353773;
		ERR2353774 = eRR2353774;
		ERR2353775 = eRR2353775;
		ERR2353776 = eRR2353776;
		ERR2353777 = eRR2353777;
		ERR2354261 = eRR2354261;
		ERR2354262 = eRR2354262;
		ERR2354263 = eRR2354263;
		ERR2354264 = eRR2354264;
		ERR2354265 = eRR2354265;
		ERR2354266 = eRR2354266;
		ERR2354267 = eRR2354267;
		ERR2354268 = eRR2354268;
		ERR2354269 = eRR2354269;
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

	public double getERR2352929() {
		return ERR2352929;
	}

	public void setERR2352929(double eRR2352929) {
		ERR2352929 = eRR2352929;
	}

	public double getERR2352930() {
		return ERR2352930;
	}

	public void setERR2352930(double eRR2352930) {
		ERR2352930 = eRR2352930;
	}

	public double getERR2352931() {
		return ERR2352931;
	}

	public void setERR2352931(double eRR2352931) {
		ERR2352931 = eRR2352931;
	}

	public double getERR2352932() {
		return ERR2352932;
	}

	public void setERR2352932(double eRR2352932) {
		ERR2352932 = eRR2352932;
	}

	public double getERR2352933() {
		return ERR2352933;
	}

	public void setERR2352933(double eRR2352933) {
		ERR2352933 = eRR2352933;
	}

	public double getERR2352934() {
		return ERR2352934;
	}

	public void setERR2352934(double eRR2352934) {
		ERR2352934 = eRR2352934;
	}

	public double getERR2352935() {
		return ERR2352935;
	}

	public void setERR2352935(double eRR2352935) {
		ERR2352935 = eRR2352935;
	}

	public double getERR2353442() {
		return ERR2353442;
	}

	public void setERR2353442(double eRR2353442) {
		ERR2353442 = eRR2353442;
	}

	public double getERR2353443() {
		return ERR2353443;
	}

	public void setERR2353443(double eRR2353443) {
		ERR2353443 = eRR2353443;
	}

	public double getERR2353444() {
		return ERR2353444;
	}

	public void setERR2353444(double eRR2353444) {
		ERR2353444 = eRR2353444;
	}

	public double getERR2353445() {
		return ERR2353445;
	}

	public void setERR2353445(double eRR2353445) {
		ERR2353445 = eRR2353445;
	}

	public double getERR2353446() {
		return ERR2353446;
	}

	public void setERR2353446(double eRR2353446) {
		ERR2353446 = eRR2353446;
	}

	public double getERR2353447() {
		return ERR2353447;
	}

	public void setERR2353447(double eRR2353447) {
		ERR2353447 = eRR2353447;
	}

	public double getERR2353448() {
		return ERR2353448;
	}

	public void setERR2353448(double eRR2353448) {
		ERR2353448 = eRR2353448;
	}

	public double getERR2353449() {
		return ERR2353449;
	}

	public void setERR2353449(double eRR2353449) {
		ERR2353449 = eRR2353449;
	}

	public double getERR2353450() {
		return ERR2353450;
	}

	public void setERR2353450(double eRR2353450) {
		ERR2353450 = eRR2353450;
	}

	public double getERR2353771() {
		return ERR2353771;
	}

	public void setERR2353771(double eRR2353771) {
		ERR2353771 = eRR2353771;
	}

	public double getERR2353772() {
		return ERR2353772;
	}

	public void setERR2353772(double eRR2353772) {
		ERR2353772 = eRR2353772;
	}

	public double getERR2353773() {
		return ERR2353773;
	}

	public void setERR2353773(double eRR2353773) {
		ERR2353773 = eRR2353773;
	}

	public double getERR2353774() {
		return ERR2353774;
	}

	public void setERR2353774(double eRR2353774) {
		ERR2353774 = eRR2353774;
	}

	public double getERR2353775() {
		return ERR2353775;
	}

	public void setERR2353775(double eRR2353775) {
		ERR2353775 = eRR2353775;
	}

	public double getERR2353776() {
		return ERR2353776;
	}

	public void setERR2353776(double eRR2353776) {
		ERR2353776 = eRR2353776;
	}

	public double getERR2353777() {
		return ERR2353777;
	}

	public void setERR2353777(double eRR2353777) {
		ERR2353777 = eRR2353777;
	}

	public double getERR2354261() {
		return ERR2354261;
	}

	public void setERR2354261(double eRR2354261) {
		ERR2354261 = eRR2354261;
	}

	public double getERR2354262() {
		return ERR2354262;
	}

	public void setERR2354262(double eRR2354262) {
		ERR2354262 = eRR2354262;
	}

	public double getERR2354263() {
		return ERR2354263;
	}

	public void setERR2354263(double eRR2354263) {
		ERR2354263 = eRR2354263;
	}

	public double getERR2354264() {
		return ERR2354264;
	}

	public void setERR2354264(double eRR2354264) {
		ERR2354264 = eRR2354264;
	}

	public double getERR2354265() {
		return ERR2354265;
	}

	public void setERR2354265(double eRR2354265) {
		ERR2354265 = eRR2354265;
	}

	public double getERR2354266() {
		return ERR2354266;
	}

	public void setERR2354266(double eRR2354266) {
		ERR2354266 = eRR2354266;
	}

	public double getERR2354267() {
		return ERR2354267;
	}

	public void setERR2354267(double eRR2354267) {
		ERR2354267 = eRR2354267;
	}

	public double getERR2354268() {
		return ERR2354268;
	}

	public void setERR2354268(double eRR2354268) {
		ERR2354268 = eRR2354268;
	}

	public double getERR2354269() {
		return ERR2354269;
	}

	public void setERR2354269(double eRR2354269) {
		ERR2354269 = eRR2354269;
	}

	@Override
	public String toString() {
		return "Prescapular_lymph_node [id=" + id + ", gene=" + gene + ", ERR2352929=" + ERR2352929 + ", ERR2352930="
				+ ERR2352930 + ", ERR2352931=" + ERR2352931 + ", ERR2352932=" + ERR2352932 + ", ERR2352933="
				+ ERR2352933 + ", ERR2352934=" + ERR2352934 + ", ERR2352935=" + ERR2352935 + ", ERR2353442="
				+ ERR2353442 + ", ERR2353443=" + ERR2353443 + ", ERR2353444=" + ERR2353444 + ", ERR2353445="
				+ ERR2353445 + ", ERR2353446=" + ERR2353446 + ", ERR2353447=" + ERR2353447 + ", ERR2353448="
				+ ERR2353448 + ", ERR2353449=" + ERR2353449 + ", ERR2353450=" + ERR2353450 + ", ERR2353771="
				+ ERR2353771 + ", ERR2353772=" + ERR2353772 + ", ERR2353773=" + ERR2353773 + ", ERR2353774="
				+ ERR2353774 + ", ERR2353775=" + ERR2353775 + ", ERR2353776=" + ERR2353776 + ", ERR2353777="
				+ ERR2353777 + ", ERR2354261=" + ERR2354261 + ", ERR2354262=" + ERR2354262 + ", ERR2354263="
				+ ERR2354263 + ", ERR2354264=" + ERR2354264 + ", ERR2354265=" + ERR2354265 + ", ERR2354266="
				+ ERR2354266 + ", ERR2354267=" + ERR2354267 + ", ERR2354268=" + ERR2354268 + ", ERR2354269="
				+ ERR2354269 + "]";
	}
}
