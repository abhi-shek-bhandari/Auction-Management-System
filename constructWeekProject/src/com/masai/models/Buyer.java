package com.masai.models;

public class Buyer {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String gender;
	private String DOB;
	private String State;
	private String City;
	private int BuyerId;
	private int pincode;
	private int phone;
	public Buyer() {
		// TODO Auto-generated constructor stub
	}
	public Buyer(String firstName, String lastName, String email, String username, String password, String gender,
			String dOB, String state, String city,int BuyerId, int pincode, int phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.DOB = dOB;
		this.State = state;
		this.City = city;
		this.BuyerId = BuyerId;
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
		this.DOB = dOB;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
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
		return "Buyer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username="
				+ username + ", password=" + password + ", gender=" + gender + ", DOB=" + DOB + ", State=" + State
				+ ", City=" + City + ", pincode=" + pincode + ", phone=" + phone + "]";
	}
	public int getBuyerId() {
		return BuyerId;
	}
	public void setBuyerId(int buyerId) {
		this.BuyerId = buyerId;
	}
	
}
