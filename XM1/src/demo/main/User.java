package demo.main;

public class User {
//序号
	public int xuhao;
//姓名
	public String xingming;
//奖惩项目
	public String jcxm;
//奖惩类型
	public String jclx;
//金额
	public double jiner;
//状态
	public String zhuangtai;
//流程
	public String liucheng;
//备注
	public String beizhu;
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	public String getLiucheng() {
		return liucheng;
	}
	public void setLiucheng(String liucheng) {
		this.liucheng = liucheng;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public int getXuhao() {
		return xuhao;
	}
	public void setXuhao(int xuhao) {
		this.xuhao = xuhao;
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getJcxm() {
		return jcxm;
	}
	public void setJcxm(String jcxm) {
		this.jcxm = jcxm;
	}
	public String getJclx() {
		return jclx;
	}
	public void setJclx(String jclx) {
		this.jclx = jclx;
	}
	public double getJiner() {
		return jiner;
	}
	public void setJiner(double jiner) {
		this.jiner = jiner;
	}
	
	public User() {
		super();
	}
	
	public User(int xuhao, String xingming, String jcxm, String jclx, double jiner, String zhuangtai, String liucheng,
			String beizhu) {
		super();
		this.xuhao = xuhao;
		this.xingming = xingming;
		this.jcxm = jcxm;
		this.jclx = jclx;
		this.jiner = jiner;
		this.zhuangtai = zhuangtai;
		this.liucheng = liucheng;
		this.beizhu = beizhu;
	}
	@Override
	public String toString() {
		return "User [xuhao=" + xuhao + ", xingming=" + xingming + ", jcxm=" + jcxm + ", jclx=" + jclx + ", jiner="
				+ jiner + ", zhuangtai=" + zhuangtai + ", liucheng=" + liucheng + ", beizhu=" + beizhu + "]";
	}

	
}
