package IntroducaoPoo;

//Classe Modelo para que a partir dela criamos nossos objetos
//Instanias concebidos em si var male = new Person
public class Person {
	
	private String name;
	
	private int age;

	//Proteger atraves do Getters e setters 
	//Propriedade publica que é uma string nome e nao tem nenhum argumento
    /*
     * métodos públicos em Java que permitem o acesso e a modificação controlados de atributos privados 
     * de uma classe, seguindo o princípio do encapsulamento. Um getter (método de acesso)
     *  retorna o valor de um atributo privado, enquanto um setter (método de modificação) 
     *  recebe um valor como parâmetro e o atribui a um atributo privado,
     *   podendo incluir lógica de validação. 
     */
	public String getName() {
		//Retorna meu nome 
		return name;
	}

	public void setName(String name) {
		//Uso o this para referenciar a essa variavel de name
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
