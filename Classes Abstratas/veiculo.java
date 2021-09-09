public abstract class veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private double combustivel;
	private double ipva;
	
	//Gets e Sets
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorTabela() {
		return valorTabela;
	}
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	//Metodos
	public abstract double calculaIpva();
	
	public void imprimirFicha() {
		System.out.println("----------------------");
		System.out.println("Modelo: " +getModelo());
		System.out.println("Valor de Tabela: " +getValorTabela());
		System.out.println("Cor: " +getCor());
		System.out.println("Combustivel: " +getCombustivel());
		System.out.println("IPVA: " +calculaIpva());
	}
	
}
