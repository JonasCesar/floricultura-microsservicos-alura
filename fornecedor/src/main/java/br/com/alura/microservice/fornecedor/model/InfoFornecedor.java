package br.com.alura.microservice.fornecedor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfoFornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String estado;
	private String endereco;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEstado() {
		return estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
