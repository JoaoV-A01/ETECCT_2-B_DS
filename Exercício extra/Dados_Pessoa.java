public class Dados_Pessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa(null, 0, 0);
		
		System.out.println("Digite seu nome: ");
		p.setNome(sc.nextLine());
		
		System.out.println("Digite seu ano de nascimento: ");
		p.setNasc(sc.nextInt());
		
		System.out.println("Digite o ano atual: ");
		p.anoAtual = sc.nextInt();
		
		System.out.println("Digite sua altura: ");
		p.setAltura(sc.nextDouble());
		
		p.mostrarDados();

	}
}
