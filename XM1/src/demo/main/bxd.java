package demo.main;

import java.util.Date;

//报销单
public class bxd {
	public int bxid;
	public String bxname;
	public String bxshiyou;
	public double bxjine;
	public Date bxshijian;
	public int bxzhuangtai;
	public String jingliyijian;
	public String zongjingliyijian;
	public String caiwuyijian;
	public bxd(int bxid, String bxname, String bxshiyou, double bxjine, Date bxshijian, int bxzhuangtai,
			String jingliyijian, String zongjingliyijian, String caiwuyijian) {
		super();
		this.bxid = bxid;
		this.bxname = bxname;
		this.bxshiyou = bxshiyou;
		this.bxjine = bxjine;
		this.bxshijian = bxshijian;
		this.bxzhuangtai = bxzhuangtai;
		this.jingliyijian = jingliyijian;
		this.zongjingliyijian = zongjingliyijian;
		this.caiwuyijian = caiwuyijian;
	}
	public bxd() {
		super();
	}
	public int getBxid() {
		return bxid;
	}
	public void setBxid(int bxid) {
		this.bxid = bxid;
	}
	public String getBxname() {
		return bxname;
	}
	public void setBxname(String bxname) {
		this.bxname = bxname;
	}
	public String getBxshiyou() {
		return bxshiyou;
	}
	public void setBxshiyou(String bxshiyou) {
		this.bxshiyou = bxshiyou;
	}
	public double getBxjine() {
		return bxjine;
	}
	public void setBxjine(double bxjine) {
		this.bxjine = bxjine;
	}
	public Date getBxshijian() {
		return bxshijian;
	}
	public void setBxshijian(Date bxshijian) {
		this.bxshijian = bxshijian;
	}
	public int getBxzhuangtai() {
		return bxzhuangtai;
	}
	public void setBxzhuangtai(int bxzhuangtai) {
		this.bxzhuangtai = bxzhuangtai;
	}
	public String getJingliyijian() {
		return jingliyijian;
	}
	public void setJingliyijian(String jingliyijian) {
		this.jingliyijian = jingliyijian;
	}
	public String getZongjingliyijian() {
		return zongjingliyijian;
	}
	public void setZongjingliyijian(String zongjingliyijian) {
		this.zongjingliyijian = zongjingliyijian;
	}
	public String getCaiwuyijian() {
		return caiwuyijian;
	}
	public void setCaiwuyijian(String caiwuyijian) {
		this.caiwuyijian = caiwuyijian;
	}
	public bxd(int bxid, int bxzhuangtai) {
		super();
		this.bxid = bxid;
		this.bxzhuangtai = bxzhuangtai;
	}
	
	
}
