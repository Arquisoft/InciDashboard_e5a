package entities;

import javax.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Constructo con parametros
     * @param valor
     */
    public Estado (String valor) {
	super();
	setValor(valor);
    }
    
    /**
     * Constructor
     */
    public Estado() {

    }
}
