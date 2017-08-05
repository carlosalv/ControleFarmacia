package br.com.farmacia;

import java.awt.List;
import java.sql.Date;

public class Compra {
	
	private  int Id;
	private List medicamentos;
	private int quantidade;
	private Date data;
	private Double valorTotal;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public List getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(List medicamentos) {
		this.medicamentos = medicamentos;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	

}
