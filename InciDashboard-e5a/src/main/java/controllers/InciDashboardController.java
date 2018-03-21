package controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

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
	
	public List<SseEmitter> emitters = Collections.synchronizedList( new ArrayList<SseEmitter>());

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
    
	@RequestMapping("/getEmitter")
	public SseEmitter getEmitter() {
		return nuevoEmitter();
	}
    
    public SseEmitter nuevoEmitter() {
    	SseEmitter emitter = new SseEmitter(0L);
    	
    	emitter.onTimeout(() -> emitters.remove(emitter));
    	emitter.onCompletion(() -> emitters.remove(emitter));
    	
    	emitters.add(emitter);
    	
    	return emitter;
    }
}
