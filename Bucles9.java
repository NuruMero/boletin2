package boletintema2;

import java.util.Scanner;

public class Bucles9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner texto=new Scanner(System.in);

        System.out.println("Introduce numeros positivos:");
        System.out.println("(Para salir del bucle, poner un numero negativo)");
        
        int numero = 0;
        int suma = 0;
        int contador = 0;
        
        while (numero >= -1) {
        	numero = texto.nextInt();
        	if (numero >= -1) {
        	suma = suma + numero;
        	contador++;
        	}
        	else {
        		break;
        	}
        }
                
        int media = suma/contador;
        
        System.out.println("La media de estos numeros es " +media);
	}

}
