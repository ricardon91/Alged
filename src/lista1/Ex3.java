package lista1;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		double[] d = new double[10];
		
		String aux = "";
		
		for(int i = 0; i < d.length; i++) {
			aux = JOptionPane.showInputDialog("Entre valor A (" + i + "):");
			d[i] = Double.parseDouble(aux);
		}
		
		int index = 1;
		for(int i = 0; i < d.length; i++) {
			System.out.println((index++) + " - " + d[i]);
		}

	}

}
