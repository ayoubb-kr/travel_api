package com.saad.pays.repos;

import com.saad.pays.entities.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface VisaRepository extends JpaRepository<Visa, String> {

}
