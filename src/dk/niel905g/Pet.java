package dk.niel905g;

public class Pet {
// TEST-klasse!
        public static void main(String[] args) {
            System.out.println("Hello Mr. Pet"); // Test


            Hund hund1 = new Hund("Fido", 3);
            System.out.println(hund1.getNavn() + " er " + hund1.getHundeAlder() + " gammel!");

            System.out.println("");


        }
    }