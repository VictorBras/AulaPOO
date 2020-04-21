package trabpolimorfismo;

public class AnimalTester {

	public static void main(String[] args) {

		System.out.println("-----Ave-----");
		Ave ave = new Ave();
		ave.setPeso(1);
		ave.setIdade(30);
		ave.setMembros(10);
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();
		ave.fazerNinho();

		System.out.println("-----Mamifero-----");
		Mamifero mamifero = new Mamifero();
		mamifero.setPeso(1);
		mamifero.setIdade(30);
		mamifero.setMembros(10);
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();

		System.out.println("-----Peixe-----");
		Peixe peixe = new Peixe();
		peixe.setPeso(1);
		peixe.setIdade(30);
		peixe.setMembros(10);
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
		peixe.soltarBolha();

		System.out.println("-----Reptil-----");
		Reptil reptil = new Reptil();
		reptil.setPeso(1);
		reptil.setIdade(30);
		reptil.setMembros(10);
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();

		System.out.println("-----Canguru-----");
		Canguru canguru = new Canguru();
		canguru.setPeso(1);
		canguru.setIdade(30);
		canguru.setMembros(10);
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();

		System.out.println("-----Fim------");
		System.out.println("Aluno: João Victor da Cruz Silva");
		System.out.println("Matrícula: 005001579");
	}

}
