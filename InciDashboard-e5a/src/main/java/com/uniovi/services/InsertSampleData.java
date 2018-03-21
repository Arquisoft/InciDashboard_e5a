package com.uniovi.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uniovi.model.Estado;
import com.uniovi.model.Incidence;
import com.uniovi.model.User;
import com.uniovi.repositories.IncidencesRepository;

@Service
public class InsertSampleData {

	private List<Incidence> incidences;
	
	@Autowired
	IncidencesRepository incidenceRepository;

	@PostConstruct
	public void init() {
		incidences = new ArrayList<Incidence>();
		List<User> usuarios = new ArrayList<User>();

		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		incidences.add(new Incidence("descripcion", "localizacion", new HashSet<String>(),
				new HashMap<String, String>(), Estado.ABIERTA));
		
		incidenceRepository.save(incidences);
		//usuariosRepository.save(usuarios);
		
	}

	public List<Incidence> getIncidences() {
		return incidences;
	}

}
