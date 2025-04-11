package com.pawcare.service;

import com.pawcare.entity.User;

public interface IUserService {

    void createUser(User user);
    User findByUsername(String username);

}
