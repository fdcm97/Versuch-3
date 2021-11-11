package se1c3;

public class KfzV0 {
	private int sitze;
	private int tankInhalt;
	public float verbrauch;
	
	public KfzV0(int sitze, int tankInhalt, float verbrauch) {
		
		this.sitze = sitze;
		this.tankInhalt = tankInhalt;
		this .verbrauch = verbrauch;
	}
	
	public float reichweite() {
		return(tankInhalt*100)/verbrauch;
	}
	
	public float spritVerbrauch(int km) {
		return(km*verbrauch)/100;
	}

}
