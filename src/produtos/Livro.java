package produtos;

import fornecedores.Editora;

public class Livro extends Produto
{
	private Editora editoraLivro;
	
	public Livro( int codigo, String nome, int ano, double preco, int quantidade )
	{
		super( codigo, nome, ano, preco, quantidade );
		this.editoraLivro = null;
	}
	
	public void set_EditoraProduto( Editora editora )
	{
		this.editoraLivro = editora;
	}
	
	public Editora get_EditoraProduto( )
	{
		return this.editoraLivro;
	}
	
	public void exibirDados()
	{
		System.out.println("\tTítulo: " + this.nomeProduto + "\n\tFormato: Livro \n\tCódigo: " + this.codigoProduto + 
				"\n\tAno de Publicação: " + this.anoProduto + "\n\tPreço: " + this.precoProduto );
		if (this.editoraLivro != null)
		{
			System.out.println("\tEditora: " + this.editoraLivro);
		}
		else
		{
			System.out.println ("\tEditora: Não informado.");
		}
		
	}
}
