package com.justforsuccess.journalApp.controller;

import com.justforsuccess.journalApp.entity.User;
import com.justforsuccess.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    UserService userService;


    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";
    }

    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User userInDb = userService.findByUsername(user.getUsername());
        if (userInDb != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        boolean created = userService.saveNewUser(user);
        if (created) {
            return new ResponseEntity<>("User Created Successfully", HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
