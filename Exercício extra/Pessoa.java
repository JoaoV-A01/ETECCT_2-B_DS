public class Pessoa {
	//Atributos privados
	private String nomePessoa;
	private int dataNascimento;
	private double alturaPessoa;
	public int anoAtual;
	
	//Construtor
	public Pessoa(String nomePessoa, int dataNascimento, double alturaPessoa) {
		this.nomePessoa = nomePessoa;
		this.alturaPessoa = alturaPessoa;
		this.dataNascimento = dataNascimento;
	}
	//Gets e Sets nome pessoa
	public String getNome() {
		return nomePessoa;
	}
	public void setNome(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	//gets e sets data nascimento
	public int getNasc() {
		return dataNascimento;
	}
	public void setNasc(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	//gets e sets altura pessoa
	public double getAltura() {
		return alturaPessoa;
	}
	public void setAltura(double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}
	//Método para calcular a idade da pessoa
	int calcularIdade(int idade, int anoAtual) {
		return idade = anoAtual - this.dataNascimento;
	}
	//Método para imprimir todos os dados de uma pessoa
	public void mostrarDados() {
		System.out.println("Seu nome: " +this.nomePessoa);
		System.out.println("Sua data de nascimento: " +this.dataNascimento);
		System.out.println("Sua idade: " +this.calcularIdade(dataNascimento, anoAtual));
		System.out.println("Sua altura: " +this.alturaPessoa);
	}
}
