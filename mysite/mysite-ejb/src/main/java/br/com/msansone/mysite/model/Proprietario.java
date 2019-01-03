package br.com.msansone.mysite.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
public class Proprietario implements Serializable {

	private static final long serialVersionUID = -1000156711708921458L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@NotEmpty
	private String cpf;
	
	private String foneParticular;
	private String foneComercial;
	private String celularPessoal;
	private String celularProfissional;
	private String emailPessoal;
	private String emailProfissional;
	
	

	public String getFoneParticular() {
		return foneParticular;
	}

	public void setFoneParticular(String foneParticular) {
		this.foneParticular = foneParticular;
	}

	public String getFoneComercial() {
		return foneComercial;
	}

	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}

	public String getCelularPessoal() {
		return celularPessoal;
	}

	public void setCelularPessoal(String celularPessoal) {
		this.celularPessoal = celularPessoal;
	}

	public String getCelularProfissional() {
		return celularProfissional;
	}

	public void setCelularProfissional(String celularProfissional) {
		this.celularProfissional = celularProfissional;
	}

	public String getEmailPessoal() {
		return emailPessoal;
	}

	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}

	public String getEmailProfissional() {
		return emailProfissional;
	}

	public void setEmailProfissional(String emailProfissional) {
		this.emailProfissional = emailProfissional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
