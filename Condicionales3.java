package boletintema2;

import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce un tipo de operacion a llevar a cabo: ");
		System.out.println("SUMA - RESTA - MULTIPLICACION - DIVISION ");
		String tipo = texto.nextLine();
				
		System.out.println("Introduce los dos valores a calcular: ");
		double val1 = texto.nextDouble();
		double val2 = texto.nextDouble();
		
		double resultado;
		
		switch (tipo)
		{
			case "SUMA":
				resultado = val1 + val2;
				System.out.println("El resultado es " +resultado);
				break;
			case "RESTA":
				resultado = val1 - val2;
				System.out.println("El resultado es " +resultado);
				break;
			case "MULTIPLICACION":
				resultado = val1 * val2;
				System.out.println("El resultado es " +resultado);
				break;
			case "DIVISION":
				resultado = val1 / val2;
				System.out.println("El resultado es " +resultado);
				break;
			
		}
		
	}

}
