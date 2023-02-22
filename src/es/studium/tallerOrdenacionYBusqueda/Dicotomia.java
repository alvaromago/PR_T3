package es.studium.tallerOrdenacionYBusqueda;

import java.util.Random;
import java.util.Scanner;

public class Dicotomia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int TAM = 100;
		int tabla[] = new int[TAM];
		int inferior, superior, central, elemento_buscado, encontrado, i, salto, aux;
		boolean cambios;
		Random aleatorio = new Random();

		for (i = 0; i < TAM; i++)
		{
			tabla[i] = aleatorio.nextInt(1000);
		}

		for (salto = TAM / 2; salto != 0; salto = salto / 2)
		{
			cambios = true;
			while (cambios == true)
			{
				cambios = false;
				for (i = salto; i < TAM; i++)
				{
					if (tabla[i - salto] > tabla[i])
					{
						aux = tabla[i];
						tabla[i] = tabla[i - salto];
						tabla[i - salto] = aux;
						cambios = true;
					}
				}
			}
		}

		System.out.println("La tabla ordenada queda así:");
		for (i = 0; i < TAM; i++)
		{
			System.out.println(tabla[i]);
		}
		
		System.out.println("Dame el número a buscar:");
		elemento_buscado = teclado.nextInt();
		
		encontrado = -1;
		inferior = 0;
		superior = TAM-1;
		while(inferior <= superior)
		{
			central = (inferior + superior) / 2;
			if(tabla[central] == elemento_buscado)
			{
				encontrado = central;
				inferior = superior + 1;
			}
			else
			{
				if(elemento_buscado < tabla[central])
				{
					superior = central - 1;
				}
				else
				{
					inferior = central + 1;
				}
			}
		}
		
		if(encontrado != -1)
		{
			System.out.println("El elemento se encontró en la posición " + encontrado);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado.");
		}
	}

}
