package es.studium.ejercicio9CA;

import java.util.Scanner;

public class Ejercicio9CA
{

	public static void main(String[] args)
	{
		String cadena;
		int posicion, longitud;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la cadena:");
		cadena = teclado.nextLine();
		System.out.println("Introduzca una posición:");
		posicion = teclado.nextInt();
		System.out.println("Introduzca una longitud:");
		longitud = teclado.nextInt();
		teclado.close();
		System.out.println("Tu subcadena es: " + Subcadena(cadena, posicion, longitud));
	}
	
	public static String Subcadena(String cadena, int posicion, int longitud)
	{
		String subcadena;
		subcadena = cadena.substring(posicion, posicion+longitud);
		return subcadena;
	}

}
