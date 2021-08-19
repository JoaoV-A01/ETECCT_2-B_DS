//Classe elefante
public class elefante extends animal {
	
	public void caracteristicas() {
		System.out.println("Animal: Elefante");
		System.out.println("chegam a velocidade de: " +correr(5) +"km por hora");
		System.out.println("se alimentam de: " +alimentar("frutas e folhas"));
		System.out.println("dormem aproximadamente: " +dormir(4) +" horas por dia");
		System.out.println("o som emitido é: " +emitirSom("PRUUU"));
		System.out.println("-------------");
	}
}
