package Interface;

public class ContaPremium extends Conta implements Tributacao{

	private double Credito;

	public double getCredito() {
		return Credito;
	}

	public void setCredito(double credito) {
		Credito = credito;
	}
	public double calcularImposto() {
		return super.getSaldo() * 0.01;
	}
	
	public void infoConta() {
		super.infoConta();
		System.out.println("Imposto: " +calcularImposto());
		System.out.println("Credito: " +this.getCredito());
	}
}
