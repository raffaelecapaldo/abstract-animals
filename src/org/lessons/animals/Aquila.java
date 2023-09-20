package org.lessons.animals;

import org.lessons.animals.abs.Animale;

public class Aquila extends Animale {

	@Override
	public void verso() {
		System.out.println("screeeeech");
	}

	@Override
	public void mangia() {
		System.out.println("L'aquila sta mangiando un uccellino");
		
	}

}
