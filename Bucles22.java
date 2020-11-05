package boletintema2;

import java.util.Scanner;

public class Bucles22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		System.out.println("Introduce un numero para buscar su factorial:");
		int numero = texto.nextInt();
		
		int contador = 1;
		int suma = 1;
		
		while (contador < numero+1) {
			suma = suma * contador;
			contador++;
		}
		System.out.println("El factorial de " +numero +" es " +suma);
	}

}
