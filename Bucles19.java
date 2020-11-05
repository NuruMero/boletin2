package boletintema2;

public class Bucles19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int contador = 0;
		
		while (contador < 20) {
			 boolean comprobar = false;
		        for(int i = 2; i <= num/2; ++i)
		        {
		            if(num % i == 0)
		            {
		                comprobar = true;
		                break;
		            }
		        }

		        if (!comprobar) {
		            System.out.println(num);
		            contador++;
		        }
		        num++;
		}
			
       
}

}
