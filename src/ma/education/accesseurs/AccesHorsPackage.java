package ma.education.accesseurs;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
    public void afficher(Salle s) {
        System.out.println(s.id);
        System.out.println(s.nom);
        System.out.println(id);
        System.out.println(nom);
    }
    public static void main(String[] args) {
        Salle B = new Salle("Salle B");

        System.out.println(B.id);//0
        System.out.println(B.nom);//Salle B
        }
}
