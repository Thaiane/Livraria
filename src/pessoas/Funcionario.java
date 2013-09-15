package pessoas;

<<<<<<< HEAD
import java.util.Scanner;

import produtos.Produto;

public class Funcionario extends Pessoa
{
	private double salarioFuncionario;
	private int[]  cpfFuncionario = {0,0,0,0,0,0,0,0,0,0,0};
	private Cliente[] clientesCadastrados = {};
	
	
	Scanner leitor = new Scanner(System.in);
	
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
		
	}

	
	

		
=======
import sistema.Endereco;

public class Funcionario extends Pessoa {
	private double salarioFuncionario;
	private Endereco endereco;

	public Funcionario(String nomePessoa, String telefonePessoa,
			double salarioFuncionario, Endereco endereco) {
		super(nomePessoa, telefonePessoa);
		this.salarioFuncionario = salarioFuncionario;
		this.endereco = endereco;
	}

	/**
	 * @return the salarioFuncionario
	 */
	public double get_SalarioFuncionario() {
		return salarioFuncionario;
	}

	/**
	 * @param salarioFuncionario
	 *            the salarioFuncionario to set
	 */
	public void set_SalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	/**
	 * @return the endereco
	 */
	public Endereco get_Endereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void set_Endereco(Endereco endereco) {
		this.endereco = endereco;
	}
>>>>>>> c962edbd786bfbecc66de6f4b69e7bf83b8e7b8a

		
		
		
		
	
}
