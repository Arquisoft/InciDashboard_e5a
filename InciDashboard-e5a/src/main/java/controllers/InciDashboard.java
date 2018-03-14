package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import services.IncidencesService;

@Controller
public class InciDashboard {

    @Autowired
    private IncidencesService incidencesService;

    @RequestMapping("/inciDashboard")
    public String showInfo(Model model) {
	// List<Incidence> incidencias = incidencesService.
	// model.addAttribute("incidencesInfo", incidencias);
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
