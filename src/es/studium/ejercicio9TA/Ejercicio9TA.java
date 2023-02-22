package es.studium.ejercicio9TA;

import java.util.Scanner;

public class Ejercicio9TA
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 4;
		Scanner teclado = new Scanner(System.in);
		char tabla[][] = new char[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++)
		{
			for(int j = 0; j < COLUMNAS; j++)
			{
				System.out.println("Indique un carácter " + i + "," + j);
				tabla[i][j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		for(int i = 0; i < FILAS; i++)
		{
			for(int j = 0; j < COLUMNAS; j++)
			{
				System.out.println(" " + tabla[i][j]);
			}
			System.out.println("");
		}
	}

}
