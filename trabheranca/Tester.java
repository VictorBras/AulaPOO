package trabheranca;

public class Tester {
  public static void main(String[] args) {
    Funcionario operador = new Funcionario();
    Gerente gerente = new Gerente(12345);

    operador.setNome("João");
    operador.setCpf("123.456.789-10");
    operador.setSalario(2000);

    gerente.setNome("Victor");
    gerente.setCpf("123.456.789-11");
    gerente.setSalario(5000);
    gerente.setNumeroDeFuncionariosGerenciados(1);
    gerente.autentica(456);

    System.out.println("***********************************");
    System.out.println("Nome: João Victor Cruz");
    System.out.println("Matrícula: 0050015790");
    System.out.println("***********************************");

    System.out.println("Bonificação Operador: " + operador.getBonificacao());
    System.out.println("Bonificação Gerente: " + gerente.getBonificacao());
  }
}