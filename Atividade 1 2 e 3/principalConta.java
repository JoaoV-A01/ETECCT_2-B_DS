public class principalConta {

	public static void main(String[] args) {
		Conta primeiro = new Conta();
		primeiro.saldo = 200;

		System.out.println("Saldo na conta inicial" +" = "  +primeiro.saldo);
		primeiro.depositar(200);
		System.out.println("Saldo após o deposito" +" = " +primeiro.extrato());
		System.out.println(primeiro.sacar(500));
		System.out.println("Saldo final da conta" +" = " +primeiro.saldo);
		System.out.println(primeiro.extrato());
	}

}
