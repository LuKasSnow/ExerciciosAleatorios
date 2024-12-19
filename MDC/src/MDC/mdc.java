package MDC;
import java.util.Scanner;
public class mdc {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner (System.in);
		  
		  
		     System.out.println("calcula o MDC  entre dois números");
		     
		        System.out.print("Digite o primeiro número");
		        int numero = scanner.nextInt();
		        
		        System.out.print("Digite o segindo número");
		        int numero2 = scanner.nextInt();
		        
		        while(  numero2 !=0) {
		       int resultado= numero % numero2;
		       
		       numero = numero2;
		       numero2 = resultado;
		       
		        }		   
		        System.out.print( numero);
	}

}
