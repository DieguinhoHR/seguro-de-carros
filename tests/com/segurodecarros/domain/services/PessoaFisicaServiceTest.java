package com.segurodecarros.domain.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.segurodecarros.domain.entities.PessoaFisica;
import com.segurodecarros.domain.entities.Sexo;

public class PessoaFisicaServiceTest {
	private PessoaFisica pessoaFisica;
	private PessoaFisicaService pessoaFisicaService;
	
	@Before
	public void setUp() throws Exception {
		pessoaFisica = new PessoaFisica();
		pessoaFisicaService = new PessoaFisicaService();
	}	
	
	@Test
	public void testValidaSexoFemininoEIdadeAcimaDeVinteETres() {				
		pessoaFisica.setSexo(Sexo.FEMINIMO);		
		pessoaFisica.setIdade(24);								
		pessoaFisica.setEstadoCivil("Casada");
		assertEquals(3.6, pessoaFisicaService.validarDesconto(pessoaFisica, 4.500), 0.00);
	}	
	
	@Test
	public void testValidaSexoFemininoEIdadeAcimaDeTrinta() {				
		pessoaFisica.setSexo(Sexo.FEMINIMO);		
		pessoaFisica.setIdade(45);								
		pessoaFisica.setEstadoCivil("Solteira");
		pessoaFisica.setCnh("sem pontuação");
		assertEquals(4050, pessoaFisicaService.validarDesconto(pessoaFisica, 4500), 0.00);
	}	
}
