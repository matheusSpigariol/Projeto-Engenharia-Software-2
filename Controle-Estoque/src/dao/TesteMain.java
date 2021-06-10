package dao;

import java.util.ArrayList;

import controller.ProdutoController;
import model.ModelFuncionario;
import model.ModelProduto;

public class TesteMain {

	public static void main(String[] args) {
		
		ModelProduto p1 = new ModelProduto("Nescau","Achocolatado em po", 84647, 12, 22.65,"15/10/2030","Nestle");
		int erro1 = new ProdutoController().cadastrarProduto(p1);
	      System.out.println("Status Produto:"+ erro1);
		ModelProduto p2 = new ModelProduto("Toddy","Achocolatado em pos", 84647, 12, 0,"15/10/2030","Del Vale");
		int erro2 = new ProdutoController().cadastrarProduto(p2);
		  System.out.println("Status Produto:"+ erro2);
		ModelProduto p3 = new ModelProduto("Coca-Cola","Refrigerante", 84647, 6, 22.65,"15/10/2030","Coca Cola");
		int erro3 = new ProdutoController().cadastrarProduto(p3);
		  System.out.println("Status Produto:"+ erro3);
		
		ArrayList<ModelFuncionario> funcionarios = new FuncionarioDAO().getAllFuncionario();
		
		for (ModelFuncionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
		}
		
		ArrayList<ModelProduto> produtos = new ProdutoDAO().getAllProduto();
		
		for (ModelProduto produto : produtos) {
			System.out.println(produto.getNome());
		}
		

	}

}
