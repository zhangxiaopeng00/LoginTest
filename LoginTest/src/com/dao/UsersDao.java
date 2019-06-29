package com.dao;

import com.model.Users;

public interface UsersDao {

	public Users selectBy(String username, String password);
}
