package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import services.IncidencesService;

@Controller
public class DBManagement {

	@Autowired
	private IncidencesService incidencesService;
	
	public String updateIncidences(Model model)
	{
		return "";
	}
}
