package es.studium.ejercicio12TA;

import java.util.Scanner;

public class Ejercicio12TA
{
	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int matriz1[][] = new int[TAM][TAM];
		int matriz2[][] = new int[TAM][TAM];
		
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println("Indique el número de la matriz 1 situado en la posición " + i + "," + j);
				matriz1[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("La matriz 1 es:\n");
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println(" " + matriz1[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println(" " + matriz1[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				matriz2[i][j] = matriz1[j][i];
			}
		}
		System.out.println("La matriz 2, equivalente a la traspuesta de la matriz 1 es:\n");
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println(" " + matriz2[i][j]);
			}
			System.out.println("");
		}
	}
}
