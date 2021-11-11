package se1c3;

public class Kfz {
	private int sitze;
	private int tankInhalt;
	public float verbrauch;
	
	public Kfz(int sitze, int tankInhalt, float verbrauch) {
		
		this.sitze = sitze;
		this.tankInhalt = tankInhalt;
		this .verbrauch = verbrauch;
	}
	
	public Kfz(int sitze2, int tankInhalt2, int verbrauch2) {
		// TODO Auto-generated constructor stub
	}

	public float reichweite() {
		return(tankInhalt*100)/verbrauch;
	}
	
	public float spritVerbrauch(int km) {
		return(km*verbrauch)/100;
	}

}
