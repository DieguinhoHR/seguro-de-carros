package com.segurodecarros.domain.services;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.Sexo;

public class PessoaFisicaService {
	public double validarDesconto(PessoaFisica pessoaFisica, double valor) {		
		return isValidateDesconto(valor, pessoaFisica);					
	}
			
	private double isValidateDesconto(double valor, PessoaFisica pessoaFisica) {
		if (pessoaFisica.getSexo().equals(Sexo.FEMINIMO) && 
		    pessoaFisica.getIdade() > 23 &&
		    pessoaFisica.getEstadoCivil().equals("Casada")) {
			return valor - (valor * 0.20);
		}
		
		if (pessoaFisica.getSexo().equals(Sexo.FEMINIMO) && 
			pessoaFisica.getIdade() >= 30 &&
			pessoaFisica.getEstadoCivil().equals("Solteira") &&
			pessoaFisica.getCnh().equals("sem pontuação")) {
			return valor - (valor * 0.10);
		}
		return valor - (valor * 0.50);		
	}
}
