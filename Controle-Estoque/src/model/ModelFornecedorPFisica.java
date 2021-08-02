package model;

public class ModelFornecedorPFisica {
	private String nome;
	private String categoria;
	private String cep;
	private String endereco;
	private int numero;
	private String estado;
	private String cidade;
	private String bairro;
	private String email;
	private String telefone;
	private String celular;
	private String site;
	private String cpf;
	private String observacao;

	public ModelFornecedorPFisica(String nome, String categoria, String cep, String endereco, int numero, String estado,
			String cidade, String bairro, String email, String telefone, String celular, String site, String cpf, String observacao) {
		this.nome = nome;
		this.categoria = categoria;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.estado = estado;
		this.cidade = cidade;		
		this.bairro = bairro;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.site = site;
		this.cpf = cpf;
		this.observacao = observacao;
	}
		
	public ModelFornecedorPFisica() {
			
	}
	
	public String getNome() {
			return nome;
	}
	
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public String getCategoria() {
			return categoria;
	}
	
	public void setCategoria(String categoria) {
			this.categoria = categoria;
	}
	
	public String getCep() {
			return cep;
	}
	
	public void setCep(String cep) {
			this.cep = cep;
		}
	
	public String getEndereco() {
			return endereco;
	}
	
	public void setEndereco(String endereco) {
			this.endereco = endereco;
	}
	
	public int getNumero() {
			return numero;
	}
	
	public void setNumero(int numero) {
			this.numero = numero;
	}
	
	public String getEstado() {
			return estado;
	}
	
	public void setEstado(String estado) {
			this.estado = estado;
	}
	
	public String getCidade() {
			return cidade;
	}
	
	public void setCidade(String cidade) {
			this.cidade = cidade;
	}
	
	public String getBairro() {
			return bairro;
	}
	
	public void setBairro(String bairro) {
			this.bairro = bairro;
	}
	
	public String getEmail() {
			return email;
	}
	
	public void setEmail(String email) {
			this.email = email;
	}
	
	public String getTelefone() {
			return telefone;
	}
	
	public void setTelefone(String telefone) {
			this.telefone = telefone;
	}
	
	public String getCelular() {
			return celular;
	}
	
	public void setCelular(String celular) {
			this.celular = celular;
	}
	
	public String getSite() {
			return site;
	}
	
	public void setSite(String site) {
			this.site = site;
	}
	
	public String getCpf() {
			return cpf;
	}
	
	public void setCpf(String cpf) {
			this.cpf = cpf;
	}
	
	public String getObservacao() {
			return observacao;
	}
	
	public void setObservacao(String observacao) {
			this.observacao = observacao;
	}
}


