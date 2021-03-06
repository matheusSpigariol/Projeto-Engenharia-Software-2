package model;

public class ModelProduto {
	private String nome;
	private String tipoProduto;
	private int id;
	private int quantidade;
	private double preco;
	private String validade;
	private String fornecedor;

	public ModelProduto(String nome, String tipoProduto, int id, int quantidade, double preco, String validade,
			String fornecedor) {
		this.nome = nome;
		this.setTipoProduto(tipoProduto);
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
		this.fornecedor = fornecedor;
	}
	
	public ModelProduto() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
