package com.uniovi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.model.Incidence;
import com.uniovi.repositories.IncidenceR;
import com.uniovi.repositories.IncidencesRepository;

@Service
public class IncidencesService {

	@Autowired
	IncidenceR incidenceRepositoryMock;

	@Autowired
	IncidencesRepository incidencesRepository;

	public List<Incidence> getIncidences() {
		return incidenceRepositoryMock.getIncidences();
	}

	public Incidence getIncidence(Long id) {
		return incidencesRepository.findOne(id);
	}

}
