package org.opi.sports.contracts;

import org.opi.sports.pojo.JuegoPOJO;

import java.util.*;

/**
 * Fecha: 12/10/2015
 * 
 * @author Paula Segura Araya
 *
 * Sprint #1 Descripción: Clase response de los retos
 */

public class JuegoResponse extends BaseResponse{
	
	private List<JuegoPOJO> juegos;
	
	public List<JuegoPOJO> getJuegos() {
		return juegos;
	}

	public void setJuegos(
			List<JuegoPOJO> juegos) {
		this.juegos = juegos;
	}
	
	

}
