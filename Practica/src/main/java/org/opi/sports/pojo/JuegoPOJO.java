package org.opi.sports.pojo;

import java.util.List;

import org.opi.sports.ejb.Inscripcion;
import org.opi.sports.ejb.Subscripcion;
import org.opi.sports.ejb.Usuario_Rol;

/**
 * Fecha: 28/09/2015
 * 
 * @author Paula Segura Araya 
 *
 *Sprint 01 Descripción: Clase usuario POJO que posee toda la información del juego
 */
public class JuegoPOJO {
	
	private int idJuego;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String nombreUsuario;
	private String apellidoUsuario;
	
	/**
	 * Método get que devuelve el id del juego
	 * 
	 */
	public int getIdJuego() {
		return idJuego;
	}
	/**
	 * Método set que modifica el id del juego
	 * 
	 */
	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}
	/**
	 * Método get que devuelve el nombre del juego
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set que modifica el nombre del juego
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método get que devuelve la descripción del juego
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Método set que modifica la descripción del juego
	 * 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Método get que devuelve la categoría del juego
	 * 
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * Método set que modifica la categoría del juego
	 * 
	 */
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	/**
	 * Método get que devuelve el nombre del usuario
	 * 
	 */
	public String getNombreUsuario(){
		return nombreUsuario;
	}
	/**
	 * Método set que modifica el nombre del usuario
	 * 
	 */
	public void setNombreUsuario(String nombreUsuario){
		this.nombreUsuario = nombreUsuario;
	}
	
	/**
	 * Método get que devuelve el apellido del usuario
	 * 
	 */
	public String getApellidoUsuario(){
		return apellidoUsuario;
	}
	
	/**
	 * Método set que modifica el apellido del usuario
	 * 
	 */
	public void setApellidoUsuario(String apellidoUsuario){
		this.apellidoUsuario = apellidoUsuario;
	}
	
}
