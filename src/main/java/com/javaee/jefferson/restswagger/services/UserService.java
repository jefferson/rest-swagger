package com.javaee.jefferson.restswagger.services;

import java.util.List;

import com.javaee.jefferson.restswagger.domain.User;

public interface UserService {
	
	User getById(Long id);
	List<User> getAllUsers();
	User CreateNew(User user);
	User save(Long id, User user);
	User patch(Long id, User user);
	void deleteById(Long id);

}
