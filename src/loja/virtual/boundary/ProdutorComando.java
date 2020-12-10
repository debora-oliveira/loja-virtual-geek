package loja.virtual.boundary;

public interface ProdutorComando {
	void setAssinanteComando(AssinanteComando a);
	void acionarComando(String cmd);
}
