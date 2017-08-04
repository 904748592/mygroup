package com.slby.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;

import com.slby.dao.UserDao;
import com.slby.service.UserService;

/**
 * 
 * @author sp
 * @serviceImpl
 * 自动加载userdao
 * 2016.7.21
 */
public class UserServiceIpml implements UserService {
	@Autowired
	private UserDao userdao;

	

}
