public class Funcionario {

	String nome;
	double salarioBruto;
	double imposto;

  double salarioLiquido() {

		return salarioBruto * imposto;

  }
  double aumentaSalario (double valor) {

		return salarioBruto + valor;

  }
}
