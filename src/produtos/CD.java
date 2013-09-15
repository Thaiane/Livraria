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
		System.out.println("\tT�tulo: " + this.nomeProduto + "\n\tFormato: CD \n\tC�digo: " + this.codigoProduto + 
				"\n\tAno de Publica��o: " + this.anoProduto + "\n\tPre�o: " + this.precoProduto );
		if (this.gravadoraCD != null)
		{
			System.out.println("\tGravadora: " + this.gravadoraCD);
		}
		else
		{
			System.out.println ("\tGravadora: N�o informado.");
		}
		
	}
}
