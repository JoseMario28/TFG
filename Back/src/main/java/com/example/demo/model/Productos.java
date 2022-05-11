package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Productos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_productos;
	
	@Column(nullable = false)
	private String nombre_prodcuto;
	
	@Column(nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private double precio_unidad;
	
	@Column(nullable = false, unique=true)
	private String referencia;
	
	
	
}
