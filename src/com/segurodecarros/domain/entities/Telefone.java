package com.segurodecarros.domain.entities;

public class Telefone {
	private TipoDeTelefone tipo;
	private int ddi;
	private int ddd;
	private int valor;
	
	public TipoDeTelefone getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoDeTelefone tipo) {
		this.tipo = tipo;
	}
	
	public int getDdi() {
		return ddi;
	}
	
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	
	public int getDdd() {
		return ddd;
	}
	
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}	
	
}
