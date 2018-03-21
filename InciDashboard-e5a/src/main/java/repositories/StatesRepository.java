package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.State;

/**
 * Repositorio relacionado con los estados de las incidencias
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Repository
public interface StatesRepository extends CrudRepository<State, Long> {

    public List<State> findAll();
}
