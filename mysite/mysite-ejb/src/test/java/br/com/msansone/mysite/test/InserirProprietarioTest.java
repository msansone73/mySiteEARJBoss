package br.com.msansone.mysite.test;

import javax.inject.Inject;

import org.junit.Test;

import br.com.msansone.mysite.model.Proprietario;
import br.com.msansone.mysite.service.ProprietarioService;

public class InserirProprietarioTest {


	@Inject
	ProprietarioService proprietarioService;
	
	@Test
	public void inserirProprietario() {
		
		
		Proprietario p = new Proprietario();
		p.setNome("Marcio Sansone");
		p.setCpf("123456");
		p.setCelularPessoal("9123");
		
		proprietarioService.gravarProprietario(p);
		
	}
	
}
