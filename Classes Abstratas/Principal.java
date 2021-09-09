package classesAbstratas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		c1.setModelo("Modelo Carro 1");
		c1.setValorTabela(5000);
		c1.setCor("Amarelo Urina");
		c1.setCombustivel(70);
		c1.imprimirFicha();
		
		Carro c2 = new Carro();
		c2.setModelo("Batmovel");
		c2.setValorTabela(100000000);
		c2.setCor("Preto Dark");
		c2.setCombustivel(1000);
		c2.imprimirFicha();
		
		Moto m1 = new Moto();
		m1.setModelo("Modelo Moto 1");
		m1.setValorTabela(3000);
		m1.setCor("Amarelo Urina");
		m1.setCombustivel(15);
		m1.imprimirFicha();
		
		Moto m2 = new Moto();
		m2.setModelo("Moto Aranha");
		m2.setValorTabela(100);
		m2.setCor("Vermelho e Azul");
		m2.setCombustivel(30);
		m2.imprimirFicha();

	}

}
