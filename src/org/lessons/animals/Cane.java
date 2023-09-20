package org.lessons.animals;

import org.lessons.animals.abs.Animale;
import org.lessons.animals.interf.INuotante;

public class Cane extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Bau bau!");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il cane sta mangiando crocchette al pollo");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
		
	}

	
}
