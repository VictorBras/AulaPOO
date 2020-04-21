package trabpolimorfismo;

public class Peixe extends Animal {
	protected String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

}