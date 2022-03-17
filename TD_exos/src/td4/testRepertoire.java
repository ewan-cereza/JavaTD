package td4;

/**
 *
 * @author Florian Hauwelle
 * @author Ewan Cereza
 *
 */
public class testRepertoire {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        Etudiant etu1 = new Etudiant("Florian", "Hauwelle");
        Etudiant etu2 = new Etudiant("Ewan", "Cereza");
        Etudiant etu3 = new Etudiant("Vincent", "Vidal");
        Etudiant etu4 = new Etudiant("Sami", "Zammit");
        Etudiant etu5 = new Etudiant("Alix", "Bernardo");
        Etudiant etu6 = new Etudiant("Lost", "Ark");
        
        System.out.println(etu1.getNumero() + " " + etu1.getNom() + " " + etu1.getPrenom());
        System.out.println(etu3.getNumero() + " " + etu3.getNom() + " " + etu3.getPrenom());
        System.out.println(etu5.getNumero() + " " + etu5.getNom() + " " + etu5.getPrenom());
        
        etu1.setNom("Beroujon");
        etu1.setPrenom("Marie");
        System.out.println(etu1.getNumero() + " " + etu1.getNom() + " " + etu1.getPrenom());
        
        RepertoireEtudiants aspe = new RepertoireEtudiants(22);
        
        System.out.println(aspe.ajouteEtudiant(etu6));
        System.out.println(aspe.ajouteEtudiant(etu2));
        System.out.println(aspe.ajouteEtudiant(etu3));
       
        System.out.println(aspe.getNom(8));
        System.out.println(aspe.getNom(2));
        
        System.out.println(aspe.getNbEtudiant());
        
        System.out.println(aspe.getNumero("Ark"));
        
        System.out.println(aspe.supprimeEtudiant(etu4));
        System.out.println(aspe.supprimeEtudiant(etu3));  
    }
    
}