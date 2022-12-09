package Desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return String.format("Olá, meu nome é %s e eu estou pesando %.1fkg", this.nome, this.peso);
	}
}
