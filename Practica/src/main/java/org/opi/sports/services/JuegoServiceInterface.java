package org.opi.sports.services;

import java.util.List;

import org.opi.sports.contracts.UsuarioRequest;
import org.opi.sports.ejb.ActividadDeportiva;
import org.opi.sports.ejb.Juego;

/**
 * Fecha: 28/09/2015
 * 
 * @author Paula Segura Araya 
 * 
 *Sprint  Descripción: Interface que brinda encapsular los métodos del servicio
 */

public interface JuegoServiceInterface {

	public Juego findOne(Integer idJuego);

	public boolean exists(int idJuego);

	public <Juegos extends Juego> Juegos save(Juegos juegos);
	
	public List<Juego> getAllJuegos();
	
}
