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
@Table(name = "reticulum_b")
public class Reticulum_B {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2354682")
	 private double ERR2354682;

	 @Column(name="ERR2354683")
	 private double ERR2354683;

	 @Column(name="ERR2354684")
	 private double ERR2354684;

	 @Column(name="ERR2354685")
	 private double ERR2354685;

	 @Column(name="ERR2354686")
	 private double ERR2354686;

	 @Column(name="ERR2354687")
	 private double ERR2354687;

	 @Column(name="ERR2354688")
	 private double ERR2354688;

	 @Column(name="ERR2354889")
	 private double ERR2354889;

	 @Column(name="ERR2354890")
	 private double ERR2354890;

	 @Column(name="ERR2354891")
	 private double ERR2354891;

	 @Column(name="ERR2354892")
	 private double ERR2354892;

	 @Column(name="ERR2354893")
	 private double ERR2354893;

	 @Column(name="ERR2354894")
	 private double ERR2354894;

	 @Column(name="ERR2354895")
	 private double ERR2354895;

	 @Column(name="ERR2354896")
	 private double ERR2354896;

	 @Column(name="ERR2354897")
	 private double ERR2354897;

	 @Column(name="ERR2354898")
	 private double ERR2354898;

	 @Column(name="ERR2354899")
	 private double ERR2354899;

	 @Column(name="ERR2354900")
	 private double ERR2354900;

	 @Column(name="ERR2354901")
	 private double ERR2354901;

	 @Column(name="ERR2354902")
	 private double ERR2354902;

	 @Column(name="ERR2354903")
	 private double ERR2354903;

	 @Column(name="ERR2354904")
	 private double ERR2354904;

	 @Column(name="ERR2354905")
	 private double ERR2354905;

	 @Column(name="ERR2354906")
	 private double ERR2354906;

	 @Column(name="ERR2354907")
	 private double ERR2354907;

	 @Column(name="ERR2354908")
	 private double ERR2354908;

	 @Column(name="ERR2354909")
	 private double ERR2354909;

	 @Column(name="ERR2354910")
	 private double ERR2354910;

	 @Column(name="ERR2354911")
	 private double ERR2354911;

	 @Column(name="ERR2355026")
	 private double ERR2355026;

	 @Column(name="ERR2355027")
	 private double ERR2355027;

	 @Column(name="ERR2355028")
	 private double ERR2355028;

	 @Column(name="ERR2355029")
	 private double ERR2355029;

	 @Column(name="ERR2355030")
	 private double ERR2355030;

	 @Column(name="ERR2355031")
	 private double ERR2355031;

	 @Column(name="ERR2355032")
	 private double ERR2355032;

	 @Column(name="ERR2355033")
	 private double ERR2355033;

	 @Column(name="ERR2355034")
	 private double ERR2355034;

	 @Column(name="ERR2355035")
	 private double ERR2355035;

	 @Column(name="ERR2355036")
	 private double ERR2355036;

	 @Column(name="ERR2355037")
	 private double ERR2355037;

	 @Column(name="ERR2355038")
	 private double ERR2355038;

	 @Column(name="ERR2355039")
	 private double ERR2355039;

	 @Column(name="ERR2355040")
	 private double ERR2355040;

	 @Column(name="ERR2355041")
	 private double ERR2355041;

	 @Column(name="ERR2355042")
	 private double ERR2355042;

	 @Column(name="ERR2355043")
	 private double ERR2355043;

	 @Column(name="ERR2355044")
	 private double ERR2355044;

	 @Column(name="ERR2355045")
	 private double ERR2355045;

	 @Column(name="ERR2355046")
	 private double ERR2355046;

	 @Column(name="ERR2355047")
	 private double ERR2355047;

	 @Column(name="ERR2355048")
	 private double ERR2355048;

