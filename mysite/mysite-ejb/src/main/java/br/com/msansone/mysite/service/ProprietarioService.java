package br.com.msansone.mysite.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.msansone.mysite.model.Proprietario;

@Stateless
public class ProprietarioService {

	@Inject
	private EntityManager em;
	
	public void gravarProprietario(Proprietario proprietario) {
		em.persist(proprietario);
	}
	
}
