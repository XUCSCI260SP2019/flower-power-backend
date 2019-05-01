package edu.xavier.csci.flowerpower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@CrossOrigin
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    private User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }


////////////////////////////////////////////////////////////////
    @DeleteMapping("/users/{id}")
    private void deleteUser(@PathVariable("id") int id) {
        userService.delete(id);
    }
///////////////////////////////////////////////////////////////
    @PostMapping("/users")
    private long saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }

        @RequestMapping("/login")
        public boolean login(@RequestBody User user) {
            return
                    user.getEmail().equals("user") && user.getPassword().equals("password");
        }

        @RequestMapping("/user")
        public Principal user(HttpServletRequest request) {
            String authToken = request.getHeader("Authorization")
                    .substring("Basic".length()).trim();
            return () -> new String(Base64.getDecoder()
                    .decode(authToken)).split(":")[0];
        }



}
