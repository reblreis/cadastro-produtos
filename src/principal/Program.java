package principal;

import java.util.Scanner;
import entities.Produto;
import repositories.ProdutoRepository;

public class Program {

	public static void main(String[] args) {
	
		//syso + CTRL + espaço
		System.out.println("\n ***CADASTRO DE PRODUTO *** \n");
		
		Produto produto = new Produto();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o id do Produto..........: ");
		produto.setIdProduto(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Entre com o nome do produto..........: ");
		produto.setNome(scanner.nextLine());
		
		System.out.print("Entre com a descrição do produto.....: ");
		produto.setDescricao(scanner.nextLine());
		
		System.out.print("Entre com o preço do produto.........: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("Entre com a quantidade do produto....: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
		
		
		
		try {
			//criando um objeto para a classe ProdutoRepository
			ProdutoRepository produtoRepository = new ProdutoRepository();
			
			//gravando os dados do produto em arquivo
			produtoRepository.exportar(produto);
			
			//Imprimir as informações do produto...
			System.out.println("\nDADOS DO PRODUTO:");
			System.out.println("\tID DO PRODUTO.............: " + produto.getIdProduto());
			System.out.println("\tNOME DO PRODUTO...........: " + produto.getNome());
			System.out.println("\tDESCRIÇÃO DO PRODUTO......: " + produto.getDescricao());
			System.out.println("\tPREÇO DO PRODUTO..........: " + produto.getPreco());
			System.out.println("\tQUANTIDADE DO PRODUTO.....: " + produto.getQuantidade());
			
			}
			catch(Exception e) {
							
			//imprimindo...
			System.out.println("\nFALHA AO CADASTRAR PRODUTO!");
			
			//imprimir o log do erro
			e.printStackTrace();
			}
				
	}
	
}
