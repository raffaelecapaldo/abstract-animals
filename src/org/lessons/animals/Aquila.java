package org.lessons.animals;

import org.lessons.animals.abs.Animale;
import org.lessons.animals.interf.IVolante;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("screeeeech");
	}

	@Override
	public void mangia() {
		System.out.println("L'aquila sta mangiando un uccellino");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
