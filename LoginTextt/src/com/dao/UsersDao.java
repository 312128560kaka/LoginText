package com.dao;

import com.model.Users;

public interface UsersDao {
        public Users findByUsersname(String username);
}
