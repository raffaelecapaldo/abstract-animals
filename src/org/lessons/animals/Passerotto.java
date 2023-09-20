package org.lessons.animals;

import org.lessons.animals.abs.Animale;

public class Passerotto extends Animale {

	@Override
	public void verso() {
		System.out.println("cip cip");
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto sta mangiando un verme");
	}

}
