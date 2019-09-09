package demo.main;

public class Yuangong {
	public String username;//姓名
	public String sex;//性别
	public int did;//部门id
	public int rid;//角色id
	public int userid;//基本id
	public String psw;//密码
	public Yuangong(String username, String sex, int did, int rid, int userid, String psw) {
		super();
		this.username = username;
		this.sex = sex;
		this.did = did;
		this.rid = rid;
		this.userid = userid;
		this.psw = psw;
	}
	public Yuangong() {//空的
		super();
	}
	public Yuangong(String username, String psw) {//密码  账户结构
		super();
		this.username = username;
		this.psw = psw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
}
