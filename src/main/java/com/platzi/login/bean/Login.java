package com.platzi.login.bean;

import java.io.Serializable;

public final class Login implements Serializable {
	
	public Login() {

	}

	private String name;
	private String password;
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
	
	public boolean autenticacion() {
		return(password.equals("holamundo"))?true: false;
	}

	
	
}
