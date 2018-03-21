package com.uniovi.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.uniovi.model.Incidence;

@Component
public class IncidenceR {
	
	private List<Incidence> incidences;
	
	@PostConstruct
	public void init() {
		incidences = new ArrayList<Incidence>();
		
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
		incidences.add(new Incidence("descripcion","localizacion",new HashSet<String>(), new HashMap<String,String>(), "estado"));
	}
	
	public List<Incidence> getIncidences(){
		return incidences;
	}

}
