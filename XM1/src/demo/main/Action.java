package demo.main;

public class Action {
	//操作id
	public int aid;
	//操作项目名
	public String aname;
	//操作项目具体路径
	public String aurl;
	public Action(int aid, String aname, String aurl) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.aurl = aurl;
	}
	public Action() {
		super();
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAurl() {
		return aurl;
	}
	public void setAurl(String aurl) {
		this.aurl = aurl;
	}
	@Override
	public String toString() {
		return "Action [aid=" + aid + ", aname=" + aname + ", aurl=" + aurl + "]";
	}
	
	
}
