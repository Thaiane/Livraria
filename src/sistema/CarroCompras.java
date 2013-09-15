package sistema;
import produtos.Produto;
import pessoas.Cliente;
public class CarroCompras {
	private double valorTotal;
	private Produto[] produtosComprados;
	private Cliente cliente;

	public CarroCompras(double valorTotal, Produto[] produtoComprados,
			Cliente cliente) {

		this.valorTotal = valorTotal;
		this.produtosComprados = produtoComprados;
		this.cliente = cliente;
	}

	/**
	 * @return the valorTotal
	 */
	public double get_ValorTotal()
	{
		return valorTotal;
	}

	/**
	 * @param valorTotal
	 *            the valorTotal to set
	 */
	public void set_ValorTotal(double valorTotal) 
	{
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the produtoComprados
	 */
	public Produto[] get_ProdutosComprados() 
	{
		return produtosComprados;
	}

	/**
	 * @param produtoComprados
	 *            the produtoComprados to set
	 */
	public void set_ProdutosComprados(Produto[] produtosComprados)
	{
		this.produtosComprados = produtosComprados;
	}
	
	public Produto get_ProdutoComprado(int posicao)
	{
		return produtosComprados[posicao];
	}

}
