//Classe testeNumPrimo
public class testeNumPrimo {

	public static void main(String[] args) {
		NumPrimo np = new NumPrimo();
				
			int[] array = new int[7];
				
			array[0] = 1;
			array[1] = 2;
			array[2] = 4;
			array[3] = 5;
			array[4] = 6;
			array[5] = 7;
			array[6] = 8;
				
			np.verificarNumero(3);
				
			np.verificarNumero(array);
	}

}

