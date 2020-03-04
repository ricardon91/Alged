package lista1;

public class Ex5 {

	public static void main(String[] args) {
		
		int[] a = {2, 4, 6, 8, 10, 12, 3, 7, 20, 25}; 
		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		int contador = 0;
		
		for(int i = 0; i < 10; i++) {
			if(a[i] == x[i]) {
				contador++;
			}
		}
		
		System.out.println("Quantidade de vezes que x aparece em a: " + contador);

	}

}
