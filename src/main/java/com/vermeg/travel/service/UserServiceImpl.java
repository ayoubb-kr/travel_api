package com.vermeg.travel.service;

import com.vermeg.travel.entities.Passport;
import com.vermeg.travel.entities.Role;
import com.vermeg.travel.entities.User;
import com.vermeg.travel.repos.PassportRepository;
import com.vermeg.travel.repos.RoleRepository;
import com.vermeg.travel.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    public User saveUser(User user) {
        Passport passport = null;
        if (user.getPassport() != null) {
            String idPass = user.getPassport().getIdPass();
            passport = passRepository.findById(idPass)
                    .orElseThrow(() -> new RuntimeException("Passport not found"));
        }
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
        Optional<User> originalUserOpt = userRep.findById(user.getUser_id());
        if(originalUserOpt.isPresent()) {
            User originalUser = originalUserOpt.get();
            // only set the password if it's not null in the incoming user
            if(user.getPassword() != null) {
                originalUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            }


            originalUser.setUsername(user.getUsername());
            originalUser.setRoles(user.getRoles());
            originalUser.setPassport(user.getPassport());


            return userRep.save(originalUser);
        } else {
            throw new RuntimeException("User not found with id: " + user.getUser_id());
        }
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
    public Optional<User> findUserById(Long user_id) {
        return userRep.findUserByUserId(user_id);
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