package parouimpar;
import java.util.Scanner;
public class parouimpar {

	public static void main(String[] args) {
		 Scanner  scanner = new  Scanner (System.in);
		 
		 
		 System.out.println("Sistema de  verificação de par ou impa");

		 
		    System.out.print("Digite um numero ");
		    int numero = scanner.nextInt();
		    
		    
		    if(numero%2==0) {
		    	
		    	System.out.printf(" O numero %d é par" , numero);
		    }
		    
		    else {
		    	System.out.printf("O número %d é impar " , numero);
		    }
		    scanner.close();
	}

}
