package com.tech.w09;

public class Korean {
	private String nation = "¥Î«—πŒ±π";
	private String name;
	private String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
