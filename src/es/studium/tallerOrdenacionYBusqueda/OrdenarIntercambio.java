package es.studium.tallerOrdenacionYBusqueda;

import java.util.Scanner;

public class OrdenarIntercambio
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int TAM = 10;
		int tabla[] = new int[TAM];
		int i, j, aux;
		
		for(i = 0; i < TAM; i++)
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		for(i = 0; i < TAM-1; i++)
		{
			for(j=i+1; j<TAM; j++)
			{
				if(tabla[i] < tabla[j])
				{
					aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
		
		System.out.println("La tabla ordenada queda así:");
		for(i = 0; i < TAM-1; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
