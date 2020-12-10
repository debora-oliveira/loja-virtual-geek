package loja.virtual.boundary;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ClienteBoundary implements TelaStrategy,ProdutorComando{
	private Pane pane = new FlowPane();
	private AssinanteComando assinanteComando;
	
	private TextField txtNome = new TextField();
	private TextField txtCpf = new TextField();
	private TextField txtTelefone = new TextField();
	private TextField txtRua = new TextField();
	private TextField txtNumero =  new TextField();
	private TextField txtCep = new TextField();
	private TextField txtComplemento = new TextField();
	private TextField txtBairro = new TextField();
	private TextField txtCidade = new TextField();
	private TextField txtEstado = new TextField();
	private TextField txtEmail = new TextField();
	private TextField txtSenha = new TextField();
	
	private Button btnAdd = new Button("Salvar");
	private Button btnEditESalvar = new Button("Editar e Salvar");
	
	public void vincularCampos() {
		
	}
	
	public ClienteBoundary() {
		vincularCampos();
		GridPane paneCampos = new GridPane();
		
		paneCampos.add(new Label("Nome"), 0, 0);
		paneCampos.add(txtNome,1,0);
		paneCampos.add(new Label("CPF"), 0, 1);
		paneCampos.add(txtCpf, 1, 1);
		paneCampos.add(new Label("Telefone"), 0, 2);
		paneCampos.add(txtTelefone, 1, 2);
		paneCampos.add(new Label("Rua"), 0, 3);
		paneCampos.add(txtRua, 1, 3);
		paneCampos.add(new Label("N°"), 0, 4);
		paneCampos.add(txtNumero, 1, 4);
		paneCampos.add(new Label("CEP"), 0, 5);
		paneCampos.add(txtCep, 1, 5);
		paneCampos.add(new Label("Complemento"), 0, 6);
		paneCampos.add(txtComplemento, 1, 6);
		paneCampos.add(new Label("Bairro"), 0, 7);
		paneCampos.add(txtBairro, 1, 7);
		paneCampos.add(new Label("Cidade"), 0, 8);
		paneCampos.add(txtCidade, 1, 8);
		paneCampos.add(new Label("Estado"), 0, 9);
		paneCampos.add(txtEstado, 1, 9);
		paneCampos.add(new Label("Email"), 0, 10);
		paneCampos.add(txtEmail, 1, 10);
		paneCampos.add(new Label("Senha"), 0, 11);
		paneCampos.add(txtSenha, 1, 11);
		
		
		Button btn = new Button("Cliente");
		pane.getChildren().addAll(paneCampos);
		btn.setOnAction((e) -> {acionarComando("Cliente");});
		
	}
	
	
	@Override
	public void setAssinanteComando(AssinanteComando a) {
		this.assinanteComando = a;
	}

	@Override
	public void acionarComando(String cmd) {
		this.assinanteComando.executarComando(cmd);
	}

	@Override
	public Pane getTela() {
		return pane;
	}

}
