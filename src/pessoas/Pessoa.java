package pessoas;

<<<<<<< HEAD
public class Pessoa
{
	protected String nomePessoa;
	protected String telefonePessoa;
	
	public Pessoa()
	{
		this.nomePessoa = "sem nome";
		this.telefonePessoa = "sem telefone";
	}
	
	public Pessoa(String nome, String telefone)
	{
		this.nomePessoa = nome;
		this.telefonePessoa = telefone;
	}
	
	public String getNomePessoa() 
	{
		return nomePessoa;
	}
=======
public class Pessoa {
	protected String nomePessoa;
	protected String telefonePessoa;

	public Pessoa(String nomePessoa, String telefonePessoa) {

		this.nomePessoa = nomePessoa;
		this.telefonePessoa = telefonePessoa;
	}

	/**
	 * @return the nomePessoa
	 */
	public String get_NomePessoa() {
		return nomePessoa;
	}

	/**
	 * @param nomePessoa
	 *            the nomePessoa to set
	 */
	public void set_NomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	/**
	 * @return the telefonePessoa
	 */
	public String get_TelefonePessoa() {
		return telefonePessoa;
	}

	/**
	 * @param telefonePessoa
	 *            the telefonePessoa to set
	 */
	public void set_TelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}
>>>>>>> c962edbd786bfbecc66de6f4b69e7bf83b8e7b8a

	public void setNomePessoa(String nomePessoa) 
	{
		this.nomePessoa = nomePessoa;
	}

	public String getTelefonePessoa() 
	{
		return telefonePessoa;
	}

	public void setTelefonePessoa(String telefonePessoa) 
	{
		this.telefonePessoa = telefonePessoa;
	}
	
	
	
}
