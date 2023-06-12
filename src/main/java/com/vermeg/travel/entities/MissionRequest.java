package com.vermeg.travel.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MissionRequest {
    public enum RequestStatus {
        WAITING, REJECTED, IN_PROGRESS, ACCEPTED
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="username", referencedColumnName="username")
    private User user;

    @ManyToOne
    @JoinColumn(name="passport_id", referencedColumnName="idPass")
    private Passport passport;

    @ManyToOne
    @JoinColumn(name="visa_id", referencedColumnName="idVisa")
    private Visa visa;

    @Temporal(TemporalType.DATE)
    private Date dateDep;

    @Temporal(TemporalType.DATE)
    private Date dateRet;

    private int days;

    private String missionObject;

    private String departureCity;

    private String arrivalCity;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    private int budget;

    private String feadback;

    public MissionRequest(Long id, User user, Passport passport, Visa visa, Date dateDep, Date dateRet, int days, String missionObject, String departureCity, String arrivalCity, RequestStatus status, int budget, String feadback) {
        this.id = id;
        this.user = user;
        this.passport = passport;
        this.visa = visa;
        this.dateDep = dateDep;
        this.dateRet = dateRet;
        this.days = days;
        this.missionObject = missionObject;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.status = status;
        this.budget = budget;
        this.feadback = feadback;
    }

    public MissionRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Visa getVisa() {
        return visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public Date getDateDep() {
        return dateDep;
    }

    public void setDateDep(Date dateDep) {
        this.dateDep = dateDep;
    }

    public Date getDateRet() {
        return dateRet;
    }

    public void setDateRet(Date dateRet) {
        this.dateRet = dateRet;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getMissionObject() {
        return missionObject;
    }

    public void setMissionObject(String missionObject) {
        this.missionObject = missionObject;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getFeadback() {
        return feadback;
    }

    public void setFeadback(String feadback) {
        this.feadback = feadback;
    }
}
