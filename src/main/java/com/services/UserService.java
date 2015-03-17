package com.services;

import com.dao.UsersDao;

public class UserService {
	private UsersDao usersDao;

	public int userCount() {
		return usersDao.getCounts();
	}

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

}
