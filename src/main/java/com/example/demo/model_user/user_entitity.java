package com.example.demo.model_user;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class user_entitity {
	
	@Id
	@Column(name = "ID" , nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iDNum;
	
	@Column(name = "NID")
		private String nID;
	
	@Column(name = "Passport")
		private String passport;
	

	@Column(name = "Name")
		private String name;
	
	@Column(name = "Password")
	private String password;

	
	@Column(name = "birth_date")
	private String birthDate;

	@Column(name = "Address")
		private String address;

	@Column(name = "phone_num")
		private String phoneNum;

	@Column(name = "marital_status")
		private Character maritalStatus;


	@Column(name = "e_mail")
		private String email;

	@Column(name = "Nationality")
	private String nationality;

	@Column(name = "hr_letter")
	private Integer hrLetter;

	
	public Integer getIDNum() {
		return iDNum; 
	}

	public void setIDNum(Integer iDNum) {
		this.iDNum = iDNum;
	}

	public String getnID() {
		return nID;
	}

	public void setnID(String nID) {
		this.nID = nID;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Character getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(Character maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Integer getHrLetter() {
		return hrLetter;
	}

	public void setHrLetter(Integer hrLetter) {
		this.hrLetter = hrLetter;
	}

	
	
}

