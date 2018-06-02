package cn.kkl.service.impl;

import cn.kkl.dao.UserDao;
import cn.kkl.pojo.User;
import cn.kkl.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(String uname) {
		System.out.println("*****UserServiceImpl.add()******");
		User user = new User();
		if(!uname.isEmpty()) {
			user.setUname(uname);
		}else {
			user.setUname("liweihai"+(int)Math.ceil(Math.random()*1000));
		}
		user.setUpassword("123456");
		userDao.add(user);
	}

}
