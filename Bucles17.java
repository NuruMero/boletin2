package boletintema2;

import java.util.Scanner;

public class Bucles17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto=new Scanner(System.in);
		
		System.out.println("Introduce el caracter: ");
		String caracter = texto.next();
		
		System.out.println("Introduce la altura de la piramide: ");
		int altura=texto.nextInt();
		
		for(int i=1; i<=altura; i++){ 
			for(int j=i; j<altura; j++){ 
				System.out.print(" "); 
			}
			
			for(int k=1; k<2*i; k++){
				if(i==altura || (k==1 || k==2*i-1))
					System.out.print(caracter); 
				else {
					System.out.print(" "); 
				}
			}
			
			System.out.println("");
		}
		}
		}