package org.example;

/**
 * M232_rekursiv_ausprobieren
 * org.example
 *
 * @author Eleni
 * @version 26.02.2024
 */
public class GroessterGemeinsamerTeiler {
        public  int berechneGGT(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return berechneGGT(b, a % b);
            }
        }

        public void main(String[] args) {
            int zahl1 = 24;
            int zahl2 = 36;
            int ggt = berechneGGT(zahl1, zahl2);
            System.out.println("Der größte gemeinsame Teiler von " + zahl1 + " und " + zahl2 + " ist: " + ggt);
        }


}
