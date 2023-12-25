package org.dyanyog.services;

import org.dyanyog.dto.AddUserRequest;
import org.dyanyog.dto.AddUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddUserServices {
	@PostMapping(path="/api/auth/AddUser")
	public AddUserResponse adduser(@RequestBody AddUserRequest addUserRequest){
		AddUserResponse response = new AddUserResponse();
		
	response.setStatus("success");
	response.setMessage("user successfully added");
	response.setuserid(addUserRequest.getuserid());
	response.setusername(addUserRequest.getusername());
	response.setuseremail(addUserRequest.getuseremail());
	response.setuserage(addUserRequest.getuserage());
	
	return response;
	}
}
	
