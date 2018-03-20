package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import entities.Incidence;
import entities.User;
import repositories.IncidencesRepository;

/**
 * Servicio que accede a la base de datos para modificar los datos de las
 * incidencias.
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Service
public class IncidencesService {

    @Autowired
    private IncidencesRepository incidencesRepository;

   /**
    * Para obtener las incidencias asignadas al usuario 
    * que se pasa por parámetro
    * 
    * @param usuario
    * @return
    */
    public Page<Incidence> getIncidences(User usuario) {
    	return incidencesRepository.findIncidences(usuario);
    }
    
    public void updateIncidence(Incidence incidence) {

    }

}
