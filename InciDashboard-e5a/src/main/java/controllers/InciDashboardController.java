package controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Incidence;
import services.IncidencesService;
import services.StatesService;

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
    
    @Autowired
    private StatesService statesService;

    @RequestMapping("/inciDashboard/listIncidences")
    public String showInfo(Pageable pageable, Model model, Principal principal) {

	String identificador = principal.getName();
	Page<Incidence> incidencias = incidencesService.getIncidences(identificador);
	model.addAttribute("incidencesList", incidencias);
	return "listIncidences";
    }

    @RequestMapping("/inciDashboard/detailsIncidence/{id}")
    public String getIncidenceInfo(Model model, @PathVariable Long id) {
	model.addAttribute("incidence", incidencesService.getIncidence(id));
	return "detailsIncidence";
    }

    @RequestMapping("/inciDashboard/modifyStateIncidence/{id}")
    public String modifyInfo(Model model, @PathVariable Long id) {
	model.addAttribute("incidence", incidencesService.getIncidence(id));
	model.addAttribute("listStates", statesService.getStates());
	/**COMPLETAR: CREAR EL HTML CORRESPONDIENTE**/
	return "";
    }
    
    @RequestMapping("/login")
    public String login() {
	return "login";
    }

}
