package loja.virtual.entity;

import java.time.LocalDate;

public class Compra {
	private int id;
	private double totalDaCompra;
	private LocalDate dataCompra;
	private LocalDate horario;
	
	public double getTotalDaCompra() {
		return totalDaCompra;
	}
	public void setTotalDaCompra(double totalDaCompra) {
		this.totalDaCompra = totalDaCompra;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	public LocalDate getHorario() {
		return horario;
	}
	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}
		
}
