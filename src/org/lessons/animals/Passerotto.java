package org.lessons.animals;

import org.lessons.animals.abs.Animale;
import org.lessons.animals.interf.IVolante;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("cip cip");
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto sta mangiando un verme");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
