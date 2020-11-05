package boletintema2;

import java.util.Scanner;

public class Bucles23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		System.out.println("Introduce un limite: ");
		int limite = texto.nextInt();
		
		System.out.println("Introduce un divisor: ");
		int divisor = texto.nextInt();
		
		int contador = 1;
		
		System.out.println("Los siguientes son los numeros no divisibles entre " +divisor +" del 1 al " +limite);
		while (contador <= limite) {
			if (contador % divisor != 0) {
				System.out.println(contador);
			}
			
			contador++;
		}
	}

}
