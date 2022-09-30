package com.yasin.userservice.controller;

import com.yasin.userservice.model.User;
import com.yasin.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService usersService;


    @GetMapping
    public ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(usersService.getUsers(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id){

        return new ResponseEntity<>(getUserById(id),HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser){


        return new ResponseEntity<>(usersService.createUser(newUser),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> getUser(@PathVariable String id, @RequestBody User newUser) {

        usersService.updateUser(id,newUser);

        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        usersService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private User getUserById(String id){
       return usersService.getUserById(id);


    }
}
