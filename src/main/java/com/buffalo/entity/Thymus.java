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
@Table(name = "thymus")
public class Thymus {

	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	 @Column(name = "geneId")
	 String geneId;
	 
	 @Column(name="ERR2353001")
	 private double ERR2353001;

	 @Column(name="ERR2353002")
	 private double ERR2353002;

	 @Column(name="ERR2353003")
	 private double ERR2353003;

	 @Column(name="ERR2353004")
	 private double ERR2353004;

	 @Column(name="ERR2353005")
	 private double ERR2353005;

	 @Column(name="ERR2353006")
	 private double ERR2353006;

	 @Column(name="ERR2353007")
	 private double ERR2353007;

	 @Column(name="ERR2353008")
	 private double ERR2353008;

	 @Column(name="ERR2353009")
	 private double ERR2353009;

	 @Column(name="ERR2353564")
	 private double ERR2353564;

	 @Column(name="ERR2353565")
	 private double ERR2353565;

	 @Column(name="ERR2353566")
	 private double ERR2353566;

	 @Column(name="ERR2353567")
	 private double ERR2353567;

	 @Column(name="ERR2353568")
	 private double ERR2353568;

	 @Column(name="ERR2353569")
	 private double ERR2353569;

	 @Column(name="ERR2353570")
	 private double ERR2353570;

	 @Column(name="ERR2353571")
	 private double ERR2353571;

	 @Column(name="ERR2353572")
	 private double ERR2353572;

	 @Column(name="ERR2353573")
	 private double ERR2353573;

	 @Column(name="ERR2353574")
	 private double ERR2353574;

	 @Column(name="ERR2353575")
	 private double ERR2353575;

	 @Column(name="ERR2353576")
	 private double ERR2353576;

	 @Column(name="ERR2353577")
	 private double ERR2353577;

	 @Column(name="ERR2353578")
	 private double ERR2353578;

	 @Column(name="ERR2353579")
	 private double ERR2353579;

	 @Column(name="ERR2353580")
	 private double ERR2353580;

	 @Column(name="ERR2353581")
	 private double ERR2353581;

	 @Column(name="ERR2353582")
	 private double ERR2353582;

	 @Column(name="ERR2353583")
	 private double ERR2353583;

	 @Column(name="ERR2353584")
	 private double ERR2353584;

	 @Column(name="ERR2353585")
	 private double ERR2353585;

	 @Column(name="ERR2353586")
	 private double ERR2353586;

	 @Column(name="ERR2353852")
	 private double ERR2353852;

	 @Column(name="ERR2353853")
	 private double ERR2353853;

	 @Column(name="ERR2353854")
	 private double ERR2353854;

	 @Column(name="ERR2353855")
	 private double ERR2353855;

	 @Column(name="ERR2353856")
	 private double ERR2353856;

	 @Column(name="ERR2353857")
	 private double ERR2353857;

	 @Column(name="ERR2353858")
	 private double ERR2353858;

	 @Column(name="ERR2353859")
	 private double ERR2353859;

	 @Column(name="ERR2353860")
	 private double ERR2353860;

	 @Column(name="ERR2354406")
	 private double ERR2354406;

	 @Column(name="ERR2354407")
	 private double ERR2354407;

	 @Column(name="ERR2354408")
	 private double ERR2354408;

	 @Column(name="ERR2354409")
	 private double ERR2354409;

	 @Column(name="ERR2354410")
	 private double ERR2354410;

	 @Column(name="ERR2354411")
	 private double ERR2354411;

	 @Column(name="ERR2354412")
	 private double ERR2354412;

	 @Column(name="ERR2354413")
	 private double ERR2354413;

	 @Column(name="ERR2354414")
	 private double ERR2354414;

	 @Column(name="ERR2354415")
	 private double ERR2354415;

	 @Column(name="ERR2354416")
	 private double ERR2354416;

	 @Column(name="ERR2354417")
	 private double ERR2354417;

	 @Column(name="ERR2354418")
	 private double ERR2354418;

	 @Column(name="ERR2354419")
	 private double ERR2354419;

	 @Column(name="ERR2354420")
	 private double ERR2354420;

	 @Column(name="ERR2354421")
	 private double ERR2354421;

	 @Column(name="ERR2354422")
	 private double ERR2354422;

	 @Column(name="ERR2354423")
	 private double ERR2354423;

	 @Column(name="ERR2354424")
	 private double ERR2354424;

	 @Column(name="ERR2354425")
	 private double ERR2354425;

	 @Column(name="ERR2354426")
	 private double ERR2354426;

	 @Column(name="ERR2354427")
	 private double ERR2354427;

