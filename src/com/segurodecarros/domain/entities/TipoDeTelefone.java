package com.segurodecarros.domain.entities;

public enum TipoDeTelefone {
	CELULAR(1), COMERCIAL(2), RESIDENCIAL(3);
	private final int valor;
	
	TipoDeTelefone(int valor) {
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}
}
