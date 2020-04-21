package trabpolimorfismo;

public class Canguru extends Mamifero {

	@Override
	public void locomover() {
		System.out.println("Pulando...");
		super.locomover();
	}

	@Override
	public void alimentar() {
		System.out.println("Comento arbustos");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de canguru");
	}

}