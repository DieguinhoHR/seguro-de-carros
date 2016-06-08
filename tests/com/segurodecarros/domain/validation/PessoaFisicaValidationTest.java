package com.segurodecarros.domain.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.PessoaFisicaException;

public class PessoaFisicaValidationTest {
	private PessoaFisica pessoaFisica;
	private PessoaFisicaValidation pessoaFisicaValidation; 
	
	@Before
	public void setUp() {
		pessoaFisica = new PessoaFisica();		
		pessoaFisicaValidation = new PessoaFisicaValidation();
	}
	
	@Test(expected=PessoaFisicaException.class)	
	public void testNomeNaoPodeTerMaisDeQuinzeCaracteres()  throws PessoaFisicaException {	
		pessoaFisica.setNome("Diego henrique rodrigues");		
		pessoaFisicaValidation.validarTamanhoMaxCaracteres(pessoaFisica);		
	}
	
	@Test
	public void testNomeNaoPodeConterNumeros() {		
		pessoaFisica.setNome("Diego hen5rique rodrigues");		
		assertEquals("Diego henrique rodrigues", 
				pessoaFisicaValidation.validarNomeSemNumeros(pessoaFisica));			
	}
	
	@Test
	public void testNomeNaoPodeConterCaracteresEspeciais() {		
		pessoaFisica.setNome("Diego *.henrique rodrigues");		
		assertEquals("Diego henrique rodrigues", 
				pessoaFisicaValidation.validarCaracteresEspeciais(pessoaFisica));			
	}
}
