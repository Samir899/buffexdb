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
@Table(name = "caecum")
public class Caecum {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	@Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2352775")
	 private double ERR2352775;
	 
	@Column(name="ERR2352776")
	 private double ERR2352776;
	
	@Column(name="ERR2352777")
	 private double ERR2352777;
	
	@Column(name="ERR2352778")
	 private double ERR2352778;
	
	@Column(name="ERR2352779")
	 private double ERR2352779;
	
	@Column(name="ERR2352780")
	 private double ERR2352780;
	
	@Column(name="ERR2352781")
	 private double ERR2352781;
	
	@Column(name="ERR2353123")
	 private double ERR2353123;
	
	@Column(name="ERR2353124")
	 private double ERR2353124;
	
	@Column(name="ERR2353125")
	 private double ERR2353125;
	
	@Column(name="ERR2353126")
	 private double ERR2353126;
	
	@Column(name="ERR2353127")
	 private double ERR2353127;
	
	@Column(name="ERR2353128")
	 private double ERR2353128;
	
	@Column(name="ERR2353129")
	 private double ERR2353129;
	
	@Column(name="ERR2353130")
	 private double ERR2353130;
	
	@Column(name="ERR2353131")
	 private double ERR2353131;
	
	@Column(name="ERR2353610")
	 private double ERR2353610;
	
	@Column(name="ERR2353611")
	 private double ERR2353611;
	
	@Column(name="ERR2353612")
	 private double ERR2353612;
	
	@Column(name="ERR2353613")
	 private double ERR2353613;
	
	@Column(name="ERR2353614")
	 private double ERR2353614;
	
	@Column(name="ERR2353615")
	 private double ERR2353615;
	
	@Column(name="ERR2353616")
	 private double ERR2353616;
	
	@Column(name="ERR2353992")
	 private double ERR2353992;
	
	@Column(name="ERR2353993")
	 private double ERR2353993;
	
	@Column(name="ERR2353994")
	 private double ERR2353994;
	
	@Column(name="ERR2353995")
	 private double ERR2353995;
	
	@Column(name="ERR2353996")
	 private double ERR2353996;
	
	@Column(name="ERR2353997")
	 private double ERR2353997;
	
	@Column(name="ERR2353998")
	 private double ERR2353998;
	
	@Column(name="ERR2353999")
	 private double ERR2353999;
	
	@Column(name="ERR2354000")
	 private double ERR2354000;

