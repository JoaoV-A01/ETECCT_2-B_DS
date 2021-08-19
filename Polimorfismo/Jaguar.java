//Classe jaguar
public class jaguar extends animal{
	
	public void caracteristicas() {
		System.out.println("Animal: Jaguar");
		System.out.println("chegam a velocidade de: " +correr(70) +"km por hora");
		System.out.println("se alimentam de: " +alimentar("carne de outros animais"));
		System.out.println("dormem aproximadamente: " +dormir(18) +" horas por dia");
		System.out.println("o som emitido é: " +emitirSom("GRRRRRAU"));
		System.out.println("-------------");
	}

}
