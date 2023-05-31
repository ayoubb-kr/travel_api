package com.saad.pays.service;

import com.saad.pays.entities.Role;
import com.saad.pays.entities.User;
import com.saad.pays.entities.Visa;

import java.util.List;

public interface UserService {

    List<User>getAllUsers();
    User saveUser(User user);
    User findUserByUsername (String username);

    User addRoleToUser(String username, String rolename);
    User updateUser(User user);
    void deleteUserById(Long id);



    List<Role> getAllRoles();
    Role addRole(Role role);
    Role updateRole(Role role);
    void deleteRoleById(Long id);

}
