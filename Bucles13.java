package boletintema2;

import java.util.Scanner;

public class Bucles13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce un numero para ver si es primo o no:");
        
        int numero = texto.nextInt();
        int a;
        boolean isPrime=true;
        
        for (int i=2; i<=numero/2; i++) {
        	a = numero % i;
        	if (a == 0) {
        		isPrime=false;
        		break;
        	}
        }
        
        if (isPrime) {
        	System.out.println(numero +" es un numero primo.");
        }
        else {
        	System.out.println(numero +" no es un numero primo.");
        }
        
	}

}
