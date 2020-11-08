package loja.virtual.entity;

import java.util.Date;

public class Compra {
	private double totalDaCompra;
	private Date data;
	private Date horario;
	
	public double getTotalDaCompra() {
		return totalDaCompra;
	}
	public void setTotalDaCompra(double totalDaCompra) {
		this.totalDaCompra = totalDaCompra;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
}
