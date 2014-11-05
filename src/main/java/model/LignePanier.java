package model;

import java.math.BigDecimal;

public class LignePanier {
	
	private Droid droid;
	private int nbDroids;
	
	public LignePanier(Droid droid, int nbDroids) { 
		this.droid = droid;
		this.nbDroids = nbDroids;
	}
	
	public BigDecimal getTotal() {
		return BigDecimal.valueOf(droid.getPrice()).multiply(BigDecimal.valueOf(nbDroids));
	}
	
	public BigDecimal getTotalRound() {
		return getTotal().setScale(2, BigDecimal.ROUND_DOWN);
	}
	
	public int getNbDroids() {
		return nbDroids;
	}
	
	public Droid getDroid() {
		return droid;
	}
	
	public String getStatus() {
		return "En Stock";
	}

	public void updateNbDroid(int _nbDroid) {
		int dif = _nbDroid - nbDroids;
		if(dif <= droid.getQuantityAvailable())
		{
			this.nbDroids = _nbDroid;
			droid.addReserve(dif);
		}
	}
}