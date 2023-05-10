package com.saad.pays.repos;

import java.util.List;

import com.saad.pays.entities.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface PayRepository extends JpaRepository<Visa, Long> {
	
	@Query("select p from Pays p, Continent c where p.continent.idCat = c.idCat and p.continent.nomcont like %:nom%")
	List<Visa> findByNomPays(@Param("nom") String nom);
	//add
	List<Visa> findByContinentIdCat(Long id);
}
