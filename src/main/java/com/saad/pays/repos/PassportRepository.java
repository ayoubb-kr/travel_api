package com.saad.pays.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saad.pays.entities.Passport;
@RepositoryRestResource(path = "cat ")
@CrossOrigin("*")
public interface PassportRepository extends JpaRepository<Passport, Long> {
	

}
