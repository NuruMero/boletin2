package boletintema2;

import java.util.Scanner;

public class Bucles26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);

		System.out.println("Introduce una altura para la U: ");
		int altura = texto.nextInt();
		
		int contador = 0;

		
		while (contador <= altura) {
			if (contador == altura) {
					System.out.println(" ***");
			}
			else {
				System.out.println("*   *");
			}
			
			contador++;
		}
	}

}
