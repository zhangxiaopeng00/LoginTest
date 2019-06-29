package com.service;

import com.model.Users;

public interface UsersService {

	public Users findBy(String username, String password);
}
