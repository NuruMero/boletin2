package boletintema2;

import java.util.Scanner;

public class Condicionales13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner (System.in);

		System.out.println("Introduce la hora");
		int HH = texto.nextInt();
		
		System.out.println("Introduce los minutos");
		int MM = texto.nextInt();
		
		System.out.println("Introduce los segundos");
		int SS = texto.nextInt();
		
		int totalminutos = (HH *60) + MM;
		int totalsegundos = (totalminutos * 60) + SS;
		
		System.out.println("Son los " +totalsegundos +" segundos.");

	}

}
