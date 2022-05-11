package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellidos;
	
	@Column(nullable = false)
	private String Ciudad;
	
	@Column(nullable = false)
	private String Codigo_postal;
	
	@Column(nullable = false)
	private String telefono;
	
	@Column(unique = true,nullable = false)
	private String dni;

	public Clientes(Integer id, String nombre, String apellidos, String ciudad, String codigo_postal, String telefono,
			String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Ciudad = ciudad;
		Codigo_postal = codigo_postal;
		this.telefono = telefono;
		this.dni = dni;
	}

	public Clientes(String nombre, String apellidos, String ciudad, String codigo_postal, String telefono, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		Ciudad = ciudad;
		Codigo_postal = codigo_postal;
		this.telefono = telefono;
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getCodigo_postal() {
		return Codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		Codigo_postal = codigo_postal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Ciudad=" + Ciudad
				+ ", Codigo_postal=" + Codigo_postal + ", telefono=" + telefono + ", dni=" + dni + "]";
	}
	
	
	
}
