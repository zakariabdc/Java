package ma.education.tp4.abstractkeyword;

public class Test {
    public static void main(String[] args) {
        //Cannot be instantiated FormeGeometrique f1 = new FormeGeometrique();
        //Cannot be instantiated FormeGeometrique f2 = new FormeGeoTypeA();
        FormeGeometrique f3 = new Triangle();
        FormeGeometrique f4 = new FormeGeometrique() {
            @Override
            public double calculerSurface() {
                return 22;
            }
        };
    }
}
