package com.saad.pays.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Role_id;
    private String Role;


    public Role(Long role_id, String role) {
        super();
        this.Role_id = role_id;
        this.Role = role;
    }


    public Role() {
        super();
    }


    public Long getRole_id() {
        return Role_id;
    }


    public void setRole_id(Long role_id) {
        this.Role_id = role_id;
    }


    public String getRole() {
        return Role;
    }


    public void setRole(String role) {
        this.Role = role;
    }




}
