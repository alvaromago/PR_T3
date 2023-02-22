package es.studium.ejercicio7TA;

import java.util.Scanner;

public class Ejercicio7TA
{

	public static void main(String[] args)
	{
		int numeros[] = new int [10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Dame un número");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		
		int suma = 0;
		for(int i = 0; i < 10; i++)
		{
			suma = suma + numeros[i];
		}
		double media;
		media = (double)suma / (double)numeros.length;
		
		int max, min;
		min = max = numeros[0];
		for(int i = 0; i < numeros.length; i++)
		{
			if(max<numeros[i])
			{
				max=numeros[i];
			}
			if(min>numeros[i])
			{
				max=numeros[i];
			}
		}
		
		System.out.println("La media es: " + media);
		System.out.println("El número máximo es: " + max);
		System.out.println("El número mínimo es: " + min);
	}

}
