package es.studium.ejercicio2TA;

public class Ejercicio2TA
{

	public static void main(String[] args)
	{
		int pares[] = new int[20];
		for(int i = 0; i < pares.length; i++)
		{
			pares[i] = i*2;
		}
		for(int numero: pares)
		{
			System.out.println(numero);
		}
	}

}
