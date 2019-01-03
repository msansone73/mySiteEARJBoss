package br.com.msansone.mysite.data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.msansone.mysite.model.Proprietario;

@ApplicationScoped
public class ProprietarioRepository {

	@Inject 
	private EntityManager em;
	
	public Proprietario findById(Long id){
		return em.find(Proprietario.class, id);
	}
}
