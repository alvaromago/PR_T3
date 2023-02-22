package es.studium.tallerOrdenacionYBusqueda;

import java.util.Scanner;

public class OrdenarInsercion
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
		
		for(i = 0; i < TAM; i++)
		{
			j = i;
			aux = tabla[i];
			while(j > 0 && aux < tabla[j-1])
			{
				tabla[j] = tabla[j - 1];
				j = j - 1;
			}
			tabla[j] = aux;
		}
		
		System.out.println("La tabla ordenada queda así:");
		for(i = 0; i < TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
