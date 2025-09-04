package com.example.service1.controller;

import com.example.service1.domain.User;
import com.example.service1.dto.UserDto;
import com.example.service1.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //curl -X POST http://localhost:8080/users      -H "Content-Type: application/json"      -d '{"name":"nikitin DB"}'
    @PostMapping
    @Transactional
    public String createUser(@RequestBody UserDto userDto) {
        System.out.println("service1 dataBase userDto.getName(): " + userDto.getName());
        User user = new User();
        user.setName(userDto.getName());
        userRepository.save(user);
        return "service1 dataBase: " + userDto.getName();
    }
}
