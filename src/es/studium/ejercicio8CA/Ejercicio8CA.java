package es.studium.ejercicio8CA;

import java.util.Scanner;

public class Ejercicio8CA
{

	public static void main(String[] args)
	{
		String frase;
		char caracter;
		int i = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase:");
		frase = teclado.nextLine();
		System.out.println("¿Qué letra quieres que busque?:");
		caracter = teclado.nextLine().charAt(0);
		teclado.close();
		boolean encontrado = false;
		while((encontrado==false)&&(i<frase.length()))
		{
			if(frase.charAt(i)==caracter)
			{
				System.out.println("El carácter buscado está en la posición: " + i);
				encontrado = true;
			}
			i++;
		}
		if(!encontrado)
		{
			System.out.println("No se ha encontrado");
		}
	}	
}
