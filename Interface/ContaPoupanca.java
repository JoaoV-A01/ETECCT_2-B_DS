package Interface;

public class ContaPoupanca extends Conta{

	public void rendimentoPounca() {
		super.setSaldo(super.getSaldo() * 1.0005);
	}

}
