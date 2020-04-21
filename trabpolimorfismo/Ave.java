package trabpolimorfismo;

public class Ave extends Animal {
	protected String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comento frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}

	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

}