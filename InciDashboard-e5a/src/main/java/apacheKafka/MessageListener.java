package apacheKafka;


import org.springframework.kafka.annotation.KafkaListener;

import entities.Incidence;

import javax.annotation.ManagedBean;

/**
 * Created by herminio on 28/12/16.
 */
@ManagedBean
public class MessageListener {

    

	//Con la anotacion KafkaListener indicamos que nos suscribimos al topic. 
	//Puede que esta clase no se tenga que utilizar pero asi seran mas o menos los metodos que recojan incidencias de kafka
    @KafkaListener(topics = "incidencia")
    public Incidence listen(Incidence data) {
        return data;
    }



}
