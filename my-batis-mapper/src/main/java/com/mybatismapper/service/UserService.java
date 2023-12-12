package com.mybatismapper.service;

import com.mybatismapper.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    User create(User user);
    User getUserById(Long id);

   List<User> findAll(String name);
}
