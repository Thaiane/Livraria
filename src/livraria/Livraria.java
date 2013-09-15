package livraria;

import java.util.Scanner;

public class Livraria
{
	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );
		
		System.out.println( "\n\t\tLIVRARIA\n" );
		
		System.out.println( "\nMenu Principal " );
		
		imprimir_Linha();
		
		System.out.println( "\n[ 1 ] Compras"      +
								  "\n[ 2 ] Cadastros"    +
								  "\n[ 3 ] Consultas"    +
								  "\n[ 4 ] Solicitações" );
		
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
