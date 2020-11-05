package boletintema2;

import java.util.Scanner;

public class Bucles11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce diez numeros positivos y negativos:");
        int contador = 0;
        int numero;
        int positivos = 0;
        int negativos = 0;
        
        while (contador < 10) {
        	numero = texto.nextInt();
        	
        	if (numero >= 0) {
        		positivos++;
        	}
        	else {
        		negativos++;
        	}
        	
        	contador++;
        }
        
        System.out.println("Numeros positivos: " +positivos);
        System.out.println("Numeros negativos: " +negativos);
	}

}
