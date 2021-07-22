//Classe Principal
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa p = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		p.setNome(sc.nextLine());
		
		System.out.println("Digite sua altura: ");
		p.setAltura(sc.nextDouble());
		
		p.exibirDados();
		p.fraseUsuario();		
	}
}
