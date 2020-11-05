package boletintema2;

import java.util.Scanner;

public class Bucles12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = texto.nextInt();
        
        System.out.println("Introduce el exponente:");
        int exponente = texto.nextInt();
        
        int contador = 1;
        
        while (contador < exponente) {
        base = base + base;
        
        contador++;
        }
        
        System.out.println(base);
	}

}
