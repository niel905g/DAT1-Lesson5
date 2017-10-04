package dk.niel905g;
import java.util.*;

public class KatteInternatet {
    public static void main(String[] args) {
        System.out.println("Hello internat");

        Kat kat1; //Deklarer variablen
        kat1 = new Kat("Garfield"); //Initierer variablen
        kat1.sov();
        kat1.setAlder(3);
        kat1.hvorGammel();


        Kat kat2; //Deklarer variablen
        kat2 = new Kat("Misser"); //Initierer variablen
        kat2.sov();
        kat2.setAlder(2);

        Kat kat3; //Deklarer variablen
        kat3 = new Kat("Pølse"); //Initierer variablen
        kat3.hop();
        kat3.setAlder(1);


       // Hund hund1; //Deklarer variablen
       // hund1 = new Hund("Fido"); //Initiates the variable

        //hund1.setNbrOfLegs(4);

        Hund hund2; //Deklarer variablen
        hund2 = new Hund("Viggo", 10); //Initiates the variable


        Enum_colors n, l, d, e, f, g, s, y, w;
        n = Enum_colors.black;
        l = Enum_colors.blue;
        d = Enum_colors.red;
        e = Enum_colors.cream;
        f = Enum_colors.blackT;
        g = Enum_colors.blueT;
        s = Enum_colors.silver;
        y = Enum_colors.golden;
        w = Enum_colors.white;

        System.out.println("\n The main color of the cat is " + n );
        System.out.println(" The dog and the cat has a strange color: " + y );
        System.out.println(" The cat has the colors: " + n + ", "+ e + " and " + w);



        // En lækker anvendelse af Dato klassen
        Date dato = new Date();
        System.out.println(dato.toString());
        // Her kan du se, hvorn kan man gøre datoen til dansk
        // http://www.linuxbog.dk/java/bog/java-i18n-formatering-dato.html

        // En lækker anvendelse af Random klassen
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
        // Her kan du se, hvordan vi kan lave tilfældige numre
        // https://www.tutorialspoint.com/java/lang/math_random.htm

    }
}
