package Interface;

public class ContaCorrente extends Conta implements Tributacao{

	@Override
	public void sacar(double valor) {
		super.setSaldo(this.getSaldo() - valor + 5);
	}
	public void depositar(double valor) {
		super.setSaldo(this.getSaldo() + valor);
	}
	public double calcularImposto() {
		return super.getSaldo() * 0.02;
	}
	public void infoConta() {
		super.infoConta();
		System.out.println("Imposto: " +calcularImposto());
	}
}