	public Caecum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caecum(int id, String geneId, double eRR2352775, double eRR2352776, double eRR2352777, double eRR2352778,
			double eRR2352779, double eRR2352780, double eRR2352781, double eRR2353123, double eRR2353124,
			double eRR2353125, double eRR2353126, double eRR2353127, double eRR2353128, double eRR2353129,
			double eRR2353130, double eRR2353131, double eRR2353610, double eRR2353611, double eRR2353612,
			double eRR2353613, double eRR2353614, double eRR2353615, double eRR2353616, double eRR2353992,
			double eRR2353993, double eRR2353994, double eRR2353995, double eRR2353996, double eRR2353997,
			double eRR2353998, double eRR2353999, double eRR2354000) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2352775 = eRR2352775;
		ERR2352776 = eRR2352776;
		ERR2352777 = eRR2352777;
		ERR2352778 = eRR2352778;
		ERR2352779 = eRR2352779;
		ERR2352780 = eRR2352780;
		ERR2352781 = eRR2352781;
		ERR2353123 = eRR2353123;
		ERR2353124 = eRR2353124;
		ERR2353125 = eRR2353125;
		ERR2353126 = eRR2353126;
		ERR2353127 = eRR2353127;
		ERR2353128 = eRR2353128;
		ERR2353129 = eRR2353129;
		ERR2353130 = eRR2353130;
		ERR2353131 = eRR2353131;
		ERR2353610 = eRR2353610;
		ERR2353611 = eRR2353611;
		ERR2353612 = eRR2353612;
		ERR2353613 = eRR2353613;
		ERR2353614 = eRR2353614;
		ERR2353615 = eRR2353615;
		ERR2353616 = eRR2353616;
		ERR2353992 = eRR2353992;
		ERR2353993 = eRR2353993;
		ERR2353994 = eRR2353994;
		ERR2353995 = eRR2353995;
		ERR2353996 = eRR2353996;
		ERR2353997 = eRR2353997;
		ERR2353998 = eRR2353998;
		ERR2353999 = eRR2353999;
		ERR2354000 = eRR2354000;
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

	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}

	public double getERR2352775() {
		return ERR2352775;
	}

	public void setERR2352775(double eRR2352775) {
		ERR2352775 = eRR2352775;
	}

	public double getERR2352776() {
		return ERR2352776;
	}

	public void setERR2352776(double eRR2352776) {
		ERR2352776 = eRR2352776;
	}

	public double getERR2352777() {
		return ERR2352777;
	}

	public void setERR2352777(double eRR2352777) {
		ERR2352777 = eRR2352777;
	}

	public double getERR2352778() {
		return ERR2352778;
	}

	public void setERR2352778(double eRR2352778) {
		ERR2352778 = eRR2352778;
	}

	public double getERR2352779() {
		return ERR2352779;
	}

	public void setERR2352779(double eRR2352779) {
		ERR2352779 = eRR2352779;
	}

	public double getERR2352780() {
		return ERR2352780;
	}

	public void setERR2352780(double eRR2352780) {
		ERR2352780 = eRR2352780;
	}

	public double getERR2352781() {
		return ERR2352781;
	}

	public void setERR2352781(double eRR2352781) {
		ERR2352781 = eRR2352781;
	}

	public double getERR2353123() {
		return ERR2353123;
	}

	public void setERR2353123(double eRR2353123) {
		ERR2353123 = eRR2353123;
	}

	public double getERR2353124() {
		return ERR2353124;
	}

	public void setERR2353124(double eRR2353124) {
		ERR2353124 = eRR2353124;
	}

	public double getERR2353125() {
		return ERR2353125;
	}

	public void setERR2353125(double eRR2353125) {
		ERR2353125 = eRR2353125;
	}

	public double getERR2353126() {
		return ERR2353126;
	}

	public void setERR2353126(double eRR2353126) {
		ERR2353126 = eRR2353126;
	}

	public double getERR2353127() {
		return ERR2353127;
	}

	public void setERR2353127(double eRR2353127) {
		ERR2353127 = eRR2353127;
	}

	public double getERR2353128() {
		return ERR2353128;
	}

	public void setERR2353128(double eRR2353128) {
		ERR2353128 = eRR2353128;
	}

	public double getERR2353129() {
		return ERR2353129;
	}

	public void setERR2353129(double eRR2353129) {
		ERR2353129 = eRR2353129;
	}

	public double getERR2353130() {
		return ERR2353130;
	}

	public void setERR2353130(double eRR2353130) {
		ERR2353130 = eRR2353130;
	}

	public double getERR2353131() {
		return ERR2353131;
	}

	public void setERR2353131(double eRR2353131) {
		ERR2353131 = eRR2353131;
	}

	public double getERR2353610() {
		return ERR2353610;
	}

	public void setERR2353610(double eRR2353610) {
		ERR2353610 = eRR2353610;
	}

	public double getERR2353611() {
		return ERR2353611;
	}

	public void setERR2353611(double eRR2353611) {
		ERR2353611 = eRR2353611;
	}

	public double getERR2353612() {
		return ERR2353612;
	}

	public void setERR2353612(double eRR2353612) {
		ERR2353612 = eRR2353612;
	}

	public double getERR2353613() {
		return ERR2353613;
	}

	public void setERR2353613(double eRR2353613) {
		ERR2353613 = eRR2353613;
	}

	public double getERR2353614() {
		return ERR2353614;
	}

	public void setERR2353614(double eRR2353614) {
		ERR2353614 = eRR2353614;
	}

	public double getERR2353615() {
		return ERR2353615;
	}

	public void setERR2353615(double eRR2353615) {
		ERR2353615 = eRR2353615;
	}

	public double getERR2353616() {
		return ERR2353616;
	}

	public void setERR2353616(double eRR2353616) {
		ERR2353616 = eRR2353616;
	}

	public double getERR2353992() {
		return ERR2353992;
	}

	public void setERR2353992(double eRR2353992) {
		ERR2353992 = eRR2353992;
	}

	public double getERR2353993() {
		return ERR2353993;
	}

	public void setERR2353993(double eRR2353993) {
		ERR2353993 = eRR2353993;
	}

	public double getERR2353994() {
		return ERR2353994;
	}

	public void setERR2353994(double eRR2353994) {
		ERR2353994 = eRR2353994;
	}

	public double getERR2353995() {
		return ERR2353995;
	}

	public void setERR2353995(double eRR2353995) {
		ERR2353995 = eRR2353995;
	}

	public double getERR2353996() {
		return ERR2353996;
	}

	public void setERR2353996(double eRR2353996) {
		ERR2353996 = eRR2353996;
	}

	public double getERR2353997() {
		return ERR2353997;
	}

	public void setERR2353997(double eRR2353997) {
		ERR2353997 = eRR2353997;
	}

	public double getERR2353998() {
		return ERR2353998;
	}

	public void setERR2353998(double eRR2353998) {
		ERR2353998 = eRR2353998;
	}

	public double getERR2353999() {
		return ERR2353999;
	}

	public void setERR2353999(double eRR2353999) {
		ERR2353999 = eRR2353999;
	}

	public double getERR2354000() {
		return ERR2354000;
	}

	public void setERR2354000(double eRR2354000) {
		ERR2354000 = eRR2354000;
	}

	@Override
	public String toString() {
		return "Caecum [id=" + id + ", geneId=" + geneId + ", ERR2352775=" + ERR2352775 + ", ERR2352776=" + ERR2352776
				+ ", ERR2352777=" + ERR2352777 + ", ERR2352778=" + ERR2352778 + ", ERR2352779=" + ERR2352779
				+ ", ERR2352780=" + ERR2352780 + ", ERR2352781=" + ERR2352781 + ", ERR2353123=" + ERR2353123
				+ ", ERR2353124=" + ERR2353124 + ", ERR2353125=" + ERR2353125 + ", ERR2353126=" + ERR2353126
				+ ", ERR2353127=" + ERR2353127 + ", ERR2353128=" + ERR2353128 + ", ERR2353129=" + ERR2353129
				+ ", ERR2353130=" + ERR2353130 + ", ERR2353131=" + ERR2353131 + ", ERR2353610=" + ERR2353610
				+ ", ERR2353611=" + ERR2353611 + ", ERR2353612=" + ERR2353612 + ", ERR2353613=" + ERR2353613
				+ ", ERR2353614=" + ERR2353614 + ", ERR2353615=" + ERR2353615 + ", ERR2353616=" + ERR2353616
				+ ", ERR2353992=" + ERR2353992 + ", ERR2353993=" + ERR2353993 + ", ERR2353994=" + ERR2353994
				+ ", ERR2353995=" + ERR2353995 + ", ERR2353996=" + ERR2353996 + ", ERR2353997=" + ERR2353997
				+ ", ERR2353998=" + ERR2353998 + ", ERR2353999=" + ERR2353999 + ", ERR2354000=" + ERR2354000 + "]";
	}
}
