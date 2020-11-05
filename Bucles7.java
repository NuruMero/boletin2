package boletintema2;

import java.util.Scanner;

public class Bucles7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un numero para mostrar su tabla de multiplicar:");
		int numero = teclado.nextInt();
		int i;
		int resultado;
		
		for (i = 1; i < 11; i++) {
			resultado = numero*i;
			System.out.println(numero +" x " +i +" = " +resultado);
		}
	}

}
