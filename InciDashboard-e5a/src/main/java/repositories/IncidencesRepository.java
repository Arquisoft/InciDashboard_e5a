package repositories;


import org.springframework.data.repository.CrudRepository;

import entities.Incidence;

public interface IncidencesRepository extends CrudRepository<Incidence, Long>{

    // metodo actualizar incidencia

}
