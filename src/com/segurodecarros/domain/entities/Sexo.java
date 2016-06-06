package com.segurodecarros.domain.entities;

public enum Sexo {
	MASCULINO(1), FEMINIMO(2);
	private final int valor;
	
	Sexo(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
