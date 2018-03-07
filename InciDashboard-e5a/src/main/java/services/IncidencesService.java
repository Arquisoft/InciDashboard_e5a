package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Incidence;
import repositories.IncidencesRepository;

/**
 * Servicio que accede a la base de datos para modificar
 * los datos de las incidencias.
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Service
public class IncidencesService {

	@Autowired
	private IncidencesRepository incidencesRepository;
	
	public void updateIncidence(Incidence incidence)
	{
		
	}
	
}
