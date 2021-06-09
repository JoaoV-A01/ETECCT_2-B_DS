import java.util.Scanner;
import javax.swing.JOptionPane;

public class testeFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Funcionario fun = new Funcionario();
		
		String nome, cpf; 
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
		
		double sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do seu salário: "));
		
		fun.setNome(nome);
		fun.setCpf(cpf);
		fun.setSalario(sal);
		
		fun.imprimir();

	}

}
