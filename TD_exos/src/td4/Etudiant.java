package td4;

/**
 *
 * @author Florian Hauwelle
 * @author Ewan Cereza
 * 
 */
public class Etudiant {
    
    private static int nbEtudiant; 
    private String prenom, nom;
    private int num;
    
    public Etudiant(String prenom, String nom) {
        nbEtudiant++;
        
        this.num = nbEtudiant;
        this.prenom = prenom;
        this.nom = nom;
    }
    
    public String getPrenom() { return this.prenom ; }

    public String getNom() { return this.nom ; }

    public int getNumero() { return this.num ; }
    

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
}