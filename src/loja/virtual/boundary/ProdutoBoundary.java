package loja.virtual.boundary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProdutoBoundary extends Application implements EventHandler<ActionEvent>{

	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtMarca = new TextField();
	private TextField txtQuantidade = new TextField();
	private TextField txtPreco = new TextField();
	private Button btnAdd = new Button("Adicionar");
	private Button btnPesq = new Button("Pesquisar");
	private Button btnEditESalvar = new Button("Editar e Salvar");
	private Button btnRemove = new Button("Remover");
	
	
	public void vincularCampos() {
		
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		vincularCampos();
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp,700,300);
		GridPane paneCampos = new GridPane();
		
		paneCampos.add(new Label("Id"),0,0);
		paneCampos.add(txtId,1,0);
		paneCampos.add(new Label("Nome"),0,1);
		paneCampos.add(txtNome,1,1);
		paneCampos.add(new Label("Marca"),0,2);
		paneCampos.add(txtMarca,1,2);
		paneCampos.add(new Label("Quantidade"),0,3);
		paneCampos.add(txtQuantidade,1,3);
		paneCampos.add(new Label("Preço"),0,4);
		paneCampos.add(txtPreco,1,4);
		
		btnAdd.setOnAction(this);
		btnPesq.setOnAction(this);
		btnEditESalvar.setOnAction(this);
		btnRemove.setOnAction(this);
		
		bp.setTop(paneCampos);
		//bp.setCenter(table);
		
		stage.setScene(scn);
		stage.setTitle("Gerenciar Produtos");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(ProdutoBoundary.class, args);
	}


	@Override
	public void handle(ActionEvent e) {
		
	}

}
