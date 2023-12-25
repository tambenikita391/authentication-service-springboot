package org.dyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddUserResponse {

	
	private String status;
	private String message;
	private String userid;
	private String username;
	private String useremail;
	private String userage;
	
	
	public String getStatus() {
		return status;
		
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	public String getMessage() {
		return message;
		
	}
	public void setMessage(String message) {
		this.message = message;
		
	}
	public String getuserid() {
		return userid;
		
	}
	public void setuserid(String userid) {
		this.userid = userid;
		
	}
	public String getusername() {
		return username;
		
	}
	public void setusername(String username) {
		this.username = username;
		
	}
	public String getuseremail() {
		return useremail;
		
	}
	public void setuseremail(String useremail) {
		this.useremail = useremail;
		
	}
	public String getuserage() {
		return userage;
		
	}
	public void setuserage(String userage) {
		this.userage = userage;
		
	}
}