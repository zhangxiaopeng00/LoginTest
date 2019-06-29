package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;

@Service("usersService")
@Transactional
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersDao usersDao;

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public Users findBy(String username, String password) {
		return this.usersDao.selectBy(username, password);
	}
}
