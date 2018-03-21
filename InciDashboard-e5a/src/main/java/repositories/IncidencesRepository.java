package repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import entities.Incidence;

/**
 * Repositorio relacionado con las incidencias
 * 
 * @author Tania Álvarez Díaz
 *
 */
public interface IncidencesRepository extends CrudRepository<Incidence, Long> {

    @Query("SELECT i FROM Incidence i WHERE i.user.identificador = ?1")
    public Page<Incidence> findIncidences(String identificador);

    @Query("SELECT i FROM Incidence i WHERE i.id = ?1")
    public Incidence findIncidence(Long id);
}
