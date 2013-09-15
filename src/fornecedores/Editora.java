package fornecedores;

import produtos.Livro;

public class Editora extends Fornecedor
{
	private Livro[ ] livrosEditora;
	
	public Editora( String nome, String telefone )
	{
		super( nome, telefone );
	}
	
	public void set_LivrosEditora( Livro[ ] livros )
	{
		this.livrosEditora = livros;
	}
	
	public Livro[ ] get_LivrosEditora( )
	{
		return this.livrosEditora;
	}
	
	public Livro get_LivroEditora( int posicao )
	{
		return this.livrosEditora[ posicao ];
	}
	
	public void cadastrarLivro(Livro livro)
	{
		int tamanhoAntigo = this.livrosEditora.length;
		
		Livro[] novosLivrosEditora = new Livro [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosLivrosEditora[i] = this.livrosEditora[i];
		}
		
		novosLivrosEditora[novosLivrosEditora.length - 1] = livro;
		
		this.set_LivrosEditora(novosLivrosEditora);
	}
	
}
