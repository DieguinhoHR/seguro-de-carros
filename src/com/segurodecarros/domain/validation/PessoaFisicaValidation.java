package com.segurodecarros.domain.validation;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.PessoaFisicaException;
import com.segurodecarros.domain.entities.Sexo;

public class PessoaFisicaValidation {
	public int validarFaixaEtaria(PessoaFisica pessoaFisica) {
		if (pessoaFisica.getIdade() >= 18 && pessoaFisica.getIdade() <= 60) 
			return pessoaFisica.getIdade();					
		return 0;
	}
	
	public void validarTamanhoMaxCaracteres(PessoaFisica pessoaFisica) throws PessoaFisicaException {				
		if (pessoaFisica.getNome().length() > 15) 
			throw new PessoaFisicaException("Nome não pode ter mais de 15 caracteres");		
	}
	
	public String validarNomeSemNumeros(PessoaFisica pessoaFisica) {		
		return	pessoaFisica.getNome().replaceAll("[1234567890]", "");		 		
	}	
	
	public String validarCaracteresEspeciais(PessoaFisica pessoaFisica) {		
		return	pessoaFisica.getNome().replaceAll("[*.$#@!]", "");		 		
	}
}
