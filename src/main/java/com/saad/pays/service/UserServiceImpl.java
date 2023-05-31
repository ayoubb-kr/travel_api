package com.saad.pays.service;

import com.saad.pays.entities.Passport;
import com.saad.pays.entities.Role;
import com.saad.pays.entities.User;
import com.saad.pays.repos.PassportRepository;
import com.saad.pays.repos.RoleRepository;
import com.saad.pays.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    UserRepository userRep;

    @Autowired
    RoleRepository roleRep;
    @Autowired
    PassportRepository passRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User user) {
        String idPass = user.getPassport().getIdPass();
        Passport passport = passRepository.findById(idPass)
                .orElseThrow(() -> new RuntimeException("Passport not found"));
        user.setPassport(passport);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRep.save(user);
    }

    @Override
    public List<User>getAllUsers() {
        return userRep.findAll();
    }

    @Override
    public User addRoleToUser(String username, String rolename) {
        User usr = userRep.findByUsername(username);
        Role r = roleRep.findByRole(rolename);
        usr.getRoles().add(r);
        return usr;
    }

    @Override
    public User updateUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRep.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRep.deleteById(id);
    }




    @Override
    public User findUserByUsername(String username) {
        return userRep.findByUsername(username);
    }



    @Override
    public List<Role> getAllRoles() {
        return roleRep.findAll();
    }

    @Override
    public void deleteRoleById(Long id) {
        roleRep.deleteById(id);
    }

    @Override
    public Role updateRole(Role role) {return roleRep.save(role);}
    @Override
    public Role addRole(Role role) {
        return roleRep.save(role);
    }


}