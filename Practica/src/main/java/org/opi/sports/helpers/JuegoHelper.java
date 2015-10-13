package org.opi.sports.helpers;

import java.util.ArrayList;
import java.util.List;

import org.opi.sports.contracts.JuegoRequest;
import org.opi.sports.ejb.Juego;
import org.opi.sports.pojo.JuegoPOJO;
import org.opi.sports.services.JuegoServiceInterface;
import org.opi.sports.utils.PojoUtils;

/**
 * Fecha: 12/10/2015
 * 
 * @author Paula Segura Araya 
 *
 *Sprint #1 Descripción: Clase helper para el juego.
 *
 */
public class JuegoHelper {
	
	private static JuegoHelper instance;
	private JuegoServiceInterface JuegoService;
	
	private JuegoHelper(){
	}
	
	private synchronized static void createInstance() {
		if (instance == null) {
			instance = new JuegoHelper();
		}
	}
	
	public static JuegoHelper getInstance() {
		if (instance == null) {
			createInstance();
		}
		return instance;
	}
	
	/**
	 * Metodo encargado de covertir Juego ejb a Juego POJO
	 * 
	 */
	public List<JuegoPOJO> convertirJuego(JuegoServiceInterface juegoService){
		List<JuegoPOJO> juegoPOJO = new ArrayList<JuegoPOJO>();
		List<Juego> juegoEJB = juegoService.getAllJuegos();
		
		for(Juego juego : juegoEJB){
			JuegoPOJO juegopojo = new JuegoPOJO();
			juegopojo.setIdJuego(juego.getIdJuego());
			juegopojo.setNombre(juego.getNombre());
			juegopojo.setDescripcion(juego.getDescripcion());
			juegopojo.setCategoria(juego.getcategoria());
			juegopojo.setNombreUsuario(juego.getUsuario().getNombre());
			juegopojo.setApellidoUsuario(juego.getUsuario().getApellido());
			juegoPOJO.add(juegopojo);
		}
		return juegoPOJO;
	}
	
}
