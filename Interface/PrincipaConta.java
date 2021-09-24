package Interface;

public class PrincipaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setTitularConta("Tituar da Conta corrente");
		cc1.setNumero(12);
		cc1.setAgencia(1);
		cc1.setSaldo(2000);
		
		cc1.depositar(200);
		cc1.sacar(100);
		cc1.infoConta();
		
		ContaPoupanca cpo1 = new ContaPoupanca();
		cpo1.setTitularConta("Tituar da Conta poupança");
		cpo1.setNumero(11);
		cpo1.setAgencia(2);
		cpo1.setSaldo(2000);
		
		cpo1.rendimentoPounca();
		cpo1.depositar(200);
		cpo1.sacar(100);
		cpo1.infoConta();
		
		
		ContaPremium cp1 = new ContaPremium();
		cp1.setTitularConta("Tituar da Conta premium");
		cp1.setNumero(10);
		cp1.setAgencia(3);
		cp1.setSaldo(2000);
		cp1.setCredito(500);
		
		cp1.depositar(200);
		cp1.sacar(100);
		cp1.infoConta();
	}

}
