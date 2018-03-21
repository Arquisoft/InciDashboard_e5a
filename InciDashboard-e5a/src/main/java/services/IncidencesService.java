package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import entities.Incidence;
import repositories.IncidencesRepository;

/**
 * Servicio para gestionar las incidencias
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Service
public class IncidencesService {

    @Autowired
    private IncidencesRepository incidencesRepository;

    /**
     * Para obtener las incidencias asignadas al usuario que se pasa por parámetro
     * 
     * @param usuario
     * @return
     */
    public Page<Incidence> getIncidences(String identificador) {
	return incidencesRepository.findIncidences(identificador);
    }

    /**
     * Método para recibir la incidencia que cuyo id se pasa por parametro
     * 
     * @param id
     * @return
     */
    public Incidence getIncidence(Long id) {
	return incidencesRepository.findIncidence(id);
    }

    public void updateIncidence(Incidence incidence) {

    }

}
