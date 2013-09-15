package pessoas;

<<<<<<< HEAD
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

	public Produto[] get_ProdutosSelecionados() {
		return produtosSelecionados;
	}

	public void set_ProdutosSelecionados(Produto[] produtosSelecionados) {
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
	
	public void selecionarProduto(Produto produtoNovo)
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
				atendente.solicitarProduto(produtoNovo);
			}
			else
			{
				System.out.println("\tProcure um funcionário e solicite seu produto.");
				
			}
		}
	}

	public Funcionario get_Atendente() {
		return atendente;
	}

	public void cadastrarAtendente(Funcionario funcionario)
	{
		this.atendente = funcionario;
=======
import java.sql.Date;

import sistema.CarroCompras;
import sistema.Endereco;

public class Cliente extends Pessoa {
	private Date dataNascimento;
	private CarroCompras carroCompras;
	private Endereco endereco;

	public Cliente(String nomePessoa, String telefonePessoa) {
		super(nomePessoa, telefonePessoa);

	}

	public Cliente(String nomePessoa, String telefonePessoa,
			Date dataNascimento, CarroCompras carroCompras, Endereco endereco) {
		super(nomePessoa, telefonePessoa);
		this.dataNascimento = dataNascimento;
		this.carroCompras = carroCompras;
		this.endereco = endereco;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date get_DataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void set_DataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the carroCompras
	 */
	public CarroCompras get_CarroCompras() {
		return carroCompras;
	}

	/**
	 * @param carroCompras
	 *            the carroCompras to set
	 */
	public void set_CarroCompras(CarroCompras carroCompras) {
		this.carroCompras = carroCompras;
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
>>>>>>> c962edbd786bfbecc66de6f4b69e7bf83b8e7b8a
	}

	public void atualizarValorCompra()
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
