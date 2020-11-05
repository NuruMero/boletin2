package boletintema2;

import java.util.Scanner;

public class Bucles16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Caracter con el que hacer la piramide:");
        String caracter = texto.next();
        
        System.out.println("Altura de la piramide:");
        int altura = texto.nextInt();
        
        int cont1 = 0;
        int cont2 = 0;
        int num1 = 0;
        int num2 = 0;
        
        while (cont1 < altura) {
        	while (num1 < altura) {
        		System.out.print(" ");
        		num1++;
        	}
        	
        	while (num2 <= (cont2)) {
        		System.out.print(caracter);
        		num2++;
        	}
        	num2 = 0;
        	
        	System.out.println(" ");
        	
        	num1 = 1+cont1;
        	cont1++;
        	cont2 = cont2 + 2;
        }
	}

}
