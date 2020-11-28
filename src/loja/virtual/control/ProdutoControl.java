package loja.virtual.control;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import loja.virtual.db.ConnectionJDBC;
import loja.virtual.entity.Produto;

public class ProdutoControl {

	private ObservableList<Produto> lista = FXCollections.observableArrayList();
	
	private IntegerProperty idProperty = new SimpleIntegerProperty();
	private StringProperty nomeProperty = new SimpleStringProperty();
	private StringProperty marcaProperty = new SimpleStringProperty();
	private IntegerProperty quantidadeProperty = new SimpleIntegerProperty();
	private DoubleProperty precoProperty = new SimpleDoubleProperty();
	
	public Produto getProduto() {
		Produto p = new Produto();
		p.setId(idProperty.get());
		p.setNome(nomeProperty.get());
		p.setMarca(marcaProperty.get());
		p.setQuantidade(quantidadeProperty.get());
		p.setPreco(precoProperty.get());
		return p;
	}
	
	public void setProduto(Produto p) {
		if(p != null) {
			idProperty.set(p.getId());
			nomeProperty.set(p.getNome());
			marcaProperty.set(p.getMarca());
			quantidadeProperty.set(p.getQuantidade());
			precoProperty.set(p.getPreco());
		}
	}
	//classe incompleta
	public void adicionar() {
		getLista().add(getProduto());
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public ObservableList<Produto> getLista() {
		return lista;
	}
	public IntegerProperty getIdProperty() {
		return idProperty;
	}
	public StringProperty getNomeProperty() {
		return nomeProperty;
	}
	public StringProperty getMarcaProperty() {
		return marcaProperty;
	}
	public IntegerProperty getQuantidadeProperty() {
		return quantidadeProperty;
	}
	public DoubleProperty getPrecoProperty() {
		return precoProperty;
	}
	
}
