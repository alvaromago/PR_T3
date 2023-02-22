package es.studium.ejercicio10CA;

import java.util.Scanner;

public class Ejercicio10CA
{

	public static void main(String[] args)
	{
		String cadena;
		int longitud;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la cadena:");
		cadena = teclado.nextLine();
		System.out.println("Introduzca una longitud:");
		longitud = teclado.nextInt();
		teclado.close();
		for(int i = cadena.length() - longitud; i < cadena.length(); i++)
		{
			System.out.print(cadena.charAt(i));
		}
	}

}
