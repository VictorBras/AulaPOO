package br.lasalle.oop.trab1;

public class TrabalhoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porta portaSala = new Porta();
		portaSala.aberta = false;
		portaSala.abrir();
		portaSala.entrar();
		
		Elevador elevador1 = new Elevador();
		elevador1.funcionando = false;
		elevador1.capacidade = 10;
		elevador1.chamar();
	}

}
