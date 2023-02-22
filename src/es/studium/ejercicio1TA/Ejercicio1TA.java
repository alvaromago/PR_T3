package es.studium.ejercicio1TA;

import java.util.Scanner;

public class Ejercicio1TA
{

	public static void main(String[] args)
	{
		int tabla[] = new int[4];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < tabla.length; i++)
		{
			System.out.println("Dame el número entero de la posición " + i + ":");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		for(int i = 0; i < tabla.length; i++)
		{
			System.out.println("Valor de " + i + ":" + tabla[i]);
		}
	}
		

}
