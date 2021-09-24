package Interface;

public class Conta {

	private int Numero;
	private int Agencia;
	private double Saldo;
	private String TitularConta;
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		this.Numero = numero;
	}
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		this.Agencia = agencia;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	public String getTitularConta() {
		return TitularConta;
	}
	public void setTitularConta(String titularConta) {
		this.TitularConta = titularConta;
	}
	
	public void sacar(double valor) {
		this.Saldo = this.getSaldo() - valor + 5;
	}
	
	public void depositar(double valor) {
		this.Saldo = this.getSaldo() + valor;
	}
	
	public void infoConta() {
		System.out.println("---------------------------------");
		System.out.println("Titular da conta: " +this.getTitularConta());
		System.out.println("Número: " +this.getNumero());
		System.out.println("Agencia: " +this.getAgencia());
		System.out.println("Saldo: " +this.getSaldo());
	}
}
