package com.broadbil.bankreferralapp.service;

import com.broadbil.bankreferralapp.model.User;
import com.broadbil.bankreferralapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(String id) {
        Optional<User> userById = userRepository.findById(id);
        return userById.get();
    }

    public User saveUser(User user) {
        Optional<User> userByUserName = userRepository.findByUserName(user.getUserName());

        if (userByUserName.isPresent()) {
            throw new IllegalArgumentException("User Already Exists!..");
        }

        userRepository.save(user);
        return user;
    }
}
