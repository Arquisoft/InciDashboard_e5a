package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.State;
import repositories.StatesRepository;

/**
 * Servicio para gestionar el estado de las incidencias
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Service
public class StatesService {

    @Autowired
    private StatesRepository statesRepository;

    public List<State> getStates() {
	return statesRepository.findAll();
    }
}
