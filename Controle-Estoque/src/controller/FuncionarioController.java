package controller;

import java.util.ArrayList;

import dao.FuncionarioDAO;
import model.ModelFuncionario;

public class FuncionarioController{
	
	private ModelFuncionario funcionario;
	
	public FuncionarioController(ModelFuncionario modelFuncionario) {
		this.funcionario = modelFuncionario;
	}
	
	public FuncionarioController() {
			
	}
	
	/*
	 * retorna 0 se cadastrou com sucesso
	 * retorna 1 se nome é null 
	 * retorna 2 se cpf é null 
	 * retorna 3 se cargo é null 
	 * retorna 4 se usuario é null 
	 * retorna 5 se senha é null 
	 * retorna 6 se DAO retorna falso
	 */
	
	public ArrayList<ModelFuncionario> getAllFuncionario() {
		return (new FuncionarioDAO().getAllFuncionario());
	}
	
	public ModelFuncionario getFuncionario(int id) {
		return (new FuncionarioDAO().getFuncionario(id));
	}
	
	public ArrayList<ModelFuncionario> getPesquisa(String s) {
		return (new FuncionarioDAO().getPesquisa(s));
	}
	
	public int cadastrarFuncionario(ModelFuncionario f) {
		//Precisa verificar se funcionario ja existe
		if((f.getNome() == null || f.getNome() == "")){
			return 1;
		}else if((f.getCpf() == null || f.getCpf() == "")){
			return 2;
		}else if((f.getCargo() == null || f.getCargo() == "")){
			return 3;
		}else if((f.getUsuario() == null || f.getUsuario() == "")){
			return 4;
		}else if((f.getSenha() == null || f.getSenha() == "")){
			return 5;
		}else if(new FuncionarioDAO().cadastraFuncionario(f)){
			return 0;
		}else {
			return 6;
		}
		
	}

	public int editarFuncionario(ModelFuncionario f) {
		//verificar se os dados podem ser alterados para os valores dados
		if((f.getNome() == null || f.getNome() == "")){
			return 1;
		}else if((f.getCpf() == null || f.getCpf() == "")){
			return 2;
		}else if((f.getCargo() == null || f.getCargo() == "")){
			return 3;
		}else if((f.getUsuario() == null || f.getUsuario() == "")){
			return 4;
		}else if((f.getSenha() == null || f.getSenha() == "")){
			return 5;
		}else if(new FuncionarioDAO().editaFuncionario(f)){
			return 0;
		}else {
			return 6;
		}
		
	}
	
	public int removerFuncionario(int id) {
		
		if(new FuncionarioDAO().excluiFuncionario(id)) {
			return 0;
		}

		return 1;
	}
}
