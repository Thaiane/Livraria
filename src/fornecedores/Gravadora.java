package fornecedores;

import produtos.CD;


public class Gravadora extends Fornecedor
{
	private CD[ ] cdsGravadora;
	
	public Gravadora( String nome, String telefone )
	{
		super( nome, telefone );
	}
	
	public void set_CdsGravadora( CD[ ] cds )
	{
		this.cdsGravadora = cds;
	}
	
	public CD[ ] get_CdsGravadora( )
	{
		return this.cdsGravadora;
	}
	
	public CD get_CdsGravadora( int posicao )
	{
		return this.cdsGravadora[ posicao ];
	}
	
	public void adicionarCD (CD cdNovo)
	{
		int tamanhoAntigo = this.cdsGravadora.length;
		
		CD[] novosCDs = new CD [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosCDs[i] = this.cdsGravadora[i];
		}
		
		novosCDs[novosCDs.length - 1] = cdNovo;
		
		this.set_CdsGravadora(novosCDs);
	}
}
