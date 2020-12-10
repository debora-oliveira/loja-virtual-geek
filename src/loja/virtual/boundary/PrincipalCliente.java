package loja.virtual.boundary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PrincipalCliente extends Application implements EventHandler<ActionEvent>, AssinanteComando{
	
	private Pane paneTela = new Pane();
	private BorderPane panePrincipal = new BorderPane();
	
	private ProdutoBoundary produtoTela = new ProdutoBoundary();
	private ClienteBoundary clienteTela = new ClienteBoundary();
	
	private TelaStrategy tela = (TelaStrategy) produtoTela;
	
	private MenuBar mnuPrincipal = new MenuBar();
	
	private Menu mnuProduto = new Menu("Gerenciar Produtos");
	private Menu mnuCliente = new Menu("Cliente");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scn = new Scene(panePrincipal,800,600);
		panePrincipal.setTop(mnuPrincipal);
		mnuPrincipal.getMenus().addAll(mnuProduto,mnuCliente);
		
		
		mnuProduto.setOnAction(this);
		mnuCliente.setOnAction(this);
		produtoTela.setAssinanteComando(this);
		clienteTela.setAssinanteComando(this);
		
		panePrincipal.getChildren().add(paneTela);
		
		this.telaContext();
		stage.setScene(scn);
		stage.setTitle("Loja Virtual GEEK");
		stage.show();
		
		
	}
	public static void main(String[] args) {
		Application.launch(PrincipalCliente.class,args);
	}
	@Override
	public void handle(ActionEvent e) {
		if(e.getTarget() == mnuProduto) {
			this.executarComando("Gerenciar Produtos");
		}else if(e.getTarget() == mnuCliente){
			this.executarComando("Cliente");
		}
	}

	public void telaContext() {
		panePrincipal.setCenter(tela.getTela());
	}
	
	@Override
	public void executarComando(String cmd) {
		if("Gerenciar Produtos".equals(cmd)) {
			tela = produtoTela;
		}else if("Cliente".equals(cmd)) {
			tela = clienteTela;
		}
		
		this.telaContext();
	}

}
