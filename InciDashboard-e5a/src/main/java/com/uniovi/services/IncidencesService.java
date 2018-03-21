package com.uniovi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.model.Incidence;
import com.uniovi.repositories.IncidenceR;


@Service
public class IncidencesService {
	
	@Autowired
	IncidenceR incidenceRepository;
	
	public List<Incidence> getIncidences() {
		return incidenceRepository.getIncidences();
	}

}
