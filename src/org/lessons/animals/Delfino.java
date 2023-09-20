package org.lessons.animals;

import org.lessons.animals.abs.Animale;

public class Delfino extends Animale {

	@Override
	public void verso() {
		System.out.println("clic clic");
	}

	@Override
	public void mangia() {
		System.out.println("Il delfino sta mangiando un pesce");
		
	}

}
