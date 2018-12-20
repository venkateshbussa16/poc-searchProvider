package com.deloitte.poc.searchprovider.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVIDER_INF")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "SSN")
	private String ssn;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "PFIN")
	private String pfin;
	@Column(name = "PROVIDER_ID")
	private String providerID;
	@Column(name = "LICENSE")
	private String license;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "ADDRESS_ID")
	private Integer addressId;
	@Column(name = "PREFIX")
	private String prefix;
	@Column(name = "PRIMARY_SPECIALIZATION")
	private String primarySpecialization;
	@Column(name = "SECONDARY_SPECIALIZATION")
	private String secondarySpecialization;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPfin() {
		return pfin;
	}

	public void setPfin(String pfin) {
		this.pfin = pfin;
	}

	public String getProviderID() {
		return providerID;
	}

	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getPrimarySpecialization() {
		return primarySpecialization;
	}

	public void setPrimarySpecialization(String primarySpecialization) {
		this.primarySpecialization = primarySpecialization;
	}

	public String getSecondarySpecialization() {
		return secondarySpecialization;
	}

	public void setSecondarySpecialization(String secondarySpecialization) {
		this.secondarySpecialization = secondarySpecialization;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", ssn=" + ssn + ", dob=" + dob + ", pfin=" + pfin + ", providerID=" + providerID
				+ ", license=" + license + ", gender=" + gender + ", addressId=" + addressId + ", prefix=" + prefix
				+ ", primarySpecialization=" + primarySpecialization + ", secondarySpecialization="
				+ secondarySpecialization + "]";
	}

}
