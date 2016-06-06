package com.segurodecarros.domain.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.segurodecarros.domain.entities.PessoaFisica;

public class PessoaFisicaServiceTest {
	private PessoaFisica pessoaFisica;
	private PessoaFisicaService pessoaFisicaService;
	
	@Before
	public void setUp() throws Exception {
		pessoaFisica = new PessoaFisica();
		pessoaFisicaService = new PessoaFisicaService();
	}

	@Test
	public void testIdadeValidaEntreDezoitoESessenta() {
		pessoaFisica.setIdade(29);		
		assertTrue(pessoaFisicaService.inserir(pessoaFisica));		
	}
	
	@Test
	public void testIdadeInvalidaEntreDezoitoESessenta() {
		pessoaFisica.setIdade(61);		
		assertFalse(pessoaFisicaService.inserir(pessoaFisica));		
	}
}
