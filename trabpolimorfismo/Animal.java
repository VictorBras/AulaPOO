package trabpolimorfismo;

abstract class Animal {
	protected double peso;
	protected int idade;
	protected int membros;

	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.peso = idade;
	}

	public int getMembros() {
		return this.membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}


}