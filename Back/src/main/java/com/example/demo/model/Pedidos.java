package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="pedidos")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pedido;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_pedido;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_envio;
	
	
}
