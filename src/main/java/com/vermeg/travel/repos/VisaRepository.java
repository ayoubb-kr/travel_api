package com.vermeg.travel.repos;

import com.vermeg.travel.entities.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


public interface VisaRepository extends JpaRepository<Visa, String> {

    List<Visa> findByPassport_IdPass(String idPass);

}
