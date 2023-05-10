package com.saad.pays.service;

import com.saad.pays.entities.Role;
import com.saad.pays.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
