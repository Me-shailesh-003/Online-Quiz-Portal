package com.beans;

public class User {

	public boolean validate(String username, String password){
		
		if(username.equals("meshailesh003") && password.equals("s003")){
			return true;
		}
		return false;
	}
	
}


