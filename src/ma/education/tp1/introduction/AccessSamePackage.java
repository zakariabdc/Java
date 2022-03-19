package ma.education.tp1.introduction;

public class AccessSamePackage {
    public static void main(String[] args) {
        Salle A = new Salle("Salle A");

        System.out.println(A.id); //0
        System.out.println(A.nom); //Salle A
    }
}
