package produtos;

import fornecedores.Estudio;

public class DVD extends Produto
{
	private Estudio estudioDVD;
	
	public DVD( int codigo, String nome, int ano, double preco, int quantidade )
	{
		super( codigo, nome, ano, preco, quantidade );
		this.estudioDVD = null;
	}
	
	public void set_EstudioDVD( Estudio estudio )
	{
		this.estudioDVD = estudio;
	}
	
	public Estudio get_EstudioDVD( )
	{
		return this.estudioDVD;
	}
	
	public void exibirDados()
	{
		System.out.println("\tTítulo: " + this.nomeProduto + "\n\tFormato: DVD \n\tCódigo: " + this.codigoProduto + 
				"\n\tAno de Lançamento: " + this.anoProduto + "\n\tPreço: " + this.precoProduto );
		if (this.estudioDVD != null)
		{
			System.out.println("\tEstúdio: " + this.estudioDVD);
		}
		else
		{
			System.out.println ("\tEstúdo: Não informado.");
		}
		
	}
}
