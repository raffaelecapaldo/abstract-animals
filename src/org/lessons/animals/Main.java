package org.lessons.animals;

import org.lessons.animals.interf.INuotante;
import org.lessons.animals.interf.IVolante;

public class Main {
	
	static void faiVolare(IVolante animale) {
		animale.vola();
	}
	static void faiNuotare(INuotante animale) {
		animale.nuota();
	}


	public static void main(String[] args) {
		
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		//Senza array per mostrare cosa ho imparato dall'esercizio
		cane.verso();
		cane.mangia();
		cane.dormi();
		
		System.out.println("\n-----------------------\n");
		
		passerotto.verso();
		passerotto.mangia();
		passerotto.dormi();
		
		System.out.println("\n-----------------------\n");

		
		aquila.verso();
		aquila.mangia();
		aquila.dormi();
		
		System.out.println("\n-----------------------\n");

		
		delfino.verso();
		delfino.mangia();
		delfino.dormi();

		System.out.println("\n-----------------------\n");
		System.out.println("Metodi");
		
		System.out.print("Passerotto: ");
	    faiVolare(passerotto);
	    System.out.print("Aquila: ");
	    faiVolare(aquila);
	    System.out.print("Delfino: ");
	    faiNuotare(delfino);
	    System.out.print("Cane: ");
	    faiNuotare(cane);


	    
		
		
	}

}
