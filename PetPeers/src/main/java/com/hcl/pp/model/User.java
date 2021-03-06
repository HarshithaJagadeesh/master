package com.hcl.pp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "PET_USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long userId;
	@Column(name="USER_NAME")
	private String username;
	@Column(name="USER_PASSWD")
	private String userPassword;
	@Transient
	private String confirmPassword;
	@OneToMany (mappedBy="owner", cascade = CascadeType.ALL)
	private Set<Pet> pets;

	public User() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	/*public void setUserId(long userId) {
		this.userId = userId;
	}*/

	public String getUserPassword() {
		return userPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}