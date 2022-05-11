package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="modo_envio")
public class Modo_envio {

	@Id
	private String modos_envio;

	public Modo_envio(String modos_envio) {
		super();
		this.modos_envio = modos_envio;
	}

	public String getModos_envio() {
		return modos_envio;
	}

	public void setModos_envio(String modos_envio) {
		this.modos_envio = modos_envio;
	}

	@Override
	public String toString() {
		return "Modo_envio [modos_envio=" + modos_envio + "]";
	}
	
	
	
	
}
