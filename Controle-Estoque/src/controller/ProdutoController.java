package controller;

import dao.ProdutoDAO;
import model.ModelProduto;

public class ProdutoController {
	
	/*
	 * retorna 0 se cadastrou com sucesso
	 * retorna 1 se nome é null 
	 * retorna 2 se descricao é null 
	 * retorna 3 se quantidade for menor que 0
	 * retorna 4 se preco for menor ou igual a 0
	 * retorna 5 se validade é null
	 * retorna 6 se fornecedor é null
	 * retorna 7 se DAO retorna falso
	 */
	public int cadastrarProduto(ModelProduto p) {
		//Precisa verificar se produto ja existe
		if((p.getNome() == null || p.getNome() == "")){
			return 1;
		}else if((p.getDescricao() == null || p.getDescricao() == "")){
			return 2;
		}else if((p.getQuantidade() < 0 )){
			return 3;
		}else if((p.getPreco() <= 0)){
			return 4;
		}else if((p.getValidade() == null || p.getValidade() == "")){
			return 5;
		}else if((p.getFornecedor() == null || p.getFornecedor() == "")){
			return 6;
		}else if(new ProdutoDAO().CadastraProduto(p)){
			return 0;
		}else {
			return 7;
		}
		
	}

}
