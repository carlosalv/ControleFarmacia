package br.com.farmacia;

import java.util.ArrayList;

public class Medicamento {
	
	private String pre�o;
	public String getPre�o() {
		return pre�o;
	}

	public void setPre�o(String pre�o) {
		this.pre�o = pre�o;
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
