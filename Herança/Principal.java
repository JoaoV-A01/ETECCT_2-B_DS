//Classe Principal
public class Principal {
	public static vod main(String[] args) {
		
		Funcionario fun1 = new Funcionario();

		fun1.setNome("João");
		fun1.setCpf("102.345.123-32");
		fun1.setSalario(1000);

		System.out.println(fun1.getNome());
		System.out.println(fun1.getCpf());
		System.out.println(fun1.getSalario());

		Gerente gen1 = new Gerente();

		gen1.setNome("Doni");
		gen1.setCpf("123.456.789.10");
		gen1.setSalario(1000000);
		gen1.setSenha(2222);
				
		System.out.println(gen1.getNome());
		System.out.println(gen1.getCpf());
		System.out.println(gen1.getSalario());
		System.out.printn(gen1.autentica(2222));
	}
}
