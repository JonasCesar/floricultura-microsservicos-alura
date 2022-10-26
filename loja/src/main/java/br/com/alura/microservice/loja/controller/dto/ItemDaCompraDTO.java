package br.com.alura.microservice.loja.controller.dto;

public class ItemDaCompraDTO {
	
	private Long id;
	private int quantidade;
	
	
	public Long getId() {
		return id;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
