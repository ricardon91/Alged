package lista1;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		String aux = "";
		
		for(int i = 0; i < a.length; i++) {
			aux = JOptionPane.showInputDialog("Entre valor A (" + i + "):");
			a[i] = Integer.parseInt(aux); 
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				a[i] = 1;
			} else {
				a[i] = -1;
			}
			System.out.println(a[i]);
		}	

	}

}
