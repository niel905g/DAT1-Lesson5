package dk.niel905g;

public class Hund {

        String navn = "";
        int alder = 0;


        Hund(String newNavn, int newAlder){
            navn = newNavn;
            alder = newAlder;
        }

        String getNavn(){
            return navn;
        }

        int getHundeAlder() {
            return alder;
        }

    }
