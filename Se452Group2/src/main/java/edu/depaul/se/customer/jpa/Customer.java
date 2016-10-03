package edu.depaul.se.customer.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import edu.depaul.se.customer.ICustomer;

@Entity
public class Customer implements ICustomer, Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//First Name
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	//Last Name
	private String lastName;
	
	public String getLastName() {
		return firstName;
	}
	public void setLastName(String name) {
		this.firstName = name;
	}
	
	//Address
	private String address;
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	//City
	private String city;
	
	public String getcity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	//State 
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state= state;
	}
	
	//ZipCode
	private String zip;
	
	public String getZip(){
		return zip;
	}
	
	public void setZip(String zip){
		this.zip = zip;
	}
	
	//Password
	private String password;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	//Email
	private String email;
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	
		
	
	
	//Customer Constructor
	public Customer() {
		
	}
	public Customer(String fName, String lName, String address, String city, String state, String zip, String email, String password) {
		this.firstName = fName;
		this.lastName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.password = password;
	}
}
