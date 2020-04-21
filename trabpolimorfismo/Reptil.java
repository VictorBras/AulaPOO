package trabpolimorfismo;

public class Reptil extends Animal {
	protected String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}

}