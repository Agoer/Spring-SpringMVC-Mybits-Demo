package com.SSM.dao;

import com.SSM.domain.User;


public interface UserDao {

	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectFenye(User user,int strt,int end);
}
