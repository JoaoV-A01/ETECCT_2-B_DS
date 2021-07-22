//Classe Pessoa
public class Pessoa {
	//Atributos privados
	private String nome;
	private double altura;

	//Construtor
	public Pessoa(String nome, double altura) {
	this.nome = nome;
	this.altura = altura;
	}
	//Get's e Set's nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Get's e Set's altura
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	//Método exibir atributos da classe
	public void exibirDados() {
		System.out.println("Nome: " +this.getNome);
		System.out.println("Altura: " +this.getAltura);
	}
	//Metodo mensagem do usuario/padrao
	public void fraseUsuario() {
		System.out.println("Tenha um bom dia :)")
	}
}
