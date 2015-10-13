package org.opi.sports.contracts;

/**
 * Fecha: 12/10/2015
 *
 * @author Paula Segura Araya 
 *
 *Sprint # 1 Descripción: Esta clase simula un httpservlet, 
 *simula las solicitudes del front end.
 *
 */
public class JuegoRequest extends BasePagingRequest {
	
	public int idJuego;
	
	public String juego;
	
	
	public JuegoRequest(){
		super();
	}
	
	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego= juego;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}
	
	
	
	

}
