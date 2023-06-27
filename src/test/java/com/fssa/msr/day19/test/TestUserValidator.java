package com.fssa.msr.day19.test;

import java.util.regex.Pattern;


public class TestUserValidator {

	class User {
		int id;
		String name;
		String password;
		String email;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
	
	
	class UserValidators{
		  boolean validate(User b) {
	         String regexEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	         String regexPass = "^(?=.[A-Z])(?=.[a-z])(?=.\\d)(?=.[@#$%^&+=])(?=.*[!-~]).{8,}$";
			
			Boolean isMatchPass = Pattern.matches(regexPass, b.getPassword());
			Boolean isMatchMail = Pattern.matches(regexEmail, b.getEmail());
			
			if (isMatchMail) {
			     return true;
			} else {
				 return false;
			}
			if (isMatchPass) {
				 return true "Password is valid";
			} else {
				 return false;
			}
			if(b.getId()>0) {
				return true;
			}
			else {
				return false;
			}
			if(b.getName().length()<=1) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}
