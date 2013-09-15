package produtos;

import pessoas.Autor;
import fornecedores.Fornecedor;

public abstract class Produto // Provavelmente será abstrata ( Testar primeiro)
{
	protected int codigoProduto; // nao existe " unsigned em Java. Dar uma olhada nisso
	protected String nomeProduto;
	protected int anoProduto;
	protected double precoProduto;
	protected int quantidadeEstoque;
	
	protected Autor autorProduto;
	protected Genero generoProduto;
	protected Fornecedor fornecedorProduto;
	
	public Produto( int codigo, String nome, int ano, double preco, int quantidade )
	{
		this.set_CodigoProduto( codigo );
		this.set_NomeProduto( nome );
		this.set_AnoProduto( ano );
		this.set_PrecoProduto( preco );
		this.set_QuantidadeEstoque (quantidade);
	}
	
	
	public int get_QuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void set_QuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public void set_CodigoProduto( int codigo )
	{
		this.codigoProduto = codigo;
	}
	
	public void set_NomeProduto( String nome )
	{
		this.nomeProduto = nome;
	}
	
	public void set_AnoProduto( int ano )
	{
		this.anoProduto = ano;
	}
	
	public void set_PrecoProduto( double preco )
	{
		this.precoProduto = preco;
	}
	
	public void set_AutorProduto( Autor autor )
	{
		this.autorProduto = autor;
	}
	
	public int get_CodigoProduto( )
	{
		return this.codigoProduto;
	}
	
	public String get_nomeProduto( )
	{
		return this.nomeProduto;
	}
	
	public int get_AnoProduto( )
	{
		return this.anoProduto;
	}
	
	public double get_PrecoProduto( )
	{
		return this.precoProduto;
	}
	
	public Autor get_AutorProduto( )
	{
		return this.autorProduto;
	}
	
	public Genero get_GeneroProduto( )
	{
		return this.generoProduto;
	}
	
	public Fornecedor get_FornecedorProduto()

	{
		return this.fornecedorProduto;
	}
	
	public void cadastrarFornecedor (Fornecedor fornecedor)
	{
		this.fornecedorProduto = fornecedor;
	}
	
	public void cadastrarGenero (Genero genero)
	{
		this.generoProduto = genero;
	}
	
	public abstract void exibirDados();
	
}
