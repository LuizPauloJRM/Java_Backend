package operadores;

import java.util.Scanner;

public class Operadores {
 public static void main(String[]Args) {
	 var scanner = new Scanner(System.in);
	 System.out.println(" Quanto é 1 + 1  = ");	 
	 var result = scanner.nextInt();	
	 //Resultado da comparação boolean se for == 2 true diferente false  
	 var isRight = result == 2;
	 //System.out.println("Resultado é 4 voce informou o numero "+result);
	 System.out.printf("Resultado é 4 voce informou o numero (%s)",isRight);
 }
}
