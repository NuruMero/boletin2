package boletintema2;

import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 12 para ver el mes correspondiente: ");
		int mes = texto.nextInt();
		
		switch (mes)
		{
			case 1:
				System.out.println("Mes seleccionado: ENERO");
				break;
			case 2:
				System.out.println("Mes seleccionado: FEBRERO");
				break;
			case 3:
				System.out.println("Mes seleccionado: MARZO");
				break;
			case 4:
				System.out.println("Mes seleccionado: ABRIL");
				break;
			case 5:
				System.out.println("Mes seleccionado: MAYO");
				break;
			case 6:
				System.out.println("Mes seleccionado: JUNIO");
				break;
			case 7:
				System.out.println("Mes seleccionado: JULIO");
				break;
			case 8:
				System.out.println("Mes seleccionado: AGOSTO");
				break;
			case 9:
				System.out.println("Mes seleccionado: SEPTIEMBRE");
				break;
			case 10:
				System.out.println("Mes seleccionado: OCTUBRE");
				break;
			case 11:
				System.out.println("Mes seleccionado: NOVIEMBRE");
				break;
			case 12:
				System.out.println("Mes seleccionado: DICIEMBRE");
				break;
			default:
				System.out.println("Valor incorrecto introducido");
				break;
		}
	}

}
