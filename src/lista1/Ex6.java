package lista1;

public class Ex6 {

	public static void main(String[] args) {
		
		int[] a = {5, -3, 10, -20, 11, 18, 22, 58, 21, -6, -11, -1101};
		
		boolean[] result = new boolean[a.length];
		
		for(int i = 0; i < 12; i++) {
			if(a[i] > 0) {
				result[i] = true;
			} else {
				result[i] = false;
			}
		}
		
		for(int i = 0; i < 12; i++) {
			System.out.println("elemento: " + a[i] + " é positivo: " + result[i]);
		}

	}

}
