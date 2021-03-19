
public class AreaQuadrado {

	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado();
		quadrado1.base = 5;
		quadrado1.altura = 5;
		
		System.out.println("A area do primeiro quadrado é: altura ("+quadrado1.altura+") x "+" base ("+quadrado1.base+") = "+quadrado1.calcularArea());
		
		Quadrado quadrado2 = new Quadrado();
		quadrado2.base = 8;
		quadrado2.altura = 8;
		
		System.out.println("A area do segundo quadrado é: altura ("+quadrado2.altura+") x "+" base ("+quadrado2.base+") = "+quadrado2.calcularArea());
		
	}

}
