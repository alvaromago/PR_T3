package es.studium.tallerOrdenacionYBusqueda;

import java.util.Scanner;

public class OrdenarSeleccion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int TAM = 10;
		int tabla[] = new int[TAM];
		int i, j, indice_menor, aux;
		
		for(i = 0; i < TAM; i++)
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		for(i = 0; i < TAM-1; i++)
		{
			indice_menor = i;
			for(j=i+1; j < TAM; j++)
			{
				if(tabla[j] < tabla[indice_menor])
				{
					indice_menor = j;
				}
			}
			aux = tabla[i];
			tabla[i] = tabla[indice_menor];
			tabla[indice_menor] = aux;
		}
		
		System.out.println("La tabla ordenada queda así:");
		for(i = 0; i < TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
