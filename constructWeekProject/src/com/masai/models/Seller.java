package com.masai.models;

public class Seller {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String gender;
	private String DOB;
	private String companyName;
	private String State;
	private String City;
	private int SellerId;
	private int pincode;
	private int phone;
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	public Seller(String firstName, String lastName, String email, String username, String password, String gender,
			String dOB, String companyName, String state, String city, int sellerId, int pincode, int phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.gender = gender;
		DOB = dOB;
		this.companyName = companyName;
		State = state;
		City = city;
		this.SellerId = sellerId;
		this.pincode = pincode;
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getSellerId() {
		return SellerId;
	}
	public void setBuyerId(int sellerId) {
		SellerId = sellerId;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Seller [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username="
				+ username + ", password=" + password + ", gender=" + gender + ", DOB=" + DOB + ", companyName="
				+ companyName + ", State=" + State + ", City=" + City + ", SellerId=" + SellerId + ", pincode=" + pincode
				+ ", phone=" + phone + "]";
	}
	
}
