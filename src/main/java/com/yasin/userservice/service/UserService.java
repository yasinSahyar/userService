package com.yasin.userservice.service;


import com.yasin.userservice.model.User;
import com.yasin.userservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();


    }

    public User createUser(User newUser) {

        return userRepository.save(newUser);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void updateUser(String id,User newUser) {

        User oldUser = getUserById(id);
        oldUser.setName(newUser.getName());
        userRepository.save(oldUser);

    }
}
