package com.vermeg.travel.entities;

import javax.persistence.*;
@Entity
public class VisaRequest {

    public enum Status {
        WAITING,
        IN_PROGRESS,
        SUCCESSFUL,
        REJECTED
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="idPass", nullable=false)
    private Passport passport;

    private String type;

    private String destination;
    @Enumerated(EnumType.STRING)
    private Status status;
    public VisaRequest() {
        super();
    }

    public VisaRequest(Long id, Passport passport, String type, String destination, Status status) {
        this.id = id;
        this.passport = passport;
        this.type = type;
        this.destination = destination;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
