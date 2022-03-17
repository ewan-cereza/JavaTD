package td6;

import java.util.Scanner;
public class Voyage
{
    Scanner input = new Scanner(System.in);
    public Voyage()
    {
      this.villeDepart = "";
      this.villeArrivee = "";
    }

    public Voyage(String villeDepartIn, String villeArriveeIn, double longueurIn, double prixIn)
    {
        this.villeDepart = villeDepartIn;
        this.villeArrivee = villeArriveeIn;
        this.longueur.setVal(longueurIn);
        prix.setVal(prixIn);
    }

    public void copieSuperficiellePerso (Voyage temp)
    {
      this.villeDepart=temp.villeDepart;
      this.villeArrivee=temp.villeArrivee;
      this.longueur.setVal(temp.longueur.getVal());
      this.prix.setVal(temp.longueur.getVal());
    }
    public boolean equals(Voyage temp)
    {
      if(this.getVilleDepart ()==temp.getVilleDepart() &&
          this.getVilleArrivee ()==temp.getVilleArrivee() &&
          this.getlongueur()==temp.getlongueur()&&
          this.getprix()==temp.getprix())
      {
        return (true);
      }
      else
      {
        return(false);
      }
    }
    /*  getters */

    public String getVilleDepart()
    {
        return this.villeDepart;
    }

    public String getVilleArrivee()
    {
        return this.villeArrivee;
    }

    public double getlongueur()
    {
        return this.longueur.getVal();
    }

    public double getprix()
    {
        return this.prix.getVal();
    }

    public Voyage longPlusPetitQue (Voyage voyageComp)
    {
        Voyage videVoyage = new Voyage();
        if(this.getVilleArrivee()== voyageComp.getVilleArrivee() && this.getVilleDepart()== voyageComp.getVilleDepart()) {
            if (Double.compare(this.getlongueur(),voyageComp.getlongueur())<0)
            {/*this est le plus court*/
                /*System.out.println("Le voyage le plus court est :");
                this.affiche();*/
                return this;
            }
            else if (Double.compare(this.getlongueur(),voyageComp.getlongueur())>0)
            {/* voyageComp est le plus court*/
                /*System.out.println("Le voyage le plus court est :");
                voyageComp.affiche();*/
                return voyageComp;
            }
            else
            {/*retoune par defaut this*/
                System.out.println("Les deux distances sont identiques");
                return videVoyage;
            }
        }
        else
        {
            System.out.println("Les villes de depart ou d'arrivee sont differentes");
            return videVoyage;
        }
    }
    /*  Voyage temp = voyage1.longPlusPetitQue(voyageComp).copieSuperficielle  */
    public double prixTotal ()
    {
        return(this.getlongueur()*this.getprix());
    }

    public Voyage prixPlusPetitQue (Voyage voyageComp)
    {
      Voyage videVoyage = new Voyage();
      if(this.getVilleArrivee()== voyageComp.getVilleArrivee() && this.getVilleDepart()== voyageComp.getVilleDepart()) {
        if (Double.compare(this.prixTotal(),voyageComp.prixTotal())<0) {
            System.out.println("Le voyage le moins cher est :");
            this.affiche();
            System.out.println("avec un prix total de : " + this.prixTotal());
            return this;
        } else if (Double.compare(this.prixTotal(),voyageComp.prixTotal())>0){
            System.out.println("Le voyage le moins cher est :");
            voyageComp.affiche();
            System.out.println("avec un prix total de : " + voyageComp.prixTotal());
            return voyageComp;
        }else{
            System.out.println("Les deux prix sont identiques");
            return videVoyage;
        }
      }
      else
      {
        System.out.println("Les villes de depart ou d'arrivee sont differentes");
        return videVoyage;
      }
    }

    /* Setters */
    public void setLongueur (double longuerIn) {
        this.longueur.setVal(longuerIn);
    }

    public void setPrix (double prixIn){
        this.prix.setVal(prixIn);
    }

    public void affiche()
    {
        System.out.println("Ville depart: "+ this.getVilleDepart());
        System.out.println("Ville Arrivee: "+ this.getVilleArrivee());
        System.out.println("Longueur : "+ this.getlongueur());
        System.out.println("Prix : "+this.getprix());
    }
    
    public void saisir() {
    	System.out.println("Souhaitez-vous saisir la ville de depart : (yes/no) ");
    	if (input.nextLine().equalsIgnoreCase("yes")) {
    		System.out.println("Entrez la ville de depart : ");
    		villeDepart = input.nextLine();
    	}
    	System.out.println("Souhaitez-vous saisir la ville d'arrivée : (yes/no) ");
    	if (input.nextLine().equalsIgnoreCase("yes")) {
    		System.out.println("Entrez la ville d'arrivée : ");
    		villeArrivee = input.nextLine();
    	}
    	System.out.println("Souhaitez-vous entrez la longueur du voyage : (yes/no");
    	if(input.nextLine().equalsIgnoreCase("yes")) {
    		System.out.println("Entrez la longueur du voyage : ");
    		longueurSaisie = input.nextDouble();
    		this.longueur.setVal(longueurSaisie);
    	}
    	
    }

    private String villeDepart;
    private String villeArrivee;
    private double longueurSaisie;
    //initilisation explicite
    private ReelContraint longueur = new ReelContraint(1,30000);
    private ReelContraint prix = new ReelContraint(0.05,3.2);
}
