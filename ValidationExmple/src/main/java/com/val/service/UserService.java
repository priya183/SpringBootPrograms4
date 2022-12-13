package com.val.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.val.dto.UserRequest;
import com.val.entity.User;
import com.val.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public User addUser(UserRequest ur)
	{ 
		//map userRequest object to user object
		
				User u=new User();
				
				//return userRepo.save(user);
		return null;
	}
	
	public List<User> getAllUser()
	{
		return userRepo.findAll();
	}
	
	public User getById(int id)
	{
		return userRepo.findById(id).get();
	}

}
