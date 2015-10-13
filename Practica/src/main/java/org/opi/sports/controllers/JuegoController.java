package org.opi.sports.controllers;

import java.util.ArrayList;
import java.util.List;

import org.opi.sports.contracts.JuegoRequest;
import org.opi.sports.contracts.JuegoResponse;
import org.opi.sports.ejb.Juego;
import org.opi.sports.helpers.JuegoHelper;
import org.opi.sports.pojo.JuegoPOJO;
import org.opi.sports.services.JuegoService;
import org.opi.sports.services.JuegoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fecha: 12/10/2015
 * 
 * @author Paula Segura Araya
 *
 * Sprint #1 Descripción: Clase controller de los juegos.
 *
 */
@RestController 
@RequestMapping(value = "rest/juego")
public class JuegoController {

	@Autowired
	JuegoServiceInterface juegoService;
	/**
	 * Método encargado de solicitar todos los juegos existentes.
	 * 
	 */
	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public JuegoResponse getAll() {

	JuegoResponse juegoResponse = new JuegoResponse();
	
	List<JuegoPOJO> juegoPOJO = new ArrayList<JuegoPOJO>();
	
	juegoPOJO =	 JuegoHelper.getInstance().convertirJuego(juegoService);
	
	juegoResponse.setJuegos(juegoPOJO);
	juegoResponse.setCode(200);
	
	return juegoResponse;
	}

}
