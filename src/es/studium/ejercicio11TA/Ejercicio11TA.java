package es.studium.ejercicio11TA;

import java.util.Scanner;

public class Ejercicio11TA
{

	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int tabla[][] = new int[TAM][TAM];
		boolean simetrica = true;
		for (int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println("Indique el número de la posición " + i + "," + j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		for(int i = 0; i< TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				System.out.println(" " + tabla[i][j]);
			}
			System.out.println("");
		}
		for(int i = 0; i < TAM; i++)
		{
			for(int j = 0; j < TAM; j++)
			{
				if((tabla[i][j])!=(tabla[j][i]))
				{
					simetrica = false;
				}
			}
		}
		if(simetrica)
		{
			System.out.println("La matriz SI es simétrica.");
		}
		else
		{
			System.out.println("La matriz NO es simétrica.");
		}
	}

}
