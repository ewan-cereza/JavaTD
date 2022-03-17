package td4;

/**
 * Création et gestion du tableau contenant les étudiants
 * @author Florian Hauwelle
 * @author Ewan Cereza
 * @version JDK 17.0.1
 */
public class RepertoireEtudiants {
    
    private final int nbMax;
    private int nbE = 0;
    private Etudiant etudiants[];
    
    /**
     * Initialisation du tableau avec sa taille max
     * @param nbMax taille max du tableau
     */
    public RepertoireEtudiants(int nbMax) {
        if (nbMax <= 0) {
            this.nbMax = 1;
        }
        else {
            this.nbMax = nbMax;
        }
        this.etudiants = new Etudiant[nbMax];
    }
    
    /**
     * Vérifie la possibilité d'ajout dans le tableau + association de l'objet
     * en paramètre à l'indice suivant dans le tableau
     * @param e objet étudiant
     * @return si l'ajout a fonctionné ou non
     */
    public boolean ajouteEtudiant(Etudiant e) {
        if (this.nbE >= nbMax) {
            return false;
        }
        else {
            etudiants[this.nbE] = e;
            this.nbE ++;
            return true;
        }
    }
    
    /**
     * Getter du nombre d'étudiants dans le tableau
     * @return nombre d'étudiants dans le répertoire/tableau
     */
    public int getNbEtudiant() { return this.nbE ; }
    
    /**
     * Parcours le tableau jusqu'à trouver le numéro étudiant passé en paramètre
     * @param numeroEtu le numéro étudiant recherché
     * @return le nom de l'étudiant s'il est dans le tableau
     */
    public String getNom(int numeroEtu) {
        int i = 0;
        
        while(i < this.nbE && this.etudiants[i].getNumero() != numeroEtu) { i++ ; }
        
        if(i == this.nbE) {
            return null;
        }
        else {
            return etudiants[i].getNom();
        }
    }
    
    /**
     * 
     * @param nom
     * @return le numéro d'étudiant
     */
    public int getNumero(String nom) {
        int i = 0;
        
        while(i < this.nbE && !(this.etudiants[i].getNom().toLowerCase().equals(nom.toLowerCase()))) { i++ ; }
        
        if(i == this.nbE) {
            return -1;
        }
        else {
            return etudiants[i].getNumero();
        }
    }
    
    /**
     * Parcours le tableau jusqu'à trouver l'objet étudiant à supprimer 
     * @param e objet étudiant
     * @return si la suppression a fonctionné ou non
     */
    public boolean supprimeEtudiant(Etudiant e) {
        int i = 0;
        
        while (i < this.nbE && this.etudiants[i].getNumero() != e.getNumero()) { i++ ; }
        
        if(i == nbE) {
            return false;
        }
        else {
            for(int j = i; j < this.nbE - 1; j++) {
                this.etudiants[j] = this.etudiants[j+1];
            }
            nbE--;
            return true;
        }
    }
    
}
