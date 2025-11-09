package operadores;

import java.util.Scanner;

public class Validadores {
	public static void main (String[]args) {
		var scanner = new Scanner(System.in);
		System.out.println("Quantos anos voce tem: ");
		//Pego o scanner  para a saida do meu println
		//next int para int numbers 
		//Criou uma variável idade e jogou dentro dela o scanner 
		var idade = scanner.nextInt();
		var canDrive = idade > 17;
		System.out.printf("Voce pode fazer a prova ? (%s)  \n",canDrive);
		
	}
}
