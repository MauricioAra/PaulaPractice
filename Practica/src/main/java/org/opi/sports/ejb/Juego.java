package org.opi.sports.ejb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Foto database table.
 * 
 */
@Entity
@NamedQuery(name="Juego.findAll", query="SELECT f FROM Juego f")
public class Juego implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idJuego;

	private String nombre;
	
	private String descripcion;

	//bi-directional many-to-one association to EstablecimientoDeportivo
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Juego() {
	}

	public int getIdJuego() {
		return this.idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}