	public Reticulum_B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reticulum_B(int id, String geneId, double eRR2354682, double eRR2354683, double eRR2354684, double eRR2354685,
			double eRR2354686, double eRR2354687, double eRR2354688, double eRR2354889, double eRR2354890,
			double eRR2354891, double eRR2354892, double eRR2354893, double eRR2354894, double eRR2354895,
			double eRR2354896, double eRR2354897, double eRR2354898, double eRR2354899, double eRR2354900,
			double eRR2354901, double eRR2354902, double eRR2354903, double eRR2354904, double eRR2354905,
			double eRR2354906, double eRR2354907, double eRR2354908, double eRR2354909, double eRR2354910,
			double eRR2354911, double eRR2355026, double eRR2355027, double eRR2355028, double eRR2355029,
			double eRR2355030, double eRR2355031, double eRR2355032, double eRR2355033, double eRR2355034,
			double eRR2355035, double eRR2355036, double eRR2355037, double eRR2355038, double eRR2355039,
			double eRR2355040, double eRR2355041, double eRR2355042, double eRR2355043, double eRR2355044,
			double eRR2355045, double eRR2355046, double eRR2355047, double eRR2355048) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2354682 = eRR2354682;
		ERR2354683 = eRR2354683;
		ERR2354684 = eRR2354684;
		ERR2354685 = eRR2354685;
		ERR2354686 = eRR2354686;
		ERR2354687 = eRR2354687;
		ERR2354688 = eRR2354688;
		ERR2354889 = eRR2354889;
		ERR2354890 = eRR2354890;
		ERR2354891 = eRR2354891;
		ERR2354892 = eRR2354892;
		ERR2354893 = eRR2354893;
		ERR2354894 = eRR2354894;
		ERR2354895 = eRR2354895;
		ERR2354896 = eRR2354896;
		ERR2354897 = eRR2354897;
		ERR2354898 = eRR2354898;
		ERR2354899 = eRR2354899;
		ERR2354900 = eRR2354900;
		ERR2354901 = eRR2354901;
		ERR2354902 = eRR2354902;
		ERR2354903 = eRR2354903;
		ERR2354904 = eRR2354904;
		ERR2354905 = eRR2354905;
		ERR2354906 = eRR2354906;
		ERR2354907 = eRR2354907;
		ERR2354908 = eRR2354908;
		ERR2354909 = eRR2354909;
		ERR2354910 = eRR2354910;
		ERR2354911 = eRR2354911;
		ERR2355026 = eRR2355026;
		ERR2355027 = eRR2355027;
		ERR2355028 = eRR2355028;
		ERR2355029 = eRR2355029;
		ERR2355030 = eRR2355030;
		ERR2355031 = eRR2355031;
		ERR2355032 = eRR2355032;
		ERR2355033 = eRR2355033;
		ERR2355034 = eRR2355034;
		ERR2355035 = eRR2355035;
		ERR2355036 = eRR2355036;
		ERR2355037 = eRR2355037;
		ERR2355038 = eRR2355038;
		ERR2355039 = eRR2355039;
		ERR2355040 = eRR2355040;
		ERR2355041 = eRR2355041;
		ERR2355042 = eRR2355042;
		ERR2355043 = eRR2355043;
		ERR2355044 = eRR2355044;
		ERR2355045 = eRR2355045;
		ERR2355046 = eRR2355046;
		ERR2355047 = eRR2355047;
		ERR2355048 = eRR2355048;
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

	public double getERR2354682() {
		return ERR2354682;
	}

	public void setERR2354682(double eRR2354682) {
		ERR2354682 = eRR2354682;
	}

	public double getERR2354683() {
		return ERR2354683;
	}

	public void setERR2354683(double eRR2354683) {
		ERR2354683 = eRR2354683;
	}

	public double getERR2354684() {
		return ERR2354684;
	}

	public void setERR2354684(double eRR2354684) {
		ERR2354684 = eRR2354684;
	}

	public double getERR2354685() {
		return ERR2354685;
	}

	public void setERR2354685(double eRR2354685) {
		ERR2354685 = eRR2354685;
	}

	public double getERR2354686() {
		return ERR2354686;
	}

	public void setERR2354686(double eRR2354686) {
		ERR2354686 = eRR2354686;
	}

	public double getERR2354687() {
		return ERR2354687;
	}

	public void setERR2354687(double eRR2354687) {
		ERR2354687 = eRR2354687;
	}

	public double getERR2354688() {
		return ERR2354688;
	}

	public void setERR2354688(double eRR2354688) {
		ERR2354688 = eRR2354688;
	}

	public double getERR2354889() {
		return ERR2354889;
	}

	public void setERR2354889(double eRR2354889) {
		ERR2354889 = eRR2354889;
	}

	public double getERR2354890() {
		return ERR2354890;
	}

	public void setERR2354890(double eRR2354890) {
		ERR2354890 = eRR2354890;
	}

	public double getERR2354891() {
		return ERR2354891;
	}

	public void setERR2354891(double eRR2354891) {
		ERR2354891 = eRR2354891;
	}

	public double getERR2354892() {
		return ERR2354892;
	}

	public void setERR2354892(double eRR2354892) {
		ERR2354892 = eRR2354892;
	}

	public double getERR2354893() {
		return ERR2354893;
	}

	public void setERR2354893(double eRR2354893) {
		ERR2354893 = eRR2354893;
	}

	public double getERR2354894() {
		return ERR2354894;
	}

	public void setERR2354894(double eRR2354894) {
		ERR2354894 = eRR2354894;
	}

