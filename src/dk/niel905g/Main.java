package dk.niel905g;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Carpenter!");


        Bord bord1 = new Bord();
        Bord bord2 = new Bord();
        Bord bord3 = new Bord();

        bord1.setMateriale("Wood");
        System.out.println("Bord1 is made of " + bord1.getMateriale() + ".");

        bord2.setMateriale("Steel");
        System.out.println("bord2 is made of " + bord2.getMateriale() + ".");

        bord3.setMateriale("Transparent Glass");
        System.out.println("bord3 is made of " + bord3.getMateriale() + ".");

        bord1.setAntalBordBen(10);
        System.out.println("Bord1 has " + bord1.getAntalBordBen() + " legs.");

    }
}
