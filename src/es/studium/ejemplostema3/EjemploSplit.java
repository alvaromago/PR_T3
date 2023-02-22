package es.studium.ejemplostema3;

public class EjemploSplit
{
	// El uso principal del split es para cortar y quitar algo
	public static void main(String[] args)
	{
		String texto = "En un lugar de La Mancha ...";
		String tabla1[] = texto.split(" ");
		for(String cadena: tabla1)
		{
			System.out.println(cadena);
		}
		String fecha = "23/11/2022";
		String tabla2[] = fecha.split("/");
		for(String cadena: tabla2)
		{
			System.out.println(cadena);
		}
	}
}