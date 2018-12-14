package com.deloitte.poc.searchprovider.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVIDER_INF")
public class Provider {

	@Id
	@GeneratedValue
	private String providerId;
	private String fName;
	private String mName;
	private String lName;
	private String gender;
	private String prefix;
	private Date dob;
	private Integer ssn;
	private String pSpecial;
	private String sSpecial;

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getpSpecial() {
		return pSpecial;
	}

	public void setpSpecial(String pSpecial) {
		this.pSpecial = pSpecial;
	}

	public String getsSpecial() {
		return sSpecial;
	}

	public void setsSpecial(String sSpecial) {
		this.sSpecial = sSpecial;
	}

}
