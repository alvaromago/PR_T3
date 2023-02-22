package es.studium.ejercicio8TA;

import java.util.Scanner;

public class Ejercicio8TA
{

	public static void main(String[] args)
	{
		int numeros[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Dame un número");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		
		int max;
		max = numeros[0];
		for(int i = 0; i < numeros.length; i++)
		{
			if(max<numeros[i])
			{
				max=numeros[i];
			}
		}
		System.out.println("El número máximo es: " + max);
		for(int i = 0; i < numeros.length; i++)
		{
			if(numeros[i]==max)
			{
				System.out.println("La posición donde se encuentra el máximo en la tabla es: " + i);
			}
		}
		
		
	}

}
