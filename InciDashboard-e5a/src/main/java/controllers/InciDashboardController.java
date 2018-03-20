package controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Incidence;
import services.IncidencesService;

/**
 * Controlador para gestionar las incidencias
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Controller
public class InciDashboardController {

    @Autowired
    private IncidencesService incidencesService;

    @RequestMapping("/inciDashboard/listIncidences")
    public String showInfo(Pageable pageable, Model model, Principal principal) {
    	
	String identificador = principal.getName();
    	Page<Incidence> incidencias = incidencesService.getIncidences(identificador);
    	model.addAttribute("incidencesList", incidencias);
    	return "listIncidences";
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
