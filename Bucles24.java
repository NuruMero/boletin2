package boletintema2;

import java.util.Scanner;

public class Bucles24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner texto=new Scanner(System.in);

		System.out.println("Introduce una altura para la L:");
		int altura = texto.nextInt();
		
		int contador = 1;
		int conthor = 1;
		while (contador <= altura) {
			if (contador == altura) {
				while (conthor <= (altura/2)+1) {
					System.out.print("*");
					conthor++;
				}
			}
			else {
				System.out.print("*");
				System.out.println(" ");
			}
			
			contador++;
		}
	}

}