	public double getERR2354895() {
		return ERR2354895;
	}

	public void setERR2354895(double eRR2354895) {
		ERR2354895 = eRR2354895;
	}

	public double getERR2354896() {
		return ERR2354896;
	}

	public void setERR2354896(double eRR2354896) {
		ERR2354896 = eRR2354896;
	}

	public double getERR2354897() {
		return ERR2354897;
	}

	public void setERR2354897(double eRR2354897) {
		ERR2354897 = eRR2354897;
	}

	public double getERR2354898() {
		return ERR2354898;
	}

	public void setERR2354898(double eRR2354898) {
		ERR2354898 = eRR2354898;
	}

	public double getERR2354899() {
		return ERR2354899;
	}

	public void setERR2354899(double eRR2354899) {
		ERR2354899 = eRR2354899;
	}

	public double getERR2354900() {
		return ERR2354900;
	}

	public void setERR2354900(double eRR2354900) {
		ERR2354900 = eRR2354900;
	}

	public double getERR2354901() {
		return ERR2354901;
	}

	public void setERR2354901(double eRR2354901) {
		ERR2354901 = eRR2354901;
	}

	public double getERR2354902() {
		return ERR2354902;
	}

	public void setERR2354902(double eRR2354902) {
		ERR2354902 = eRR2354902;
	}

	public double getERR2354903() {
		return ERR2354903;
	}

	public void setERR2354903(double eRR2354903) {
		ERR2354903 = eRR2354903;
	}

	public double getERR2354904() {
		return ERR2354904;
	}

	public void setERR2354904(double eRR2354904) {
		ERR2354904 = eRR2354904;
	}

	public double getERR2354905() {
		return ERR2354905;
	}

	public void setERR2354905(double eRR2354905) {
		ERR2354905 = eRR2354905;
	}

	public double getERR2354906() {
		return ERR2354906;
	}

	public void setERR2354906(double eRR2354906) {
		ERR2354906 = eRR2354906;
	}

	public double getERR2354907() {
		return ERR2354907;
	}

	public void setERR2354907(double eRR2354907) {
		ERR2354907 = eRR2354907;
	}

	public double getERR2354908() {
		return ERR2354908;
	}

	public void setERR2354908(double eRR2354908) {
		ERR2354908 = eRR2354908;
	}

	public double getERR2354909() {
		return ERR2354909;
	}

	public void setERR2354909(double eRR2354909) {
		ERR2354909 = eRR2354909;
	}

	public double getERR2354910() {
		return ERR2354910;
	}

	public void setERR2354910(double eRR2354910) {
		ERR2354910 = eRR2354910;
	}

	public double getERR2354911() {
		return ERR2354911;
	}

	public void setERR2354911(double eRR2354911) {
		ERR2354911 = eRR2354911;
	}

	public double getERR2355026() {
		return ERR2355026;
	}

	public void setERR2355026(double eRR2355026) {
		ERR2355026 = eRR2355026;
	}

	public double getERR2355027() {
		return ERR2355027;
	}

	public void setERR2355027(double eRR2355027) {
		ERR2355027 = eRR2355027;
	}

	public double getERR2355028() {
		return ERR2355028;
	}

	public void setERR2355028(double eRR2355028) {
		ERR2355028 = eRR2355028;
	}

	public double getERR2355029() {
		return ERR2355029;
	}

	public void setERR2355029(double eRR2355029) {
		ERR2355029 = eRR2355029;
	}

	public double getERR2355030() {
		return ERR2355030;
	}

	public void setERR2355030(double eRR2355030) {
		ERR2355030 = eRR2355030;
	}

	public double getERR2355031() {
		return ERR2355031;
	}

	public void setERR2355031(double eRR2355031) {
		ERR2355031 = eRR2355031;
	}

	public double getERR2355032() {
		return ERR2355032;
	}

	public void setERR2355032(double eRR2355032) {
		ERR2355032 = eRR2355032;
	}

	public double getERR2355033() {
		return ERR2355033;
	}

	public void setERR2355033(double eRR2355033) {
		ERR2355033 = eRR2355033;
	}

	public double getERR2355034() {
		return ERR2355034;
	}

	public void setERR2355034(double eRR2355034) {
		ERR2355034 = eRR2355034;
	}

	public double getERR2355035() {
		return ERR2355035;
	}

	public void setERR2355035(double eRR2355035) {
		ERR2355035 = eRR2355035;
	}

	public double getERR2355036() {
		return ERR2355036;
	}

	public void setERR2355036(double eRR2355036) {
		ERR2355036 = eRR2355036;
	}

	public double getERR2355037() {
		return ERR2355037;
	}

