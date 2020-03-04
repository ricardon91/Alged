package lista1;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		String aux = "";
		
		for(int i = 0; i < a.length; i++) {
			aux = JOptionPane.showInputDialog("Entre valor A (" + i + "):");
			a[i] = Integer.parseInt(aux); 
		}
		
		int index = 1;
		for(int i = 0; i < a.length; i++) {
			System.out.println((index++) + " - " + a[i]);
		}

	}

}
