package model;

public class ModelFuncionario {
	private String nome;
	private String cpf;
	private int id;
	private String cargo;
	private String telefone;
	private String usuario;
	private String senha;

	public ModelFuncionario(String nome, String cpf, int id, String cargo, String telefone, String usuario,
			String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.cargo = cargo;
		this.telefone = telefone;
		this.usuario = usuario;
		this.senha = senha;

	}
	
	public ModelFuncionario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
