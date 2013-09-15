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
	
	public String getNomePessoa() 
	{
		return nomePessoa;
	}

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
