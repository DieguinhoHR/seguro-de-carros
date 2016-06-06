package com.segurodecarros.domain.entities;

public class Email {
	private TipoDeEmail tipoDeEmail;
	private String valor;
	
	public TipoDeEmail getTipoDeEmail() {
		return tipoDeEmail;
	}
	
	public void setTipoDeEmail(TipoDeEmail tipoDeEmail) {
		this.tipoDeEmail = tipoDeEmail;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}	
	
}
