package IntroducaoPoo;

//Método main 
public class Main {

	
	public static void main(String[] args) {
		
		var male = new Person();
		//Abstrair do mundo real para software classes e objetos 
		//Exemplo uma forma "CLASSE"
		//Declaração do objeto pessoas que tem como atributo idade , nome ...
		male.setName("Luiz");
		male.setAge(26);
		
		var female = new Person();
		female.setName("Roberta");
		female.setAge(25);
		
		System.out.println("Male: "+male.getName()+" age: "+male.getAge());
		System.out.println("Female: "+female.getName()+" age: "+female.getAge());

	}

}
