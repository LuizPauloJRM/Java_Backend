package Introducao;

//Importação Scanner 
//Tudo dentro do pacote java util 
import java.util.Scanner;

public class Main {
	//Método principal
	public static void main (String[]args) {
		//Declaração de variáveis 
		//Import , scanner , procura em outro package para seu projeto 
//		//br.com.projeto -> Cada . representa uma barra pastas 
//		String nome= "Luiz Paulo";
//		String cargo="Desenvolvedor Java";
//		int idade= 23;	   	
//		System.out.println("Meu nome é " +nome+ " tenho " +idade+" anos e sou "+cargo);	
//		//como funciona o scanner
		//Precisamos inicializar meu objeto scanners
		//Declarando e tipando a variavel 
		// var Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");		
		String nomeScanner= scanner.next();
		
		System.out.println("Informe sua idade: ");		
		int idadeScanner= scanner.nextInt();
		
		System.out.println("Informe seu cargo: ");		
		String cargoScanner= scanner.next();
		
		//printf -> Template string 
		//System.out.printf("Olá %s sua idade é" ,name,age);
		System.out.println("Meu nome é "+nomeScanner+ " tenho "+idadeScanner+ " ,sou "+cargoScanner);

		
	}
}
