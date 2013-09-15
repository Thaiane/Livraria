package fornecedores;

import produtos.Produto;

public class Fornecedor
{
	private String nomeFornecedor;
	private String telefoneFornecedor;
	
	private Produto[] produtosFornecedor = {};
	
	public Fornecedor( String nome, String telefone )
	{
		this.set_NomeFornecedor( nome );
		this.set_TelefoneFornecedor( telefone );
	}
	
	public void set_NomeFornecedor( String nome )
	{
		this.nomeFornecedor = nome;
	}
	
	public void set_TelefoneFornecedor( String telefone )
	{
		this.telefoneFornecedor = telefone;
	}
	
	
	public void set_ProdutosFornecedor(Produto[] produtos)
	{
		this.produtosFornecedor = produtos;
	}
	
	public String get_NomeFornecedor( )
	{
		return this.nomeFornecedor;
	}
	
	public String get_TelefoneFornecedor( )
	{
		return this.telefoneFornecedor;
	}

	
	public Produto[] get_ProdutosFornecedor()
	{
		return this.produtosFornecedor;
	}

	public void cadastrarProdutoFornecedor(Produto produtoNovo)
	{
		int tamanhoAntigo = this.produtosFornecedor.length;
		
		Produto[] novosProdutos = new Produto [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosProdutos[i] = this.produtosFornecedor[i];
		}
		
		novosProdutos[novosProdutos.length - 1] = produtoNovo;
		
		this.set_ProdutosFornecedor(novosProdutos);
	}
}
