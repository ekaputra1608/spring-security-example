package com.teguh.example.service;

import com.teguh.example.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
