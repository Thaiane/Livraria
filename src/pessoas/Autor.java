package pessoas;

import produtos.Produto;

<<<<<<< HEAD
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

=======
public class Autor extends Pessoa {
	private Produto[] produtos;

	public Autor(String nomePessoa, String telefonePessoa, Produto[] produtos) {
		super(nomePessoa, telefonePessoa);
		this.produtos = produtos;
	}

	/**
	 * @return the produtos
	 */
	public Produto[] get_Produtos() {
		return produtos;
	}

	/**
	 * @param produtos
	 *            the produtos to set
	 */
	public void set_Produtos(Produto[] produtos) {
		this.produtos = produtos;
	}
>>>>>>> c962edbd786bfbecc66de6f4b69e7bf83b8e7b8a

}
