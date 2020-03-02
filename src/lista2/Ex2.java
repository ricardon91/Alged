package lista2;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		String ra = "";
		String name = "";
		
		for(int i = 0; i < 3; i++) {
			ra = JOptionPane.showInputDialog("RA: ");
			name = JOptionPane.showInputDialog("Nome: ");
			map.put(ra, name);
		}
		
		System.out.println();
		System.out.println();
		
		String searchRA = JOptionPane.showInputDialog("Entre com RA que busca: ");
		if(map.get(searchRA) != null) {
			System.out.println("Para o RA " + searchRA + " o nome é: " + map.get(searchRA));
		} else {
			System.out.println("Aluno inexistente!");
		}

	}

}
