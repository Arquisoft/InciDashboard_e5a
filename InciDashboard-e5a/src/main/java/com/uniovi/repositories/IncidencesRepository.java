package com.uniovi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uniovi.model.Incidence;


@Repository
public interface IncidencesRepository extends CrudRepository<Incidence, Long>{


}
