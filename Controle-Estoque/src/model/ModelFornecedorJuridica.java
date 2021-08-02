package model;

public class ModelFornecedorJuridica {
	private String nomeFantasia;
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
	private String cnpj;
	private String observacao;
	private String razaoSocial;
	private String InscEst;

	public ModelFornecedorJuridica(String nomeFantasia, String categoria, String cep, String endereco, int numero, String estado,
			String cidade, String bairro, String email, String telefone, String celular, String site, String cnpj, String observacao, 
			String razaoSocial, String InscEst) {
		this.nomeFantasia = nomeFantasia;
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
		this.cnpj = cnpj;
		this.observacao = observacao;
		this.razaoSocial = razaoSocial;
		this.InscEst = InscEst;
	}
		
	public ModelFornecedorJuridica() {
			
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getInscEst() {
		return InscEst;
	}

	public void setInscEst(String inscEst) {
		InscEst = inscEst;
	}
	
}
	
	