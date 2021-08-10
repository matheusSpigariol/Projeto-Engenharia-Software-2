package controller;

import dao.FornecedorJuridicaDAO;
import model.ModelFornecedorJuridica;

public class FornecedorJuridicaController{
	
	private ModelFornecedorJuridica fornecedorJuridica;
	
	public FornecedorJuridicaController(ModelFornecedorJuridica modelFornecedorJuridica) {
		this.fornecedorJuridica = modelFornecedorJuridica;
	}
	
	public FornecedorJuridicaController() {
			
	}
	
	/*				
	 * retorna 0 se cadastrou com sucesso
	 * retorna 1 se nomeFantasia � null 
	 * retorna 2 se categoria � null 
	 * retorna 3 se cep � null 
	 * retorna 4 se endereco � null 
	 * retorna 5 se numero � null
	 * retorna 6 se estado � null 
	 * retorna 7 se cidade � null 
	 * retorna 8 se email � null 
	 * retorna 9 se telefone � null 
	 * retorna 10 se celular � null
	 * retorna 11 se site � null 
	 * retorna 12 se cnpj � null 
	 * retorna 13 se observacao � null 
	 * retorna 14 se razaoSocial � null 
	 * retorna 15 se inscEst � null 
	 * retorna 17 se DAO retorna falso
	 */
	
	public int cadastrarFornecedorJuridica(ModelFornecedorJuridica f) {
		//Precisa verificar se funcionario ja existe
		if((f.getNomeFantasia() == null || f.getNomeFantasia() == "")){
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
		}else if((f.getCnpj() == null || f.getCnpj() == "")){
			return 12;
		}else if((f.getObservacao() == null || f.getObservacao() == "")){
			return 13;
		}else if((f.getRazaoSocial() == null || f.getRazaoSocial() == "")){
			return 14;
		}else if((f.getInscEst() == null || f.getInscEst() == "")){
			return 15;
		}else if((f.getId() < 0)){
			return 16;
		}else if(new FornecedorJuridicaDAO().cadastraFornecedorJuridica(f)){
			return 0;
		}else {
			return 17;
		}
	}
}
