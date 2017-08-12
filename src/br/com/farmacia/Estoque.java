package br.com.farmacia;

import java.awt.List;
import java.util.ArrayList;

public class Estoque {

	private int quantidade;
	
	private Drogaria drogaria;
	
	
	private ArrayList<Medicamento> medicamento;


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Drogaria getDrogaria() {
		return drogaria;
	}


	public void setDrogaria(Drogaria drogaria) {
		this.drogaria = drogaria;
	}


	public ArrayList<Medicamento> getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(ArrayList<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}
	
	
	
	
}
