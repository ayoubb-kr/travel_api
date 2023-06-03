package com.vermeg.travel.service;

import com.vermeg.travel.entities.Role;
import com.vermeg.travel.entities.User;

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
