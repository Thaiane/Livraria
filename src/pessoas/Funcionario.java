package pessoas;

import produtos.Produto;
import pessoas.Cliente;

public class Funcionario extends Pessoa
{
	private double salarioFuncionario;
	private long   cpfFuncionario;
	private Cliente[] clientesCadastrados = {};
	private Produto[] produtosParaAtualizar = {};
	
	
	public Funcionario(String nome, String telefone, double salario, long cpf)
	{
		super (nome, telefone);
		
		this.salarioFuncionario = salario;
		this.cpfFuncionario = cpf;
		this.clientesCadastrados = null;
	}
		
	public double get_SalarioFuncionario() 
	{
		return salarioFuncionario;
	}

	public void set_SalarioFuncionario(double salarioFuncionario) 
	{
		this.salarioFuncionario = salarioFuncionario;
	}

	public long get_CpfFuncionario() 
	{
		return cpfFuncionario;
	}

	public void set_CpfFuncionario(long cpfFuncionario) 
	{
		this.cpfFuncionario = cpfFuncionario;
	}
	
	public Produto[] get_ProdutosParaAtualizar() 
	{
		return produtosParaAtualizar;
	}

	public void set_ProdutosParaAtualizar(Produto[] produtosParaAtualizar) 
	{
		this.produtosParaAtualizar = produtosParaAtualizar;
	}

	public Cliente[] get_ClientesCadastrados() 
	{
		return clientesCadastrados;
	}
	
	public void set_ClientesCadastrados(Cliente[] clientesCadastrados) 
	{
		this.clientesCadastrados = clientesCadastrados;
	}

	public void cadastrar_Cliente(Cliente clienteNovo)
	{
		int tamanhoAntigo = this.clientesCadastrados.length;
		
		Cliente[] novosClientes = new Cliente [tamanhoAntigo+1];
		
		for (int i = 0 ; i < tamanhoAntigo ; i++)
		{
			novosClientes[i] = this.clientesCadastrados[i];
		}
		
		novosClientes[novosClientes.length - 1] = clienteNovo;
		
		this.set_ClientesCadastrados(novosClientes);
	}

	public void solicitar_Produto(Produto produto)
	{
		if(produto.get_FornecedorProduto() != null)
		{
			System.out.println("\tOlá! \n\t Seu produto foi solicitado ao fornecedor "
			+ produto.get_FornecedorProduto() + " e chegará em breve na loja.");
		}
		else
		{
			System.out.println("\tOlá.\n\tInfelizmente não temos fornecedor cadastrado para o" +
					" produto solicitado. Iremos procurar um e solicitar seu produto em breve.");
		}
		
	}

	public void efetuar_Compra(Cliente cliente)
	{
		if(cliente.get_ProdutosSelecionados() != null)
		{
			this.produtosParaAtualizar = cliente.get_ProdutosSelecionados();
			for (int i = 0; i < produtosParaAtualizar.length ; i++)
			{
				int quantidadeAnterior = 0;
				quantidadeAnterior = produtosParaAtualizar[i].get_QuantidadeEstoque();
				
				produtosParaAtualizar[i].set_QuantidadeEstoque(quantidadeAnterior);
			}
		}
	}
			
}
