package com.saad.pays.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long User_id;

    @Column(unique=true)
    private String Username;
    private String Password;
    private Boolean enabled;



    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id") ,
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Role> Roles;

    public User(Long user_id, String username, String password, Boolean enabled, List<Role> roles) {
        super();
        this.User_id = user_id;
        this.Username = username;
        this.Password = password;
        this.enabled = enabled;
        this.Roles = roles;
    }

    public User() {
        super();
    }

    public Long getUser_id() {
        return User_id;
    }

    public void setUser_id(Long user_id) {
        this.User_id = user_id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> roles) {
        this.Roles = roles;
    }


}
