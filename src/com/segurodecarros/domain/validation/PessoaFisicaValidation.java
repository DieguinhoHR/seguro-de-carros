package com.segurodecarros.domain.validation;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.PessoaFisicaException;

public class PessoaFisicaValidation {	
	public void validarTamanhoMaxCaracteres(PessoaFisica pessoaFisica) throws PessoaFisicaException {				
		if (pessoaFisica.getNome().length() > 15) {
			throw new PessoaFisicaException("Nome não pode ter mais de 15 caracteres");
		}
	}
	
	public String validarNomeSemNumeros(PessoaFisica pessoaFisica) {		
		return	pessoaFisica.getNome().replaceAll("[1234567890]", "");		 		
	}	
	
	public String validarCaracteresEspeciais(PessoaFisica pessoaFisica) {		
		return	pessoaFisica.getNome().replaceAll("[*.$#@!]", "");		 		
	}	
}
