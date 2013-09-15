package fornecedores;


import produtos.DVD;

public class Estudio extends Fornecedor
{
	private DVD[ ] dvdsEstudio;
	
	public Estudio( String nome, String telefone )
	{
		super( nome, telefone );
	}
	
	public void set_DvdsEstudio( DVD[ ] dvds )
	{
		this.dvdsEstudio = dvds;
	}
	
	public DVD[ ] get_DvdsEstudio( )
	{
		return this.dvdsEstudio;
	}
	
	public DVD get_DvdsEstudio( int posicao )
	{
		return this.dvdsEstudio[ posicao ];
	}
	
	public void adicionarDVD (DVD dvdNovo)
	{
		int tamanhoAntigo = this.dvdsEstudio.length;
		
		DVD[] novosDVDs = new DVD [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosDVDs[i] = this.dvdsEstudio[i];
		}
		
		novosDVDs[novosDVDs.length - 1] = dvdNovo;
		
		this.set_DvdsEstudio(novosDVDs);
	}
}
