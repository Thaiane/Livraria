package produtos;

public class Genero
{
	private String nomeGenero;
	
	private Produto[ ] produtosGenero;
	
	public Genero( String nome )
	{
		this.set_NomeGenero( nome );
	}
	
	public void set_NomeGenero( String nome )
	{
		this.nomeGenero = nome;
	}
	
	public String get_NomeGenero( )
	{
		return this.nomeGenero;
	}
	
	public void set_ProdutosGenero( Produto[ ] produtos )
	{
		this.produtosGenero = produtos;
	}
	
	public void set_ProdutoGenero( Produto produto, int posicao )
	{
		this.produtosGenero[ posicao ] = produto;
	}
	
	public Produto[ ] get_ProdutosGenero( )
	{
		return this.produtosGenero;
	}
	
	public Produto get_ProdutoGenero( int posicao )
	{
		return this.produtosGenero[ posicao ];
	}
	
	public void cadastrarProdutoGenero (Produto produtoNovo)
	{
		int tamanhoAntigo = this.produtosGenero.length;
		
		Produto[] novosProdutos = new Produto [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosProdutos[i] = this.produtosGenero[i];
		}
		
		novosProdutos[novosProdutos.length - 1] = produtoNovo;
		
		this.set_ProdutosGenero(novosProdutos);
	}
	
	
}
