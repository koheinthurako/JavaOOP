package Aggregation;

class TeamUI {
	
	private String name;
	private int member;
	private String infracture;
	
	public TeamUI(String name, int member, String infracture) {
		super();
		this.name = name;
		this.member = member;
		this.infracture = infracture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	public String getInfracture() {
		return infracture;
	}

	public void setInfracture(String infracture) {
		this.infracture = infracture;
	}

	@Override
	public String toString() {
		return "TeamUI [name=" + name + ", member=" + member + ", infracture=" + infracture + "]";
	}
	
 }


class TeamWeb {
	
	private String name;
	private int member;
	
	public TeamWeb(String name, int member) {
		this.name = name;
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "TeamWeb [name=" + name + ", member=" + member + "]";
	}
	
}


public class Department {
	
//	 ဒီနေရာမှာ ui သည် TeamUI class ကို object ကြီးတစ်ခုအနေဖြင့် ယူသုံးလိုက်ခြင်းဖြစ်သည်
	private TeamUI ui;
	private TeamWeb web;
	
//	ဒီနေရာမှာ (TeamUi ui) ဆိုတာသည် (String name) လိုပဲ ui ရဲ့ dataType သည် TeamUI ဆိုသည့် class ကြီးတစ်ခုလုံးဖြစ်သွားသည် 
//	အဲ့တော့ DepartmentTest ထဲကနေ Department ကို obj လှမ်းဆောက်ရင် TeamUi ui & TeamWeb web လိုအပ်သည့်အတွက် အရင်အဲ့နှစ်ခုကို obj ဆောက်
	public Department(TeamUI ui, TeamWeb web) {
		this.ui = ui;
		this.web = web;
	}

	public TeamUI getUi() {
		return ui;
	}

	public void setUi(TeamUI ui) {
		this.ui = ui;
	}

	public TeamWeb getWeb() {
		return web;
	}

	public void setWeb(TeamWeb web) {
		this.web = web;
	}

	@Override
	public String toString() {
		return "Department [ui=" + ui + ", web=" + web + "]";
	}
	
}