package com.jimmy.SSM.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jimmy.SSM.dao.UserDao;
import com.jimmy.SSM.domain.User;
import com.jimmy.SSM.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
