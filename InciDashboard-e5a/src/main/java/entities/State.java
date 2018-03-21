package entities;

import javax.persistence.*;

/**
 * Clase que representa el estado de una incidencia
 * 
 * @author Tania Álvarez Díaz
 *
 */
@Entity
@Table(name = "Estado")
public class State {

    @Id
    @GeneratedValue
    @Column(name = "estado_id")
    private long id;
    private String valor;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getValor() {
	return valor;
    }

    public void setValor(String valor) {
	this.valor = valor;
    }

    /**
     * Constructo con parametros
     * 
     * @param valor
     */
    public State(String valor) {
	super();
	setValor(valor);
    }

    /**
     * Constructor
     */
    public State() {

    }
}
