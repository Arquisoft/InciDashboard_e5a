package controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import services.IncidencesService;

@Controller
public class InciDashboardController {

    @Autowired
    private IncidencesService incidencesService;

    @RequestMapping("/inciDashboard/listIncidences")
    public String showInfo(Model model, Principal principal) {
    	//User usuario = principal.getName();
    	//Page<Incidence> incidencias = incidencesService.getIncidences(usuario);
    	//model.addAttribute("incidencesInfo", incidencias);
    	return "showInfo";
    }

    public String getIncidenceInfo(Model model) {
	return "";
    }

    public String modifyInfo(Model model) {
	return "";
    }

    public String getIncidences(Model model) {
	return "";
    }
}
