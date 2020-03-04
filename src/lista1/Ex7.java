package lista1;

public class Ex7 {

	public static void main(String[] args) {
		
		int[] a = {4, 20, 8, 10, 20, 5, 20};
		
		int maior = 0;
		
		int posicaoMaior = -1;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maior) {
				maior = a[i];
				posicaoMaior = i--;				
			}
		}
		
		System.out.println("O maior valor encontrado foi "+ maior +" na posição "+ posicaoMaior);

	}

}
