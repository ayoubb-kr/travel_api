package com.saad.pays.restcontrollers;

import com.saad.pays.entities.User;
import com.saad.pays.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserRestController {

    @Autowired
    UserRepository userRep;

    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userRep.findAll();
    }
}
