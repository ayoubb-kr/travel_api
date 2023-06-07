package com.vermeg.travel.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vermeg.travel.entities.Passport;


public interface PassportRepository extends JpaRepository<Passport, String> {

    @Query("SELECT p FROM Passport p WHERE p.user.user_id = :userId")
    Passport findByUser_Id(@Param("userId") Long userId);
}
