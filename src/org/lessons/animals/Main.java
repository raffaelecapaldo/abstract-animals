package org.lessons.animals;

public class Main {

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

	}

}
