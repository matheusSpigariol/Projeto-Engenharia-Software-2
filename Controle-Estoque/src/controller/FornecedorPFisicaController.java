package controller;

import dao.FornecedorPFisicaDAO;
import model.ModelFornecedorPFisica;

public class FornecedorPFisicaController{
	
	private ModelFornecedorPFisica fornecedorPFisica;
	
	public FornecedorPFisicaController(ModelFornecedorPFisica modelFornecedorPFisica) {
		this.fornecedorPFisica = modelFornecedorPFisica;
	}
	
	public FornecedorPFisicaController() {
			
	}
	
	/*				
	 * retorna 0 se cadastrou com sucesso
	 * retorna 1 se nome é null 
	 * retorna 2 se categoria é null 
	 * retorna 3 se cep é null 
	 * retorna 4 se endereco é null 
	 * retorna 5 se numero é null
	 * retorna 6 se estado é null 
	 * retorna 7 se cidade é null 
	 * retorna 8 se email é null 
	 * retorna 9 se telefone é null 
	 * retorna 10 se celular é null
	 * retorna 11 se site é null 
	 * retorna 12 se cpf é null 
	 * retorna 13 se observacao é null 
	 * retorna 16 se DAO retorna falso
	 */
	
	public int cadastraFornecedorPFisica(ModelFornecedorPFisica f) {
		//Precisa verificar se funcionario ja existe
		if((f.getNome() == null || f.getNome() == "")){
			return 1;
		}else if((f.getCategoria() == null || f.getCategoria() == "")){
			return 2;
		}else if((f.getCep() == null || f.getCep() == "")){
			return 3;
		}else if((f.getEndereco() == null || f.getEndereco() == "")){
			return 4;
		}else if((f.getNumero() < 0)){
			return 5;
		}else if((f.getEstado() == null || f.getEstado() == "")){
			return 6;
		}else if((f.getCidade() == null || f.getCidade() == "")){
			return 7;
		}else if((f.getEmail() == null || f.getEmail() == "")){
			return 8;
		}else if((f.getTelefone() == null || f.getTelefone() == "")){
			return 9;
		}else if((f.getCelular() == null || f.getCelular() == "")){
			return 10;
		}else if((f.getSite() == null || f.getSite() == "")){
			return 11;
		}else if((f.getCpf() == null || f.getCpf() == "")){
			return 12;
		}else if((f.getObservacao() == null || f.getObservacao() == "")){
			return 13;
		}else if((f.getId() < 0)){
			return 14;
		}else if(new FornecedorPFisicaDAO().cadastraFornecedorPFisica(f)){
			return 0;
		}else {
			return 15;
		}
	}
}
