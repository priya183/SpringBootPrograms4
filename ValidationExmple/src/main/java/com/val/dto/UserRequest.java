package com.val.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
@Builder
public class UserRequest {
	
	@NotNull(message="user name shouldn't be null")
	private String name;
	
	@Email(message="invalid email address")
	private String email;
	
	@Pattern(regexp="^\\{10}$",message="invalid mobile number entered")
	private String mobile;
	
	private String gender;
	
	@Min(18)
	@Max(16)
	private int age;
	
	private String nationality;

}
