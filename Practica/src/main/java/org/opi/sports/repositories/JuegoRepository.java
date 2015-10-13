package org.opi.sports.repositories;
import java.util.List;

import org.opi.sports.ejb.Juego;
import org.opi.sports.ejb.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Fecha: 28/09/2015
 * @author Paula Segura Araya
 *
 *Sprint #1  Descripción: Esta clase sirve de repositorio para objetos de tipo "Juego"
 *
 */
public interface JuegoRepository extends CrudRepository<Juego,Integer>{
	
	public List<Juego> findAll();
	
	public <S extends Juego> S save(S juego);
	
	public boolean exists(Integer idJuego);
	
	public Juego findOne(Integer idJuego);
}