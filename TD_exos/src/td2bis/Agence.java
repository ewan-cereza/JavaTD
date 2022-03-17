package td2bis;

public class Agence {

	
	public static void main(String[] args) {
		
		
		/*test methodes voyage*/
		
		Voyage testVoyage1 = new Voyage("Annecy","Venise",1000,3);
		Voyage testVoyage2 = new Voyage("Annecy","Venise",3000, 2.5);
		
		testVoyage1.affiche();
		testVoyage2.affiche();
		
		/*test prix total*/
		testVoyage1.prixTotal();
		System.out.println(testVoyage1.prixTotal());
		
		/*test comp prix*/
		
		testVoyage1.prixPetit(testVoyage2);
		
	}
}
