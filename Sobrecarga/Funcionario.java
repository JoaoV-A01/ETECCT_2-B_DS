import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private String cpf;
	double salario;
	
	//DecimalFormat df = new DecimalFormat("0,00");
	DecimalFormat df = new DecimalFormat("#,##0.00");
	
	public void imprimir() {
		
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Valor do salário com síbolo: R$ "+df.format(this.getSalario()));
		System.out.println("Valor do salário sem símboo: "+df.format(this.getSalario()));
	}
	//gets e sets Nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNome(String nome, boolean caixaAlta) {
		if (caixaAlta) {
			this.nome = nome.toUpperCase();
		} else {
			this.nome = nome.toLowerCase();
		}
	}
	public void setNome(String nome, boolean caixaAlta, String primeiraPalavra) {
		if (caixaAlta) {
			nome = nome.toUpperCase();
		} else {
			nome = nome.toLowerCase();
		}
		if (primeiraPalavra == "S") {
			this.nome = nome.split(" ")[0];
		}
	}
	public void setNome(String nome, String primeiraPalavra) {
		if (primeiraPalavra == "S") {
			this.nome = nome.split(" ")[0];
		} 
	}
	//gets e sets CPF
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//gets e sets Salario
	public double getSalario() {
		return this.salario;
	}
	public double getSalario(String semsimbolo) {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
