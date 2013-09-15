package pessoas;

import produtos.Produto;


public class Autor extends Pessoa
{
	
	private Produto[] produtosAutor = {};
	
	
	public Autor (String nome)
	{
		super(nome, "0000-0000");		
	
	}


	public Produto[] get_ProdutosAutor() 
	{
		return this.produtosAutor;
	}


	public void set_ProdutosAutor(Produto[] produtos) 
	{
		this.produtosAutor = produtos;
	}
	
	public void cadastrarProdutoAutor( Produto produtoNovo)
	{
		int tamanhoAntigo = this.produtosAutor.length;
		
		Produto[] novosProdutos = new Produto [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosProdutos[i] = this.produtosAutor[i];
		}
		
		novosProdutos[novosProdutos.length - 1] = produtoNovo;
		
		this.set_ProdutosAutor(novosProdutos);
	}

}
