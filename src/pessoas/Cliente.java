package pessoas;


import produtos.*;

public class Cliente extends Pessoa
{
	private String dataNasciento;
	private Produto[] produtosSelecionados = {};
	private Funcionario atendente;
	private double valorCompras;
	
	public Cliente(String nome, String telefone, String data)
	{
		super (nome, telefone);
		
		this.dataNasciento = data;
		this.produtosSelecionados = null;
		this.valorCompras = 0.00;
		this.atendente = null;
		
	}
	
	public Cliente()
	{
		super ();
		
		this.dataNasciento = "00/00/00";
		this.produtosSelecionados = null;
		this.atendente = null;
	}

	public Produto[] get_ProdutosSelecionados() 
	{
		return produtosSelecionados;
	}

	public void set_ProdutosSelecionados(Produto[] produtosSelecionados) 
	{
		this.produtosSelecionados = produtosSelecionados;
	}

	public String get_DataNasciento() 
	{
		return dataNasciento;
	}
	
	public double get_ValorCompras() 
	{
		return valorCompras;
	}

	public void set_DataNasciento(String dataNasciento) 
	{
		this.dataNasciento = dataNasciento;
	}
	
	public void selecionar_Produto(Produto produtoNovo)
	{
		
		int quantidade = produtoNovo.get_QuantidadeEstoque();
		
		if (quantidade > 0)
		{	
		
			int tamanhoAntigo = this.produtosSelecionados.length;
		
			Produto[] novosProdutos = new Produto [tamanhoAntigo+1];
		
			for (int i = 0 ; i < tamanhoAntigo ; i++)
			{
				novosProdutos[i] = this.produtosSelecionados[i];
			}
		
			novosProdutos[novosProdutos.length - 1] = produtoNovo;
		
			this.set_ProdutosSelecionados(novosProdutos);
		}
		else
		{
			if(this.atendente != null)
			{
				atendente.solicitar_Produto(produtoNovo);
			}
			else
			{
				System.out.println("\tProcure um funcionário e solicite seu produto.");
				
			}
		}
	}

	public Funcionario get_Atendente() 
	{
		return atendente;
	}

	public void set_Atendente(Funcionario funcionario)
	{
		this.atendente = funcionario;
	}

	public void atualizar_ValorCompra()
	{
		double valorCompra = 0.00;
		int tamanho = produtosSelecionados.length;
		
		for (int i = 0; i < tamanho ; i++)
		{
			valorCompra = valorCompra + produtosSelecionados[i].get_PrecoProduto(); 
			
		}
		
		this.valorCompras = valorCompra;
	}
	
}
