package boletintema2;

import java.util.Scanner;

public class Bucles18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		int numero = 0;
		int mayorpar = 0;
		int sumaimpar = 0;
		int contador = 0;
		
		System.out.println("Introduce numeros:");
		System.out.println("(Numero negativo para salir)");
		while (numero >=0) {
			numero = texto.nextInt();
			
			if (numero < 0) {
				break;
			}
			if (numero % 2 == 0) {
				if (numero > mayorpar) {
					mayorpar = numero;
				}
			}
			else {
				sumaimpar = sumaimpar + numero;
				contador++;
			}
		}
		
		System.out.println("El mayor numero par introducido es: " +mayorpar);
		
		int mediaimpar = sumaimpar/contador;
		System.out.println("La media de los impares introducidos es: " +mediaimpar);
	}

}
