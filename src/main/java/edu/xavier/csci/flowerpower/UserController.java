package edu.xavier.csci.flowerpower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

@RestController
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
    private long savePerson(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    private User loginUser(@RequestBody User user)
    {
        if(user.getUsername() == (userService.getUserById(user.getId())).getUsername())
        {
            if(user.getPassword() == (userService.getUserById(user.getId())).getPassword())
            {
                //send them to reservation page
            }
            else {
                //re-prompt
            }
        }
        return user;
    }



}
