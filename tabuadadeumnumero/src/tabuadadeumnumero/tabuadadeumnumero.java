package tabuadadeumnumero;
import java.util.Scanner;

public class tabuadadeumnumero {

	public static void main(String[] args) {
	    
		 Scanner  scanner = new  Scanner(System.in);
		 
		 
		 System.out.println("calcular a tabuada  de um número");
		 
		  System.out.println("Digite um número para calcular a tabuada:");
		  int numero = scanner.nextInt();
		  int  resultado = 0;
		  
		  
		  for(int i = 1 ; i<= 10 ;i++) {
			  
			  resultado = numero * i;
			  
			 System.out.printf(" %d  X  %d  =  %d \n" , numero , i , resultado);
		  }
		   
	}

}
