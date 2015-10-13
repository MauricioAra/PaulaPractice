package org.opi.sports.ejb;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQuery(name="Juego.findAll", query="SELECT j FROM Juego j")
public class Juego implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idJuego;
	private String nombre; 
	private String descripcion;
	private String categoria;

	//bi-directional many-to-one association to Usuario
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
	
	public String getNombre(){
		return this.nombre;
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre; 
	}
	
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion; 
		
	}
	
	public String getcategoria(){
		return this.categoria;
	}
	
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}