package com.srinivas.springbootJPA.Entity;

import jakarta.persistence.*;

@Entity
public class Employee {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobilenumber;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)// cascadeType specifies the type of cascade to be applied to the relationship. In this case, it is CascadeType.ALL, which means that all the changes to the Employee entity will be propagated to the Passport entity.ascade(cascadeType))// mappedBy is used to specify the name of the property on the other side of the relationship. In this case, the name of the property on the Passport entity is "employee".
	private Passport passport;

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobilenumber=" + mobilenumber + "]";
	}
	
	
}
