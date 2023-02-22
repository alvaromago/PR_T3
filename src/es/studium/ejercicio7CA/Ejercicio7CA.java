package es.studium.ejercicio7CA;

import java.util.Scanner;

public class Ejercicio7CA
{

	public static void main(String[] args)
	{
		String cadena;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase:");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println("La longitud de la frase con espacios es: " + longitudEspacios(cadena));
		System.out.println("La longitud de la frase sin espacios es: " + longitudSinEspacios(cadena));
		
	}
	
	public static int longitudEspacios(String cadena)
	{
		int resultado;
		resultado = cadena.length();
		return resultado;
	}
	
	public static int longitudSinEspacios(String cadena)
	{
		return(cadena.replace(" ", "").length());
	}
}
