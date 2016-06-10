package com.segurodecarros.domain.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.PessoaFisicaException;
import com.segurodecarros.domain.entities.Sexo;

public class PessoaFisicaValidationTest {
	private PessoaFisica pessoaFisica;
	private PessoaFisicaValidation pessoaFisicaValidation; 
	
	@Before
	public void setUp() {
		pessoaFisica = new PessoaFisica();		
		pessoaFisicaValidation = new PessoaFisicaValidation();
	}
	
	@Test
	public void testIdadeValidaEntreDezoitoESessenta() {
		pessoaFisica.setIdade(29);		
		assertEquals(29, pessoaFisica.getIdade());		
	}
	
	@Test
	public void testIdadeInvalidaEntreDezoitoESessenta() {
		pessoaFisica.setIdade(61);		
		assertEquals(61, pessoaFisica.getIdade());			
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

