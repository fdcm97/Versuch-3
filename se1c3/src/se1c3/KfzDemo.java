package org.hsd.inflab.se1c3;

public class KfzDemo {

	public static void main(String[] args) {
		KfzV0 minivan = new KfzV0 (6, 70, 14);
		KfzV0 sportwagen = new KfzV0 (2, 45, 11);
		Lkw magirus =new Lkw(2, 45, 11, 4, true);
		
		KfzV0 auto;
		
		auto = sportwagen;
		
		System.out.println("Der Minivan kann " + minivan.reichweite() +" Kilometer weit fahren.");
		System.out.println("Der Sportwagen kann " + sportwagen.reichweite() +" Kilometer weit fahren.");
		
		System.out.println("\nDer Spritverbrauch beträgt " + minivan.spritVerbrauch(252) +" Liter auf 100km.");
		System.out.println("\nDer Spritverbrauch beträgt " + auto.spritVerbrauch(252) +" Liter auf 100km.");
		auto = magirus;
		System.out.println("Der Spritverbrauch des Lkw mit Sportwagenstatus beträgt " + auto.spritVerbrauch(252) +" Liter auf 100km.");

	}
	
		
	

}
