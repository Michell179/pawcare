package com.pawcare.service;

import com.pawcare.entity.User;
import com.pawcare.repository.IUserRepository;
import com.pawcare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;



    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findItemByUsername(username);
    }
}
