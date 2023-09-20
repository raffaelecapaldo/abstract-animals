package org.lessons.animals;

import org.lessons.animals.abs.Animale;

public class Cane extends Animale {

	@Override
	public void verso() {
		System.out.println("Bau bau!");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il cane sta mangiando crocchette al pollo");
		
	}

	
}
