package se1c3;

public class Lkw extends KfzV0 {
	
	private int ladeFlaeche;
	private boolean hatAnhaenger;
	public Lkw( int sitze, int tankInhalt, float verbrauch, int ladeFlaeche, boolean hatAnhaenger) {
		super(sitze, tankInhalt, verbrauch);
		this.ladeFlaeche = ladeFlaeche;
		this.hatAnhaenger = hatAnhaenger;
	}
	
	@Override
	public float spritVerbrauch (int km) {
		return ((km*verbrauch)/100)+1;
	}

}
