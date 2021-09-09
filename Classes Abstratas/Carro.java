package classesAbstratas;

public class Carro extends veiculo {
	
	@Override
	public double calculaIpva() {
		
		double ipva = super.getValorTabela() * 0.04; 
		
		return ipva;
	}

}
