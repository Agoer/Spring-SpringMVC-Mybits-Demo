package com.SSM.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SSM.dao.UserDao;
import com.SSM.domain.User;
import com.SSM.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
