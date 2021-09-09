import java.util.*;

public class PrincipalFuncionario {
  
	public static void main (String[ ] args) {

    //Instanciando o primeiro objeto do tipo funcionario
    Funcionario pedro = new Funcionario();

    //atribuindo caracteres ao atributo nome
    pedro.nome = “Pedro”;

    //atribuindo valor ao atributo salarioBruto
    pedro.salarioBruto = 1000;

    //atribuindo valor ao atributo imposto
    pedro.imposto = 0,9;
    //imprimindo o valor do cálculo feito pela função salarioLiquido
    System.out.println(“Esse é o salário líquido: ” +pedro.salarioLiquido);

    //interagindo com o usuário, solicitando o valor do aumento do salario
    System.out.println(“Digite o valor do aumento de salário: ");
    valor=in.nextDouble();

    //imprimindo o valor do cálculo feito pela função aumentoSalario
    System.out.println(“Esse é o salário atual com o valor aumentado: ” +pedro.aumentoSalario);

    Funcionario vagner = new Funcionario();
    vagner.nome = “Vagner”;
    vagner.salarioBruto = 5000;
    vagner.imposto = 0,8;

    System.out.println(“Esse é o salário líquido: ” +vagner.salarioLiquido”);

    System.out.println(“Digite o valor do aumento de salário: ");
    valor=in.nextDouble();

    System.out.println(“Esse é o salário atual com o valor aumentado: ” +vagner.aumentoSalario);
  }
}
