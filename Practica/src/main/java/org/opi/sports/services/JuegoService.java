package org.opi.sports.services;

import java.util.List;

import javax.transaction.Transactional;

import org.opi.sports.ejb.ActividadDeportiva;
import org.opi.sports.ejb.Juego;
import org.opi.sports.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Fecha: 28/09/2015 
 * 
 * @author Paula Segura Araya
 * 
 * Sprint #1 Descripción: Esta clase se encarga de proveer los servicios
 *         que el controlador necesita provenientes de los repositorios.
 *
 */
 
@Service
public class JuegoService implements JuegoServiceInterface {

	@Autowired
	JuegoRepository juegoRepository;

	public Juego findOne(Integer idJuego) {
		return juegoRepository.findOne(idJuego);
	}

	@Transactional
	@Override
	public boolean exists(int idJuego) {
		try {
			return juegoRepository.exists(idJuego);
		} catch (Exception exception) {
			throw exception;
		}
	}

	@Transactional
	public <Juegos extends Juego> Juegos save(Juegos juegos) {
		try {
			return juegoRepository.save(juegos);
		} catch (Exception exception) {
			throw exception;
		}
	}
	
	
	public List<Juego> getAllJuegos() {
		try {
			return juegoRepository.findAll();
		} catch (Exception exception) {
			throw exception;
		}
	}
	

}
