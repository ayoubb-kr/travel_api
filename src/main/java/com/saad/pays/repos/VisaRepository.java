package com.saad.pays.repos;

import com.saad.pays.entities.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface VisaRepository extends JpaRepository<Visa, Long> {
	
	//@Query("select p from Pays p, Continent c where p.continent.idCat = c.idCat and p.continent.nomcont like %:nom%")
	//List<Visa> findByNomPays(@Param("nom") String nom);
	//add
	//List<Visa> findByVisaId(Long id);
}
