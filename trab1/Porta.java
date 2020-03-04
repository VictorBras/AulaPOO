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
		System.out.print((aberta) ? "A porta est� aberta... Entrando" : "A porta est� fechada, melhor bater");
	}
}
