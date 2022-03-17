package td2bis;

 public class Voyage {

	public Voyage() {
		this.villeDep = "";
		this.villeArr = "";
	}
	
	
	
	public Voyage(String villeDep, String villeArr, double longueur, double prix) {
		this.villeDep = villeDep;
		this.villeArr = villeArr;
		this.longueur.setVal(longueur);
		this.prix.setVal(prix);
	}
	
	
	public String getVilleDep() {return this.villeDep;}
	public String getVilleArr() {return this.villeArr;}
	public double getLongueur() {return this.longueur.getVal();}
	public double getPrix() {return this.prix.getVal();}
	
	
	public void setLongueur(double longueur) {this.longueur.setVal(longueur);}
	public void setPrix (double prix) {this.prix.setVal(prix);}
	
	
	
	public double prixTotal() {
		return(getPrix() * getLongueur());
	}
	
	
	public Voyage prixPetit(Voyage voyageComp) {
		
		Voyage voyageZero = new Voyage();
		
		if(this.getVilleArr() .equals(voyageComp.getVilleArr()) && this.getVilleDep() .equals(voyageComp.getVilleDep())) {
			if(Double.compare(this.prixTotal(), voyageComp.prixTotal()) <0) {
				
				System.out.println(" Le voyage le moins cher est le voyage 1 avec un prix total de :"+ this.prixTotal());
				return this;
			}
			
			else if(Double.compare(this.prixTotal(), voyageComp.prixTotal()) >0) {
				
				System.out.println(" Le voyage le moins cher est le voyage 1 avec un prix total de :"+ voyageComp.prixTotal());
				return voyageComp;
			}
			else {
				System.out.println("Les deux prix sont identiques");
				return voyageZero;
			}
				
			
		}
		else {
			System.out.println("Les villes de depart et d'arrivee sont differentes");
			return voyageZero;
		}
	}
	
	
	
	
	
	
	public void affiche() {
		System.out.println("Ville de depart: "+ getVilleDep());
		System.out.println("Ville d arrivee: "+ getVilleArr());
		System.out.println("Longueur du voyage: "+ getLongueur());
		System.out.println("Prix au km: "+ getPrix());
	}
	
	private String villeDep;
	private String villeArr;
	private ReelContraint longueur = new ReelContraint(1, 30000);
	private ReelContraint prix = new ReelContraint(0.05, 3.2);
}






