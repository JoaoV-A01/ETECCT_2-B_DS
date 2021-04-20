public class Principal {

	public static void main(String[] args) {

		Caminhão cami = new Caminhão("Vermelho","Honda","lulu");
		System.out.println("CAMINHÃO");
			
		cami.setCor("Rosa");
		cami.setModelo("Toyota");
		cami.setDono("Sabrina de Mewlo");	
		cami.apresentarCaminhão();
		
		Carro car = new Carro("Amarelo","Ford","Swain de Noxus");
		System.out.println("CARRO");
		
		car.setCor("Vermelho");
		car.setModelo("Volkswagen");
		car.setDono("Pou de Santos");
		car.apresentarCarro();
		
		Moto mot = new Moto();
		
		mot.cor = "Cinza";
		mot.modelo = "Corsa";
		mot.dono = "Pauilin de Souza";
		
		System.out.println("MOTO");
		
		mot.alterarCor("Azul");
		mot.alterarModelo("Chevrolet");
		mot.alterarDono("Junin Almeida");
		mot.apresentarMoto();
		
	}
}
