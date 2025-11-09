package operadores;

import java.util.Scanner;

public class OperacoesAritmeticas {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor 1 : ");
		var valor1 = scanner.nextInt();
		System.out.println("Informe o valor 2 : ");
		var valor2 = scanner.nextInt();
		var resultado = (valor1 + valor2);
		System.out.println(""+resultado);
		
		
	}
}
