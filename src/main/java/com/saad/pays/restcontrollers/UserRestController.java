package com.saad.pays.restcontrollers;

import com.saad.pays.entities.User;
import com.saad.pays.entities.Visa;
import com.saad.pays.repos.UserRepository;
import com.saad.pays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserRestController {

    @Autowired
    UserRepository userRep;
    @Autowired
    UserService userService;
    //affichage
    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userRep.findAll();
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }




}
