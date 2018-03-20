package repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import entities.Incidence;
import entities.User;

public interface IncidencesRepository extends CrudRepository<Incidence, Long>{

	@Query("SELECT i FROM Incidence i WHERE i.user = ?1")
    public Page<Incidence> findIncidences(User user);

}
