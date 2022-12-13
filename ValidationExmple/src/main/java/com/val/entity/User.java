package com.val.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_TBL")

//builder design pattern, provide static name to your allargscontructor

@AllArgsConstructor(staticName = "build")
@Setter
@Getter
@NoArgsConstructor
@Data
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String emailId;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;

}
