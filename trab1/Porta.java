package br.lasalle.oop.trab1;

public class Porta {
	String cor;
	boolean aberta;
	
	void fechar () {
		aberta = false;
		return;
	}
	
	void abrir () {
		aberta = true;
		return;
	}
	
	void entrar () {
		System.out.print((aberta) ? "A porta está aberta... Entrando" : "A porta está fechada, melhor bater");
	}
}
