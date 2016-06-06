package com.segurodecarros.domain.entities;

public abstract class Pessoa {
	private Telefone telefone;
	private int numeroContrato;
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public int getNumeroContrato() {
		return numeroContrato;
	}
	
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}	
}
