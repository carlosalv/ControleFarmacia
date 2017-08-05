package br.com.controle;

import br.com.farmacia.Compra;
import br.com.farmacia.Medicamento;
import br.com.farmacia.Usuario;

public class MetodoMain {

	public static void main(String[] args) {
		
		
		Medicamento medicamento = new Medicamento();
		medicamento.setNome("dipirona sodica");
		medicamento.setQuantidade(10);
		medicamento.setPreço("23R$");
		
		
		System.out.println("Nome: " + medicamento.getNome());
		System.out.println("quantidade: " + medicamento.getQuantidade());
		System.out.println("Preço: " + medicamento.getPreço());
		//System.out.println("Nome: " + medicamento.getNome());
		
		
		
		
	}
}
