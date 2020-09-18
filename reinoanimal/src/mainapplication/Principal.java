package mainapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mamiferos.Animal;

public class Principal {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		int c;
		String nome;
		boolean sounds;
		
		List<Animal> list = new ArrayList<>();
		for(c=0;c<3;c++) {
			System.out.println("What's the animal? ");
			nome = kb.next().toUpperCase();
			System.out.println("Does it emit sounds? [true/false] ");
			sounds = kb.nextBoolean();
			
				list.add(new Animal(nome, sounds));
		}
		System.out.print("\n\n");
		for(Animal animal: list) {
			System.out.println(animal.getNome()+"-->emit sounds: "+animal.isEmiteSom());	
		}
		
		
		kb.close();
	}

}
