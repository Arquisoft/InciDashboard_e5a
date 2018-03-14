package entities;

public class Estado {

    private final static int ABIERTA = 0;
    private final static int EN_PROCESO = 1;
    private final static int CERRADA = 2;
    private final static int ANULADA = 3;

    public int getAbierta() {
	return ABIERTA;
    }

    public int getEnProceso() {
	return EN_PROCESO;
    }

    public int getCerrada() {
	return CERRADA;
    }

    public int getAnulada() {
	return ANULADA;
    }

    /**
     * Constructor
     */
    public Estado() {

    }
}