	public void setERR2355037(double eRR2355037) {
		ERR2355037 = eRR2355037;
	}

	public double getERR2355038() {
		return ERR2355038;
	}

	public void setERR2355038(double eRR2355038) {
		ERR2355038 = eRR2355038;
	}

	public double getERR2355039() {
		return ERR2355039;
	}

	public void setERR2355039(double eRR2355039) {
		ERR2355039 = eRR2355039;
	}

	public double getERR2355040() {
		return ERR2355040;
	}

	public void setERR2355040(double eRR2355040) {
		ERR2355040 = eRR2355040;
	}

	public double getERR2355041() {
		return ERR2355041;
	}

	public void setERR2355041(double eRR2355041) {
		ERR2355041 = eRR2355041;
	}

	public double getERR2355042() {
		return ERR2355042;
	}

	public void setERR2355042(double eRR2355042) {
		ERR2355042 = eRR2355042;
	}

	public double getERR2355043() {
		return ERR2355043;
	}

	public void setERR2355043(double eRR2355043) {
		ERR2355043 = eRR2355043;
	}

	public double getERR2355044() {
		return ERR2355044;
	}

	public void setERR2355044(double eRR2355044) {
		ERR2355044 = eRR2355044;
	}

	public double getERR2355045() {
		return ERR2355045;
	}

	public void setERR2355045(double eRR2355045) {
		ERR2355045 = eRR2355045;
	}

	public double getERR2355046() {
		return ERR2355046;
	}

	public void setERR2355046(double eRR2355046) {
		ERR2355046 = eRR2355046;
	}

	public double getERR2355047() {
		return ERR2355047;
	}

	public void setERR2355047(double eRR2355047) {
		ERR2355047 = eRR2355047;
	}

	public double getERR2355048() {
		return ERR2355048;
	}

	public void setERR2355048(double eRR2355048) {
		ERR2355048 = eRR2355048;
	}

	@Override
	public String toString() {
		return "Reticulum_B [id=" + id + ", geneId=" + geneId + ", ERR2354682=" + ERR2354682 + ", ERR2354683=" + ERR2354683
				+ ", ERR2354684=" + ERR2354684 + ", ERR2354685=" + ERR2354685 + ", ERR2354686=" + ERR2354686
				+ ", ERR2354687=" + ERR2354687 + ", ERR2354688=" + ERR2354688 + ", ERR2354889=" + ERR2354889
				+ ", ERR2354890=" + ERR2354890 + ", ERR2354891=" + ERR2354891 + ", ERR2354892=" + ERR2354892
				+ ", ERR2354893=" + ERR2354893 + ", ERR2354894=" + ERR2354894 + ", ERR2354895=" + ERR2354895
				+ ", ERR2354896=" + ERR2354896 + ", ERR2354897=" + ERR2354897 + ", ERR2354898=" + ERR2354898
				+ ", ERR2354899=" + ERR2354899 + ", ERR2354900=" + ERR2354900 + ", ERR2354901=" + ERR2354901
				+ ", ERR2354902=" + ERR2354902 + ", ERR2354903=" + ERR2354903 + ", ERR2354904=" + ERR2354904
				+ ", ERR2354905=" + ERR2354905 + ", ERR2354906=" + ERR2354906 + ", ERR2354907=" + ERR2354907
				+ ", ERR2354908=" + ERR2354908 + ", ERR2354909=" + ERR2354909 + ", ERR2354910=" + ERR2354910
				+ ", ERR2354911=" + ERR2354911 + ", ERR2355026=" + ERR2355026 + ", ERR2355027=" + ERR2355027
				+ ", ERR2355028=" + ERR2355028 + ", ERR2355029=" + ERR2355029 + ", ERR2355030=" + ERR2355030
				+ ", ERR2355031=" + ERR2355031 + ", ERR2355032=" + ERR2355032 + ", ERR2355033=" + ERR2355033
				+ ", ERR2355034=" + ERR2355034 + ", ERR2355035=" + ERR2355035 + ", ERR2355036=" + ERR2355036
				+ ", ERR2355037=" + ERR2355037 + ", ERR2355038=" + ERR2355038 + ", ERR2355039=" + ERR2355039
				+ ", ERR2355040=" + ERR2355040 + ", ERR2355041=" + ERR2355041 + ", ERR2355042=" + ERR2355042
				+ ", ERR2355043=" + ERR2355043 + ", ERR2355044=" + ERR2355044 + ", ERR2355045=" + ERR2355045
				+ ", ERR2355046=" + ERR2355046 + ", ERR2355047=" + ERR2355047 + ", ERR2355048=" + ERR2355048 + "]";
	}
	 
	 
}
