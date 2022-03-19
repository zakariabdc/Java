package ma.education.tp2.statickeyword;

public class Etudiant {
    public long id;//oui
    public String nom;//oui
    public static int nbEtudiants;//non

    public Etudiant(long id,String nom,int nb){
        this.id=id;
        this.nom=nom;
        nbEtudiants+=nb;
    }
}
