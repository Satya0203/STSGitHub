package com.version;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bike 
{
	
	@Id
	@GeneratedValue
	private int id;
	private String company;
	private int cc;
	private String bikeName;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public Bike( String company, int cc, String bikeName) 
	{	
		this.company = company;
		this.cc = cc;
		this.bikeName = bikeName;
	}
	
	public Bike()
	{
		
	}
	
	
	
}
