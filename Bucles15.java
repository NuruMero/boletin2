package boletintema2;

import java.util.Scanner;

public class Bucles15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce un minimo:");
        int minimo = texto.nextInt();
        
        System.out.println("Introduce un maximo:");
        int maximo = texto.nextInt();
        
        int i = minimo;
        System.out.println("Yendo de 7 en 7:");
        
        while (i<maximo) {
        	System.out.println(i);
        	i += 7;
        }
	}

}
