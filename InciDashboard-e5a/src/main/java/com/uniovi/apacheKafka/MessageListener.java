package com.uniovi.apacheKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.uniovi.controllers.InciDashboardController;

import java.io.IOException;

import javax.annotation.ManagedBean;

/**
 * Created by herminio on 28/12/16.
 */
@ManagedBean
public class MessageListener {

	@Autowired
	InciDashboardController controller;

	// Con la anotacion KafkaListener indicamos que nos suscribimos al topic.
	// Puede que esta clase no se tenga que utilizar pero asi seran mas o menos los
	// metodos que recojan incidencias de kafka
	@KafkaListener(topics = "incidencia")
	public void listen(String data) {
		System.out.println(data);
		for (SseEmitter emitter : controller.emitters) {
			try {
				emitter.send(data, MediaType.APPLICATION_JSON);
			} catch (IOException e) {
				emitter.complete();
			}
		}
	}

}
