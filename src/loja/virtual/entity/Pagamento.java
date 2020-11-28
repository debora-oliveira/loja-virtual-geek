package loja.virtual.entity;

import java.time.LocalDate;


public class Pagamento {
	private int id;
	private LocalDate dataPagamento;
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	private double totalComDesconto;
	private String statusPagamento;
	
	
	public double getTotalComDesconto() {
		return totalComDesconto;
	}
	public void setTotalComDesconto(double totalComDesconto) {
		this.totalComDesconto = totalComDesconto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
}
