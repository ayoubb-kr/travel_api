package com.saad.pays.restcontrollers;

import com.saad.pays.entities.Role;
import com.saad.pays.entities.User;
import com.saad.pays.entities.Visa;
import com.saad.pays.repos.UserRepository;
import com.saad.pays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
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
    // insert *
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
   // add role to user
    @PutMapping("/{username}/roles/{rolename}")
    public ResponseEntity<User> addRoleToUser(@PathVariable String username, @PathVariable String rolename) {
        return new ResponseEntity<>(userService.addRoleToUser(username, rolename), HttpStatus.OK);
    }
    // update user
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
    }

    // get user by username
    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        return new ResponseEntity<>(userService.findUserByUsername(username), HttpStatus.OK);
    }



    // affichage les role
    @GetMapping("/roles/all")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = userService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    // add role
    @PostMapping("/roles")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return new ResponseEntity<>(userService.addRole(role), HttpStatus.CREATED);
    }
    //delete role
    @RequestMapping(value = "/roles/{id}", method = RequestMethod.DELETE)
    public void deleteRole(@PathVariable Long id) {userService.deleteRoleById(id);}

    // update user
    @PutMapping("/roles")
    public ResponseEntity<Role> updateUser(@RequestBody Role role) {
        return new ResponseEntity<>(userService.updateRole(role), HttpStatus.OK);
    }

}
