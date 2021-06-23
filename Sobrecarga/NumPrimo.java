//Classe NumPrimo 
public class NumPrimo {
	
	public void verificarNumero(int numero) {
		
		int numDivisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i  == 0) {
				numDivisores++;
			}	
		}	
		if (numDivisores == 2 || numero == 2){
			System.out.println("O número "+numero +" é primo");
		}else if (numero == 1){	
			System.out.println("O número "+numero +" é não primo");
		}else {
			System.out.println("O número "+numero +" é não primo");
		}
	}
	public void verificarNumero(int vetor[]) {
		
		for (int n = 0; n < vetor.length; n++) {
			verificarNumero(vetor[n]);
			
		}	
	}
}
