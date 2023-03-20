package oca.examples;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a"); list.add("b"); list.add("c"); 
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String string : list) {
			System.out.println(string);
		}

		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

		i = 0;
		do {
			System.out.println(list.get(i));
			i++;
		} while (i < list.size());

	}

}
