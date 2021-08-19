//Classe cachorro
public class cachorro extends animal {
	
	public void caracteristicas() {
		System.out.println("Animal: Cachorro");
		System.out.println("chegam a velocidade de: " +correr(30) +"km por hora");
		System.out.println("se alimentam de: " +alimentar("ração"));
		System.out.println("dormem aproximadamente: " +dormir(12) +" horas por dia");
		System.out.println("o som emitido é: " +emitirSom("au-au-au"));
		System.out.println("-------------");
	}

}
