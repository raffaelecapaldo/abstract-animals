package org.lessons.animals;

import org.lessons.animals.abs.Animale;
import org.lessons.animals.interf.INuotante;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("clic clic");
	}

	@Override
	public void mangia() {
		System.out.println("Il delfino sta mangiando un pesce");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
