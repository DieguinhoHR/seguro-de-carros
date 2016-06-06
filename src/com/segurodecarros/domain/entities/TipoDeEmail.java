package com.segurodecarros.domain.entities;

public enum TipoDeEmail {
	PESSOAL(1), COMERCIAL(2);
	private final int valor;
	
	TipoDeEmail(int valor) {
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}

}
