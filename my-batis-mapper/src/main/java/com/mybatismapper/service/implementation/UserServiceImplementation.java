package com.mybatismapper.service.implementation;

import com.mybatismapper.mapper.UserMapper;
import com.mybatismapper.model.User;
import com.mybatismapper.repository.UserRepository;
import com.mybatismapper.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserServiceImplementation(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;

        this.userMapper = userMapper;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> findAll(String name) {
        return userMapper.findAll(name);
    }


}
