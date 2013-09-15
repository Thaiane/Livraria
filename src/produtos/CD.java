package produtos;

import fornecedores.Gravadora;

public class CD extends Produto
{
	private Gravadora gravadoraCD;
	
	public CD( int codigo, String nome, int ano, double preco, int quantidade )
	{
		super( codigo, nome, ano, preco, quantidade );
		
		this.gravadoraCD = null;
	}
	
	public void set_GravadoraCD( Gravadora gravadora )
	{
		this.gravadoraCD = gravadora;
	}
	
	public Gravadora get_GravadoraCD( )
	{
		return this.gravadoraCD;
	}
	
	public void adicionarGravadora (Gravadora gravadora)
	{
		this.gravadoraCD = gravadora;
	}
	
	public void exibirDados()
	{
		System.out.println("\tTítulo: " + this.nomeProduto + "\n\tFormato: CD \n\tCódigo: " + this.codigoProduto + 
				"\n\tAno de Publicação: " + this.anoProduto + "\n\tPreço: " + this.precoProduto );
		if (this.gravadoraCD != null)
		{
			System.out.println("\tGravadora: " + this.gravadoraCD);
		}
		else
		{
			System.out.println ("\tGravadora: Não informado.");
		}
		
	}
}
