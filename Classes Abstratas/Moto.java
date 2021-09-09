package classesAbstratas;

public class Moto extends veiculo{
	
	@Override
	public double calculaIpva() {
		
		double ipva = super.getValorTabela() * 0.02; 
		
		return ipva;
	}
}
