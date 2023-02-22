package es.studium.tallerOrdenacionYBusqueda;

import java.util.Scanner;

public class OrdenarBurbuja
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int TAM = 10;
		int tabla[] = new int[TAM];
		int i, j, aux;
		
		for(i = 0; i < TAM; i++)
		{
			System.out.println("Dame un número:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		for(i = 0; i < TAM-1; i++)
		{
			for(j = 0; j < TAM - i - 1; j++)
			{
				if(tabla[j] > tabla[j + 1])
				{
					aux = tabla[j];
					tabla[j] = tabla[j + 1];
					tabla[j + 1] = aux;
				}
			}
		}
		
		System.out.println("La tabla ordenada queda así:");
		for(i = 0; i < TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
