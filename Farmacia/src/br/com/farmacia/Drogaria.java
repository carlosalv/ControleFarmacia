package br.com.farmacia;

import java.util.ArrayList;

public class Drogaria {
	
	private int Id;
	private String nome;
	
	private ArrayList<Estoque> estoque;
	
	
	
	
	
	public int getId() {
		return Id;
	}





	public void setId(int id) {
		Id = id;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public ArrayList<Estoque> getEstoque() {
		return estoque;
	}





	public void setEstoque(ArrayList<Estoque> estoque) {
		this.estoque = estoque;
	}





	public void enviarMedicamento(){
		
	}

}
