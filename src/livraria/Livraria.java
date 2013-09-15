package livraria;

import java.util.Scanner;

public class Livraria
{
	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );
		
		int opcaoMenuPrincipal = 0;
		
		do
		{	
			System.out.println( "\n\t\tLIVRARIA\n" );
			
			System.out.println( "\nMenu Principal" );
			
			System.out.print( "\n[ 1 ] Compras"      		+
									"\n[ 2 ] Cadastros"    	   +
									"\n[ 3 ] Consultas"		   +
									"\n[ 4 ] Solicita��es"     +
									"\n[ 5 ] Sair do Programa" +
									"\n\nOp��o selecionada: " );
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
						
						System.out.print( "\n[ 1 ] Calcular valor das Compras" +
								  				"\n[ 2 ] Mostrar produtos Comprados" +
								  				"\n[ 3 ] Efetuar Compra"    	       +
								  				"\n[ 4 ] Voltar ao Menu Principal"   +
								  				"\n\nOp��o selecionada: " );
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
						}
						
					} while( opcaoMenuCompras != 4 );
					
					break;
					
				case 2:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Cadastro" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] "   +
								  				"\n[ 2 ] "   +
								  				"\n[ 3 ] "   +
								  				"\n[ 4 ] "   +
								  				"\n\nOp��o selecionada: " );
						opcaoMenuCadastro = entrada.nextInt();
						
						switch( opcaoMenuCadastro )
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
						
					} while( opcaoMenuCadastro != 4 );
					
					break;
					
				case 3:
					limpar_Tela( );
					
					do
					{
						System.out.println( "\n\t\tLIVRARIA\n" );
						
						System.out.println( "\nMenu de Consultas" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] "   +
								  				"\n[ 2 ] "   +
								  				"\n[ 3 ] "   +
								  				"\n[ 4 ] "   +
								  				"\n\nOp��o selecionada: " );
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
						
						System.out.println( "\nMenu de Solicita��es" );
						
						imprimir_Linha();
						
						System.out.print( "\n[ 1 ] "   +
								  				"\n[ 2 ] "   +
								  				"\n[ 3 ] "   +
								  				"\n[ 4 ] "   +
								  				"\n\nOp��o selecionada: " );
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
