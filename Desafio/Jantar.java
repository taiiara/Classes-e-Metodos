package Desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Lisa", 62.3);
		
		Comida c1 = new Comida("Frango", 0.8);
		Comida c2 = new Comida("Arroz", 0.3);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);

		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
		
	}

}
