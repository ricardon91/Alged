package lista2;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		
		List<Circle> list = new ArrayList<>();
		
		double random = 0.0;
		
		do {
			random = Math.random();
			if(random > 0.01) {
				list.add(new Circle(random));
			}
		} while(random > 0.01); 
		
		int index = 1;
		for(Circle c : list) {
			System.out.println((index++) + ") " + "Area: " + c.calcArea());
		}

	}

}
