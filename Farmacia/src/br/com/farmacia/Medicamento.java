package br.com.farmacia;

import java.util.ArrayList;

public class Medicamento {
	
	private String preço;
	public String getPreço() {
		return preço;
	}

	public void setPreço(String preço) {
		this.preço = preço;
	}

	private int Id;
	private String nome;
	private String bula;
	private int quantidade;
	private byte receitaUsuario;
	
	private ArrayList<Usuario> usuario;

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

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public byte getReceitaUsuario() {
		return receitaUsuario;
	}

	public void setReceitaUsuario(byte receitaUsuario) {
		this.receitaUsuario = receitaUsuario;
	}

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}

	
	
}
