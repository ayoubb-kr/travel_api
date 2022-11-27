package com.saad.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.saad.pays.entities.*;
import com.saad.pays.entities.Continent;
@RepositoryRestResource(path = "cat ")
@CrossOrigin("http://localhost:4200/")
public interface ContinentRepository extends JpaRepository<Continent, Long> {
	

}
