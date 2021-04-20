public class Carro {
	protected String cor;
	protected String modelo;
	protected String dono;
	//Função 01 
		public Carro() {
			this("","","");
		}
		//Construtor
		public Carro(String cor, String modelo, String dono) {
		this.cor = cor;
		this.modelo = modelo;
		this.dono = dono;
		}
		//Métodos acessores
		public String getCor() {
			return cor;
		}
		public void setCor (String cor) {
			this.cor = cor;
		}
		public String getModelo () {
			return modelo;
		}
		public void setModelo (String modelo) {
			this.modelo = modelo;
		}
		public String getDono () {
			return dono;
		}
		public void setDono (String dono) {
			this.dono = dono;
		}
		//Função mostrar
		public void apresentarCarro() {
		System.out.println("Cor: " +this.getCor());
		System.out.println("Modelo: " +this.getModelo());
		System.out.println("Proprietario: " +this.getDono());
		}
}
