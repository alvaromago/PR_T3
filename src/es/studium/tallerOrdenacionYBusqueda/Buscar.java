package es.studium.tallerOrdenacionYBusqueda;

import java.util.Scanner;

public class Buscar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int TAM = 10;
		int tabla[] = new int[TAM];
		int i;
		boolean encontrado;
		int elemento;
		
		for(i = 0; i < TAM-1; i++)
		{	
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		
		System.out.println("Dame un número a buscar:");
		elemento = teclado.nextInt();
		teclado.close();
		
		encontrado = false;
		i = 0;
		do
		{
			if(tabla[i] == elemento)
			{
				encontrado = true;
			}
			else
			{
				i++;
			}
		}while(!encontrado&&i<TAM);
		
		if(encontrado=true)
		{
			System.out.println("El elemento se encontró en la posición " + i);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado");
		}
	}

}