	 @Column(name="ERR2354428")
	 private double ERR2354428;

	 @Column(name="ERR315639")
	 private double ERR315639;

	public Thymus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thymus(int id, String geneId, double eRR2353001, double eRR2353002, double eRR2353003, double eRR2353004,
			double eRR2353005, double eRR2353006, double eRR2353007, double eRR2353008, double eRR2353009,
			double eRR2353564, double eRR2353565, double eRR2353566, double eRR2353567, double eRR2353568,
			double eRR2353569, double eRR2353570, double eRR2353571, double eRR2353572, double eRR2353573,
			double eRR2353574, double eRR2353575, double eRR2353576, double eRR2353577, double eRR2353578,
			double eRR2353579, double eRR2353580, double eRR2353581, double eRR2353582, double eRR2353583,
			double eRR2353584, double eRR2353585, double eRR2353586, double eRR2353852, double eRR2353853,
			double eRR2353854, double eRR2353855, double eRR2353856, double eRR2353857, double eRR2353858,
			double eRR2353859, double eRR2353860, double eRR2354406, double eRR2354407, double eRR2354408,
			double eRR2354409, double eRR2354410, double eRR2354411, double eRR2354412, double eRR2354413,
			double eRR2354414, double eRR2354415, double eRR2354416, double eRR2354417, double eRR2354418,
			double eRR2354419, double eRR2354420, double eRR2354421, double eRR2354422, double eRR2354423,
			double eRR2354424, double eRR2354425, double eRR2354426, double eRR2354427, double eRR2354428,
			double eRR315639) {
		super();
		this.id = id;
		this.geneId = geneId;
		ERR2353001 = eRR2353001;
		ERR2353002 = eRR2353002;
		ERR2353003 = eRR2353003;
		ERR2353004 = eRR2353004;
		ERR2353005 = eRR2353005;
		ERR2353006 = eRR2353006;
		ERR2353007 = eRR2353007;
		ERR2353008 = eRR2353008;
		ERR2353009 = eRR2353009;
		ERR2353564 = eRR2353564;
		ERR2353565 = eRR2353565;
		ERR2353566 = eRR2353566;
		ERR2353567 = eRR2353567;
		ERR2353568 = eRR2353568;
		ERR2353569 = eRR2353569;
		ERR2353570 = eRR2353570;
		ERR2353571 = eRR2353571;
		ERR2353572 = eRR2353572;
		ERR2353573 = eRR2353573;
		ERR2353574 = eRR2353574;
		ERR2353575 = eRR2353575;
		ERR2353576 = eRR2353576;
		ERR2353577 = eRR2353577;
		ERR2353578 = eRR2353578;
		ERR2353579 = eRR2353579;
		ERR2353580 = eRR2353580;
		ERR2353581 = eRR2353581;
		ERR2353582 = eRR2353582;
		ERR2353583 = eRR2353583;
		ERR2353584 = eRR2353584;
		ERR2353585 = eRR2353585;
		ERR2353586 = eRR2353586;
		ERR2353852 = eRR2353852;
		ERR2353853 = eRR2353853;
		ERR2353854 = eRR2353854;
		ERR2353855 = eRR2353855;
		ERR2353856 = eRR2353856;
		ERR2353857 = eRR2353857;
		ERR2353858 = eRR2353858;
		ERR2353859 = eRR2353859;
		ERR2353860 = eRR2353860;
		ERR2354406 = eRR2354406;
		ERR2354407 = eRR2354407;
		ERR2354408 = eRR2354408;
		ERR2354409 = eRR2354409;
		ERR2354410 = eRR2354410;
		ERR2354411 = eRR2354411;
		ERR2354412 = eRR2354412;
		ERR2354413 = eRR2354413;
		ERR2354414 = eRR2354414;
		ERR2354415 = eRR2354415;
		ERR2354416 = eRR2354416;
		ERR2354417 = eRR2354417;
		ERR2354418 = eRR2354418;
		ERR2354419 = eRR2354419;
		ERR2354420 = eRR2354420;
		ERR2354421 = eRR2354421;
		ERR2354422 = eRR2354422;
		ERR2354423 = eRR2354423;
		ERR2354424 = eRR2354424;
		ERR2354425 = eRR2354425;
		ERR2354426 = eRR2354426;
		ERR2354427 = eRR2354427;
		ERR2354428 = eRR2354428;
		ERR315639 = eRR315639;
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

	public double getERR2353001() {
		return ERR2353001;
	}

	public void setERR2353001(double eRR2353001) {
		ERR2353001 = eRR2353001;
	}

	public double getERR2353002() {
		return ERR2353002;
	}

	public void setERR2353002(double eRR2353002) {
		ERR2353002 = eRR2353002;
	}

	public double getERR2353003() {
		return ERR2353003;
	}

	public void setERR2353003(double eRR2353003) {
		ERR2353003 = eRR2353003;
	}

	public double getERR2353004() {
		return ERR2353004;
	}

	public void setERR2353004(double eRR2353004) {
		ERR2353004 = eRR2353004;
	}

	public double getERR2353005() {
		return ERR2353005;
	}

	public void setERR2353005(double eRR2353005) {
		ERR2353005 = eRR2353005;
	}

	public double getERR2353006() {
		return ERR2353006;
	}

	public void setERR2353006(double eRR2353006) {
		ERR2353006 = eRR2353006;
	}

	public double getERR2353007() {
		return ERR2353007;
	}

	public void setERR2353007(double eRR2353007) {
		ERR2353007 = eRR2353007;
	}

	public double getERR2353008() {
		return ERR2353008;
	}

	public void setERR2353008(double eRR2353008) {
		ERR2353008 = eRR2353008;
	}

	public double getERR2353009() {
		return ERR2353009;
	}

	public void setERR2353009(double eRR2353009) {
		ERR2353009 = eRR2353009;
	}

	public double getERR2353564() {
		return ERR2353564;
	}

	public void setERR2353564(double eRR2353564) {
		ERR2353564 = eRR2353564;
	}

	public double getERR2353565() {
		return ERR2353565;
	}

	public void setERR2353565(double eRR2353565) {
		ERR2353565 = eRR2353565;
	}

	public double getERR2353566() {
		return ERR2353566;
	}

	public void setERR2353566(double eRR2353566) {
		ERR2353566 = eRR2353566;
	}

	public double getERR2353567() {
		return ERR2353567;
	}

	public void setERR2353567(double eRR2353567) {
		ERR2353567 = eRR2353567;
	}

	public double getERR2353568() {
		return ERR2353568;
	}

	public void setERR2353568(double eRR2353568) {
		ERR2353568 = eRR2353568;
	}

	public double getERR2353569() {
		return ERR2353569;
	}

	public void setERR2353569(double eRR2353569) {
		ERR2353569 = eRR2353569;
	}

	public double getERR2353570() {
		return ERR2353570;
	}

	public void setERR2353570(double eRR2353570) {
		ERR2353570 = eRR2353570;
	}

	public double getERR2353571() {
		return ERR2353571;
	}

	public void setERR2353571(double eRR2353571) {
		ERR2353571 = eRR2353571;
	}

	public double getERR2353572() {
		return ERR2353572;
	}

	public void setERR2353572(double eRR2353572) {
		ERR2353572 = eRR2353572;
	}

	public double getERR2353573() {
		return ERR2353573;
	}

	public void setERR2353573(double eRR2353573) {
		ERR2353573 = eRR2353573;
	}

	public double getERR2353574() {
		return ERR2353574;
	}

	public void setERR2353574(double eRR2353574) {
		ERR2353574 = eRR2353574;
	}

	public double getERR2353575() {
		return ERR2353575;
	}

	public void setERR2353575(double eRR2353575) {
		ERR2353575 = eRR2353575;
	}

	public double getERR2353576() {
		return ERR2353576;
	}

	public void setERR2353576(double eRR2353576) {
		ERR2353576 = eRR2353576;
	}

	public double getERR2353577() {
		return ERR2353577;
	}

	public void setERR2353577(double eRR2353577) {
		ERR2353577 = eRR2353577;
	}

	public double getERR2353578() {
		return ERR2353578;
	}

	public void setERR2353578(double eRR2353578) {
		ERR2353578 = eRR2353578;
	}

	public double getERR2353579() {
		return ERR2353579;
	}

	public void setERR2353579(double eRR2353579) {
		ERR2353579 = eRR2353579;
	}

	public double getERR2353580() {
		return ERR2353580;
	}

	public void setERR2353580(double eRR2353580) {
		ERR2353580 = eRR2353580;
	}

	public double getERR2353581() {
		return ERR2353581;
	}

	public void setERR2353581(double eRR2353581) {
		ERR2353581 = eRR2353581;
	}

	public double getERR2353582() {
		return ERR2353582;
	}

	public void setERR2353582(double eRR2353582) {
		ERR2353582 = eRR2353582;
	}

	public double getERR2353583() {
		return ERR2353583;
	}

	public void setERR2353583(double eRR2353583) {
		ERR2353583 = eRR2353583;
	}

	public double getERR2353584() {
		return ERR2353584;
	}

	public void setERR2353584(double eRR2353584) {
		ERR2353584 = eRR2353584;
	}

	public double getERR2353585() {
		return ERR2353585;
	}

	public void setERR2353585(double eRR2353585) {
		ERR2353585 = eRR2353585;
	}

	public double getERR2353586() {
		return ERR2353586;
	}

	public void setERR2353586(double eRR2353586) {
		ERR2353586 = eRR2353586;
	}

	public double getERR2353852() {
		return ERR2353852;
	}

	public void setERR2353852(double eRR2353852) {
		ERR2353852 = eRR2353852;
	}

	public double getERR2353853() {
		return ERR2353853;
	}

	public void setERR2353853(double eRR2353853) {
		ERR2353853 = eRR2353853;
	}

	public double getERR2353854() {
		return ERR2353854;
	}

	public void setERR2353854(double eRR2353854) {
		ERR2353854 = eRR2353854;
	}

	public double getERR2353855() {
		return ERR2353855;
	}

	public void setERR2353855(double eRR2353855) {
		ERR2353855 = eRR2353855;
	}

	public double getERR2353856() {
		return ERR2353856;
	}

	public void setERR2353856(double eRR2353856) {
		ERR2353856 = eRR2353856;
	}

	public double getERR2353857() {
		return ERR2353857;
	}

	public void setERR2353857(double eRR2353857) {
		ERR2353857 = eRR2353857;
	}

	public double getERR2353858() {
		return ERR2353858;
	}

	public void setERR2353858(double eRR2353858) {
		ERR2353858 = eRR2353858;
	}

	public double getERR2353859() {
		return ERR2353859;
	}

	public void setERR2353859(double eRR2353859) {
		ERR2353859 = eRR2353859;
	}

	public double getERR2353860() {
		return ERR2353860;
	}

	public void setERR2353860(double eRR2353860) {
		ERR2353860 = eRR2353860;
	}

	public double getERR2354406() {
		return ERR2354406;
	}

	public void setERR2354406(double eRR2354406) {
		ERR2354406 = eRR2354406;
	}

	public double getERR2354407() {
		return ERR2354407;
	}

	public void setERR2354407(double eRR2354407) {
		ERR2354407 = eRR2354407;
	}

	public double getERR2354408() {
		return ERR2354408;
	}

	public void setERR2354408(double eRR2354408) {
		ERR2354408 = eRR2354408;
	}

	public double getERR2354409() {
		return ERR2354409;
	}

	public void setERR2354409(double eRR2354409) {
		ERR2354409 = eRR2354409;
	}

	public double getERR2354410() {
		return ERR2354410;
	}

	public void setERR2354410(double eRR2354410) {
		ERR2354410 = eRR2354410;
	}

	public double getERR2354411() {
		return ERR2354411;
	}

	public void setERR2354411(double eRR2354411) {
		ERR2354411 = eRR2354411;
	}

	public double getERR2354412() {
		return ERR2354412;
	}

	public void setERR2354412(double eRR2354412) {
		ERR2354412 = eRR2354412;
	}

	public double getERR2354413() {
		return ERR2354413;
	}

	public void setERR2354413(double eRR2354413) {
		ERR2354413 = eRR2354413;
	}

	public double getERR2354414() {
		return ERR2354414;
	}

	public void setERR2354414(double eRR2354414) {
		ERR2354414 = eRR2354414;
	}

	public double getERR2354415() {
		return ERR2354415;
	}

	public void setERR2354415(double eRR2354415) {
		ERR2354415 = eRR2354415;
	}

	public double getERR2354416() {
		return ERR2354416;
	}

	public void setERR2354416(double eRR2354416) {
		ERR2354416 = eRR2354416;
	}

	public double getERR2354417() {
		return ERR2354417;
	}

	public void setERR2354417(double eRR2354417) {
		ERR2354417 = eRR2354417;
	}

	public double getERR2354418() {
		return ERR2354418;
	}

	public void setERR2354418(double eRR2354418) {
		ERR2354418 = eRR2354418;
	}

	public double getERR2354419() {
		return ERR2354419;
	}

	public void setERR2354419(double eRR2354419) {
		ERR2354419 = eRR2354419;
	}

	public double getERR2354420() {
		return ERR2354420;
	}

	public void setERR2354420(double eRR2354420) {
		ERR2354420 = eRR2354420;
	}

	public double getERR2354421() {
		return ERR2354421;
	}

	public void setERR2354421(double eRR2354421) {
		ERR2354421 = eRR2354421;
	}

	public double getERR2354422() {
		return ERR2354422;
	}

	public void setERR2354422(double eRR2354422) {
		ERR2354422 = eRR2354422;
	}

	public double getERR2354423() {
		return ERR2354423;
	}

	public void setERR2354423(double eRR2354423) {
		ERR2354423 = eRR2354423;
	}

	public double getERR2354424() {
		return ERR2354424;
	}

	public void setERR2354424(double eRR2354424) {
		ERR2354424 = eRR2354424;
	}

	public double getERR2354425() {
		return ERR2354425;
	}

	public void setERR2354425(double eRR2354425) {
		ERR2354425 = eRR2354425;
	}

	public double getERR2354426() {
		return ERR2354426;
	}

	public void setERR2354426(double eRR2354426) {
		ERR2354426 = eRR2354426;
	}

	public double getERR2354427() {
		return ERR2354427;
	}

	public void setERR2354427(double eRR2354427) {
		ERR2354427 = eRR2354427;
	}

	public double getERR2354428() {
		return ERR2354428;
	}

	public void setERR2354428(double eRR2354428) {
		ERR2354428 = eRR2354428;
	}

	public double getERR315639() {
		return ERR315639;
	}

	public void setERR315639(double eRR315639) {
		ERR315639 = eRR315639;
	}

	@Override
	public String toString() {
		return "Thymus [id=" + id + ", geneId=" + geneId + ", ERR2353001=" + ERR2353001 + ", ERR2353002=" + ERR2353002
				+ ", ERR2353003=" + ERR2353003 + ", ERR2353004=" + ERR2353004 + ", ERR2353005=" + ERR2353005
				+ ", ERR2353006=" + ERR2353006 + ", ERR2353007=" + ERR2353007 + ", ERR2353008=" + ERR2353008
				+ ", ERR2353009=" + ERR2353009 + ", ERR2353564=" + ERR2353564 + ", ERR2353565=" + ERR2353565
				+ ", ERR2353566=" + ERR2353566 + ", ERR2353567=" + ERR2353567 + ", ERR2353568=" + ERR2353568
				+ ", ERR2353569=" + ERR2353569 + ", ERR2353570=" + ERR2353570 + ", ERR2353571=" + ERR2353571
				+ ", ERR2353572=" + ERR2353572 + ", ERR2353573=" + ERR2353573 + ", ERR2353574=" + ERR2353574
				+ ", ERR2353575=" + ERR2353575 + ", ERR2353576=" + ERR2353576 + ", ERR2353577=" + ERR2353577
				+ ", ERR2353578=" + ERR2353578 + ", ERR2353579=" + ERR2353579 + ", ERR2353580=" + ERR2353580
				+ ", ERR2353581=" + ERR2353581 + ", ERR2353582=" + ERR2353582 + ", ERR2353583=" + ERR2353583
				+ ", ERR2353584=" + ERR2353584 + ", ERR2353585=" + ERR2353585 + ", ERR2353586=" + ERR2353586
				+ ", ERR2353852=" + ERR2353852 + ", ERR2353853=" + ERR2353853 + ", ERR2353854=" + ERR2353854
				+ ", ERR2353855=" + ERR2353855 + ", ERR2353856=" + ERR2353856 + ", ERR2353857=" + ERR2353857
				+ ", ERR2353858=" + ERR2353858 + ", ERR2353859=" + ERR2353859 + ", ERR2353860=" + ERR2353860
				+ ", ERR2354406=" + ERR2354406 + ", ERR2354407=" + ERR2354407 + ", ERR2354408=" + ERR2354408
				+ ", ERR2354409=" + ERR2354409 + ", ERR2354410=" + ERR2354410 + ", ERR2354411=" + ERR2354411
				+ ", ERR2354412=" + ERR2354412 + ", ERR2354413=" + ERR2354413 + ", ERR2354414=" + ERR2354414
				+ ", ERR2354415=" + ERR2354415 + ", ERR2354416=" + ERR2354416 + ", ERR2354417=" + ERR2354417
				+ ", ERR2354418=" + ERR2354418 + ", ERR2354419=" + ERR2354419 + ", ERR2354420=" + ERR2354420
				+ ", ERR2354421=" + ERR2354421 + ", ERR2354422=" + ERR2354422 + ", ERR2354423=" + ERR2354423
				+ ", ERR2354424=" + ERR2354424 + ", ERR2354425=" + ERR2354425 + ", ERR2354426=" + ERR2354426
				+ ", ERR2354427=" + ERR2354427 + ", ERR2354428=" + ERR2354428 + ", ERR315639=" + ERR315639 + "]";
	}
}
