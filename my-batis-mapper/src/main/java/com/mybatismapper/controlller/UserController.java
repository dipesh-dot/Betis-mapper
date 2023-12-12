package com.mybatismapper.controlller;

import com.mybatismapper.mapper.UserMapper;
import com.mybatismapper.model.User;
import com.mybatismapper.service.UserService;
import com.mybatismapper.service.implementation.UserServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;



    public UserController( UserService userService) {
        this.userService = userService;

    }

    @PostMapping("/save")
    ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @GetMapping("/{id}")
    ResponseEntity<User>getById(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }

    @GetMapping("/all")
    ResponseEntity<List<User>> getAll(@RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll(name));
    }

}
