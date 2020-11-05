package boletintema2;

import java.util.Scanner;

public class Bucles14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce un numero entero y positivo:");
        int numero = texto.nextInt();
        int i = 0;
        int suma = 0;
        
        if (numero > 0) {
        	while (i < 100) {
        		suma = suma + numero;
        		numero++;
        		i++;
        	}
        	System.out.println("El numero resultante es: " +suma);
        }
        else {
        	System.out.println("Has introducido un numero no valido.");
        }
        
	}

}
