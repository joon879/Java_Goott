package com.tech.w13;

public class Hobby {
	private String name;
	private String hob1;
	private String hob2;
	private String hob3;
	
	public Hobby(String name, String hob1, String hob2, String hob3) {
		this.name = name;
		this.hob1 = hob1;
		this.hob2 = hob2;
		this.hob3 = hob3;
	}

	public String getName() {
		return name;
	}
	
	public String getHobbys() {
		String hobs = hob1+", "+hob2+", "+hob3;
		return hobs;
	}
	
		
	
}
