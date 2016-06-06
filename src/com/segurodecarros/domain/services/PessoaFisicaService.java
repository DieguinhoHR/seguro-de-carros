package com.segurodecarros.domain.services;

import com.segurodecarros.domain.entities.PessoaFisica;

public class PessoaFisicaService {	
	public boolean inserir(PessoaFisica pessoaFisica) {
		if (pessoaFisica.getIdade() >= 18 && pessoaFisica.getIdade() <= 60) 
			return true;					
		return false;
	}
}
