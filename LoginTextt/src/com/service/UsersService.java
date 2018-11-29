package com.service;

import com.model.Users;

public interface UsersService {
	/**
	 * 根据username进行登录验证
	 * @param username
	 * @return
	 */
	 public Users loginValidate(String username);
}
