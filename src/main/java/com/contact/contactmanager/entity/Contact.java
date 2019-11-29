package com.contact.contactmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Contact")
public class Contact {
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
    private int id;
    @Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	@Column(name="company")
	private String company;
	@Column(name="title")
	private String title;
	@Column(name="userid")
	private long userId;
	@Column(name="phone")
	private long phone;
	
		
	// define constructors
	
	public Contact() {
		
	}

	public Contact(String firstName, String lastName, String email, long userId, String company, String title, long phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.company = company;
		this.title = title;
		this.phone = phone;
	}

	// define getter/setter
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return this.company;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getPhone() {
		return this.phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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


	// define tostring

	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
		    
    

    
    
}