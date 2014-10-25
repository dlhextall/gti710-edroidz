package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Panier{
	
	private List<LignePanier> listLignePanier;
	private static double TAUX_TPS = 0.05;
	private static double TAUX_TVQ = 0.09975;
	
	public Panier() {
		clearPanier();
	}
		
	public List<LignePanier> getListLignePanier() {
		return listLignePanier;
	}
	
	public void clearPanier() {
		listLignePanier = new ArrayList<LignePanier>();
	}
	
	public void addLignePanier(Droid droid, int nbDroids) {
		LignePanier ligne = new LignePanier(droid, nbDroids);
		listLignePanier.add(ligne);
	}
	
	public void removeLignePanier(int indexLigne) {
		listLignePanier.remove(indexLigne);
	}

	public BigDecimal getSousTotal() {
		BigDecimal sousTotal = new BigDecimal(0);		
		for (LignePanier lignePanier : listLignePanier) {			
			sousTotal = sousTotal.add(lignePanier.getTotal());			
		}		
		return sousTotal;
	}
	
	public BigDecimal getSousTotalRound() {
		return getSousTotal().setScale(2, BigDecimal.ROUND_DOWN);
	}
	
	public BigDecimal getTps() {
		return getSousTotal().multiply(BigDecimal.valueOf(TAUX_TPS));
	}
	
	public BigDecimal getTpsRound() {
		return getTps().setScale(2, BigDecimal.ROUND_DOWN);
	}
	
	public BigDecimal getTvq() {
		return getSousTotal().multiply(BigDecimal.valueOf(TAUX_TVQ));
	}
	
	public BigDecimal getTvqRound() {
		return getTvq().setScale(2, BigDecimal.ROUND_DOWN);
	}
	
	public BigDecimal getPrixTotal() {
		return getSousTotal().add(getTps()).add(getTvq());
	}
	
	public BigDecimal getPrixTotalRound() {
		return getPrixTotal().setScale(2, BigDecimal.ROUND_DOWN);
	}
	
	public boolean isEmpty() {
		return listLignePanier.isEmpty();
	}
}