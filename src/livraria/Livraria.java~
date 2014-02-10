package livraria;

import java.util.Scanner;
import pessoas.Cliente;
import pessoas.Funcionario;

public class Livraria
{
	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );
		
		Cliente     cliente     = new Cliente( "Alberto", "3356-9287", "17/ 12/ 1990" );
		Funcionario funcionario = new Funcionario( "Andressa", "3434-6642" );
		
		int opcaoMenuPrincipal = 0;
		
		do
		{	
			System.out.println( "\n\t\tLIVRARIA\n" );
			
			System.out.println( "\nMenu Principal" );
			
			System.out.print( "\n[ 1 ] Compras"      		+
									"\n[ 2 ] Cadastros"    	   +
									"\n[ 3 ] Consultas"		   +
									"\n[ 4 ] Solicitações"     +
									"\n[ 5 ] Sair do Programa" +
									"\n\nOpção selecionada: " );
			opcaoMenuPrincipal = entrada.nextInt( );
	
			int opcaoMenuCompras      = 0;
			int opcaoMenuCadastro     = 0;
			int opcaoMenuConsultas    = 0;
			int opcaoMenuSolicitacoes = 0;
			
			switch( opcaoMenuPrincipal )
			{
				case 1:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Compras" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] Calcular valor das Compras"   +
												"\n[ 2 ] Adicionar produto às Compras" +
								  				"\n[ 3 ] Mostrar produtos Comprados"   +
								  				"\n[ 4 ] Efetuar Compra"    	         +
								  				"\n[ 5 ] Voltar ao Menu Principal"     +
								  				"\n\nOpção selecionada: " );
						opcaoMenuCompras = entrada.nextInt();
						
						switch( opcaoMenuCompras )
						{
							case 1:
								break;
							case 2:
								break;
							case 3:
								
								break;
							case 4:
								
								break;
							case 5:
								break;
						}
						
					} while( opcaoMenuCompras != 5 );
					
					break;
					
				case 2:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Cadastro" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] Cadastrar Cliente"        +
								  				"\n[ 2 ] Cadastrar Fornecedor"     +
								  				"\n[ 3 ] Cadastrar Produto"        +
								  				"\n[ 4 ] Voltar ao Menu Principal" +
								  				"\n\nOpção selecionada: " );
						opcaoMenuCadastro = entrada.nextInt();
						
						switch( opcaoMenuCadastro )
						{
							case 1:
								funcionario.cadastrar_Cliente( cliente );
								
								break;
								
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
						}
						
					} while( opcaoMenuCadastro != 4 );
					
					break;
					
				case 3:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Consultas" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] Consultar Livros Cadastrados" +
								  				"\n[ 2 ] Consultar CDs Cadastrados"    +
								  				"\n[ 3 ] Consultar DVDs Cadastrados"   +
								  				"\n[ 4 ] Voltar ao Menu Principal"     +
								  				"\n\nOpção selecionada: " );
						opcaoMenuConsultas = entrada.nextInt();
						
						switch( opcaoMenuConsultas )
						{
							case 1:
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
						}
						
					} while( opcaoMenuConsultas != 4 );
					
					break;
					
				case 4:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Solicitações" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] Solicitar Livro a Fornecedor" +
								  				"\n[ 2 ] Solicitar CD a Fornecedor"    +
								  				"\n[ 3 ] Solicitar DVD a Fornecedor"   +
								  				"\n[ 4 ] Voltar ao Menu Principal"     +
								  				"\n\nOpção selecionada: " );
						opcaoMenuSolicitacoes = entrada.nextInt();
						
						switch( opcaoMenuSolicitacoes )
						{
							case 1:
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
						}
						
					} while( opcaoMenuSolicitacoes != 4 );
					
					break;
					
				case 5:
					limpar_Tela();
					
					System.out.println( "Obrigado por usar nosso sistema!" );
					break;
			}
			
		} while( opcaoMenuPrincipal != 5 );
		
		entrada.close();
	}
	
	public static void limpar_Tela( )
	{
		for( int contador = 0; contador < 100; contador++ )
		{
			System.out.println( "" );
		}
	}
	
	public static void imprimir_Linha( )
	{
		System.out.println( "____________________________________________" );
	}
	
	public static void imprimir_LinhaPontilhada( )
	{
		System.out.println( "--------------------------------------------" );
	}
}
