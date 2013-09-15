package sistema;

import interfaces.Exibivel;
import produtos.*;

public class Consulta implements Exibivel
{
	private Produto[] listaLivro = {};
	private Produto[] listaCDS = {};
	private Produto[] listaDVDs = {};
	private Produto[] listaProduto = {};

	public Consulta( ) // usar padrão singleton
	{

	}
	
	public Produto[] get_ListaProduto( ) 
	{
		return this.listaProduto;
	}

	public void set_ListaProduto( Produto[] listaProduto )
	{
		
		this.listaProduto = listaProduto;
	}
	
	public Produto[] get_ListaLivro( ) 
	{
		return listaLivro;
	}

	public void set_ListaLivro( Produto[] listaLivro ) 
	{
		this.listaLivro = listaLivro;
	}


	public Produto[] get_ListaCDS( ) 
	{
		return listaCDS;
	}


	public void set_ListaCDS( Produto[] listaCDS ) 
	{
		this.listaCDS = listaCDS;
	}


	public Produto[] get_ListaDVDs( ) 
	{
		return listaDVDs;
	}


	public void set_ListaDVDs( Produto[] listaDVDs )
	{
		this.listaDVDs = listaDVDs;
	}
	
	public void cadastrarListaLivro( Livro livroNovo )
	{
		int tamanhoAntigo = this.listaLivro.length;
		
		Produto[] novosLivros = new Produto [ tamanhoAntigo + 1 ];
		
		for ( int i = 0; i < tamanhoAntigo; i++ )
		{
			novosLivros[ i ] = this.listaLivro[ i ];
		}
		
		novosLivros[ novosLivros.length - 1 ] = livroNovo;
		
		this.set_ListaLivro( novosLivros );
		
	}

	public void cadastrarListaCD( CD CDNovo )
	{
		int tamanhoAntigo = this.listaCDS.length;
		
		Produto[] novosCDS = new Produto [ tamanhoAntigo + 1 ];
		
		for ( int i = 0; i < tamanhoAntigo; i++ )
		{
			novosCDS[ i ] = this.listaCDS[ i ];
		}
		
		novosCDS[ novosCDS.length - 1 ] = CDNovo;
		
		this.set_ListaCDS( novosCDS );
		
	}
	
	public void cadastrarListaDVD( Livro DVDNovo )
	{
		int tamanhoAntigo = this.listaDVDs.length;
		
		Produto[] novosDVDs = new Produto [ tamanhoAntigo + 1 ];
		
		for ( int i = 0; i < tamanhoAntigo; i++ )
		{
			novosDVDs[ i ] = this.listaDVDs[ i ];
		}
		
		novosDVDs[ novosDVDs.length - 1 ] = DVDNovo;
		
		this.set_ListaDVDs( novosDVDs );
	}
	
	public void cadastrarListaProduto( Produto produtoNovo )
	{
		int tamanhoAntigo = this.listaProduto.length;
		
		Produto[] novosProdutos = new Produto [ tamanhoAntigo + 1 ];
		
		for (int i = 0; i < tamanhoAntigo; i++)
		{
			novosProdutos[ i ] = this.listaProduto[ i ];
		}
		
		novosProdutos[ novosProdutos.length - 1 ] = produtoNovo;
		
		this.set_ListaProduto( novosProdutos );
		
		
		/*if (produtoNovo instanceof Livro)
		{
			this.cadastrarListaLivro(produtoNovo);
		}
		else if (produtoNovo instanceof CD)
		{
			this.cadastrarListaCD(produtoNovo);
		}
		else if (produtoNovo instanceof DVD)
		{
			this.cadastrarListaDVD(produtoNovo);
		}*/
		
	}

	public void exibirListaLivro( )
	{
		if ( listaLivro.length == 0 )
		{
			System.out.println( "Não há livros cadastrados atualmente." );
		}
		for ( int i = 0; i < listaLivro.length; i++ )
		{
			System.out.println( "Livro [" + ( i + 1 ) + "]: " );
			listaLivro[ i ].exibirDados();
			
		}
	}
	
	public void exibirListaDVD( )
	{
		if ( listaDVDs.length == 0 )
		{
			System.out.println( "Não há DVDs cadastrados atualmente." );
		}
		for ( int i = 0 ;i < listaDVDs.length; i++ )
		{
			System.out.println( "DVD [" + ( i + 1 ) + "]: " );
			listaDVDs[ i ].exibirDados();
			
		}		
	}
	
	public void exibirListaCD( )
	{
		if ( listaCDS.length == 0 )
		{
			System.out.println( "Não há CDs cadastrados atualmente." );
		}
		for ( int i = 0; i < listaCDS.length; i++ )
		{
			System.out.println( "CD [" + ( i + 1 ) + "]: " );
			listaCDS[ i ].exibirDados();
			
		}
	}
	
	public void exibirListaProduto()
	{
		if ( listaProduto.length == 0 )
		{
			System.out.println( "Não há produtos cadastrados atualmente." );
		}
		for ( int i = 0; i < listaProduto.length; i++ )
		{
			System.out.println( "Produto [" + ( i + 1 ) + "]: " );
			listaProduto[ i ].exibirDados();
			
		}
	}
}
