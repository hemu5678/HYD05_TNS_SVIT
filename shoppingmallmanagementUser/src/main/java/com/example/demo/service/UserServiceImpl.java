package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);	
	}
	@Override
	public List<User> fetchUserList(){
		return userRepo.findAll();
	}
	@Override
  	public User fetchUserById(Long id) {
		return userRepo.findById(id).get();	
	}
	@Override
	public void deleteUserById(Long id) {
		userRepo.deleteById(id);
	}
	
	@Override
	public User updateUser(Long id, User user) {
		User usDB = userRepo.findById(id).get();

	       if(Objects.nonNull(user.getName()) &&
	       !"".equalsIgnoreCase(user.getName())) {
	           usDB.setName(user.getName());
	       }

	       if(Objects.nonNull(user.getType()) &&
	               !"".equalsIgnoreCase(user.getType())) {
	           usDB.setType(user.getType());
	       }
	       if(Objects.nonNull(user.getPassword()) &&
	               !"".equalsIgnoreCase(user.getPassword())) {
	           usDB.setPassword(user.getPassword());
	       }
	       return userRepo.save(usDB);
}
	
}