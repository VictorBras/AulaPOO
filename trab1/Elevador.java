package br.lasalle.oop.trab1;

public class Elevador extends Porta{
	int capacidade;
	boolean subindo;
	boolean funcionando;
	
	void chamar () {
		System.out.print((funcionando) ? 
				"Aguarde! O elevador está a caminho" 
				: "O elevador não está funcionando! Considere a ideia de se exercitar");
	}
	
}
