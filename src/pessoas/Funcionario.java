package pessoas;

import produtos.Produto;
import pessoas.Cliente;

public class Funcionario extends Pessoa
{
	private double salarioFuncionario;
	private int[]  cpfFuncionario = {0,0,0,0,0,0,0,0,0,0,0};
	private Cliente[] clientesCadastrados = {};
	private Produto[] produtosParaAtualizar = {};
	
	
	public Funcionario(String nome, String telefone, double salario, int[] cpf)
	{
		super (nome, telefone);
		
		this.salarioFuncionario = salario;
		this.cpfFuncionario = cpf;
		this.clientesCadastrados = null;
	}
		
	public double getSalarioFuncionario() 
	{
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) 
	{
		this.salarioFuncionario = salarioFuncionario;
	}

	public int[] getCpfFuncionario() 
	{
		return cpfFuncionario;
	}

	public void setCpfFuncionario(int[] cpfFuncionario) 
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

	public void cadastrarCliente(Cliente clienteNovo)
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

	public void solicitarProduto(Produto produto)
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

	public void efetuarCompra(Cliente cliente)
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
