package repositories;

import java.io.PrintWriter;
import entities.Produto;

public class ProdutoRepository {
	
	// método para gravar os dados de um produto em arquivo
	public void exportar(Produto produto) throws Exception {
		
		// criando um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter("c:\\clientes\\produto.txt");
	
		// escrever o conteúdo do arquivo
		printWriter.write("\nDADOS DO PRODUTO:");
		
		printWriter.write ("\nID DO PRODUTO............: " + produto.getIdProduto());
		printWriter.write ("\nNOME DO PRODUTO..........: " + produto.getNome());
		printWriter.write ("\nDESCRIÇÃO DO PRODUTO.....: " + produto.getDescricao());
		printWriter.write ("\nPREÇO DO PRODUTO.........: " + produto.getPreco());
		printWriter.write ("\nQUANTIDADE DO PRODUTO....: " + produto.getQuantidade());
		
		// salvar o arquivo
		printWriter.flush();
		
		// fechar o arquivo
		printWriter.close();
				
	}

}
