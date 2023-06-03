package com.vermeg.travel.repos;

import com.vermeg.travel.entities.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface VisaRepository extends JpaRepository<Visa, String> {

}
