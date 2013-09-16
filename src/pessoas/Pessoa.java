package pessoas;


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
	
	public String get_NomePessoa() 
	{
		return nomePessoa;
	}

	public void set_NomePessoa(String nomePessoa) 
	{
		this.nomePessoa = nomePessoa;
	}

	public String get_TelefonePessoa() 
	{
		return telefonePessoa;
	}

	public void set_TelefonePessoa(String telefonePessoa) 
	{
		this.telefonePessoa = telefonePessoa;
	}
	
	
	
}
