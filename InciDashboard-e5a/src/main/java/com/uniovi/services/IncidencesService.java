package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uniovi.model.Incidence;
import com.uniovi.repositories.IncidencesRepository;

@Service
public class IncidencesService {

	@Autowired
	IncidencesRepository incidencesRepository;

	public List<Incidence> getIncidences() {
		List<Incidence> incidencias = new ArrayList<Incidence>();
		incidencesRepository.findAll().forEach(incidencias::add);
		return incidencias;
	}

	public Incidence getIncidence(Long id) {
		return incidencesRepository.findOne(id);
	}

}
