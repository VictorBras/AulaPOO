package trabheranca;

public class Gerente extends Funcionario {
  private int senhaEspecial;
  private int numeroDeFuncionariosGerenciados;

  public Gerente(int senha){
    this.senhaEspecial = senha;
  }

  public int getNumeroDeFuncionariosGerenciados() {
    return numeroDeFuncionariosGerenciados;
  }

  public void setNumeroDeFuncionariosGerenciados(int numero) {
    this.numeroDeFuncionariosGerenciados = numero;
  }

  public void autentica (int senha) {
    System.out.println(senhaEspecial == senha ?
      "Acesso liberado" : "Acesso negado"
    );
  }

  @Override
  public double getBonificacao() {
    return super.getBonificacao() + 1000;
  }

}