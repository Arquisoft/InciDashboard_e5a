package entities;

import java.util.HashMap;
import java.util.List;

import javax.persistence.*;

/**
 * Clase que representa una incidencia
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Entity
@Table(name = "Incidence")
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User usuario;
    private String contraseña;
    private String descripcion;
    private Location localizacion;
    private List<String> etiquetas;
    private HashMap<String, Integer> campos;
    @OneToOne
    @JoinColumn(name = "estado_id")
    private State estado;

    public User getUsuario() {
	return usuario;

    }

    public void setUsuario(User usuario) {
	this.usuario = usuario;
    }

    public String getContraseña() {
	return contraseña;
    }

    public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public Location getLocalizacion() {
	return localizacion;
    }

    public void setLocalizacion(Location localizacion) {
	this.localizacion = localizacion;
    }

    public List<String> getEtiquetas() {
	return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
	this.etiquetas = etiquetas;
    }

    public HashMap<String, Integer> getCampos() {
	return campos;
    }

    public void setCampos(HashMap<String, Integer> campos) {
	this.campos = campos;
    }

    public State getEstado() {
	return estado;
    }

    public void setEstado(State estado) {
	this.estado = estado;
    }

    public Incidence(User usuario, String contraseña, String descripcion, Location localizacion, List<String> etiquetas,
	    HashMap<String, Integer> campos, State estado) {
	super();
	this.usuario = usuario;
	this.contraseña = contraseña;
	this.descripcion = descripcion;
	this.localizacion = localizacion;
	this.etiquetas = etiquetas;
	this.campos = campos;
	this.estado = estado;
    }
}
