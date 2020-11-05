package boletintema2;

import java.util.Scanner;

public class Bucles8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce el numero a analizar:");
        int numero = texto.nextInt();
        int digitos = 0;
        
        while (numero > 0.9) {
        	System.out.println(numero);
        	digitos += 1;
        	numero = numero/10;
        }
        System.out.println("El numero tiene " +digitos +" digitos.");
	}

}
