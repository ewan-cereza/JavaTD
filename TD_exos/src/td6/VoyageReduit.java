package td6;

public class VoyageReduit extends Voyage{

	
	public VoyageReduit(String villeDepartIn, String villeArriveeIn, double longueurIn, double prixIn, double promo) {
		super(villeDepartIn, villeArriveeIn, longueurIn, prixIn);
		tauxPromotion.setVal(promo);
	}
	
	
	private ReelContraint tauxPromotion = new ReelContraint (0.01,0.99);
}
