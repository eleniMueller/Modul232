package org.example;

/**
 * M232_rekursiv_ausprobieren
 * org.example
 *
 * @author Eleni
 * @version 04.03.2024
 */
public class NerReihe {
    public static void main(String[] args) {
        //  viererreihe();
        System.out.println("------------------");
        //   nerreihe(5);

        viererreiheRekursiv(1);
        System.out.println("----------------");
        nreiheRekursiv(1, 5);
    }

    //   public static void viererreihe() {
    //       for (int i = 1; i <= 10; i++) {
    //           System.out.println(i*4);
    //       }
    //   }

//   public static void nerreihe(int n) {
//       for (int i = 1; i <= 10; i++) {
//           System.out.println(i*n);
//       }
//   }

    public static void viererreiheRekursiv(int n) {
        if (n <= 10) {
            System.out.println(n * 4);
            viererreiheRekursiv(n + 1);
        }
    }

    public static void nreiheRekursiv(int n, int i) {
        if (n <= 10) {
            System.out.println(n * i);
            nreiheRekursiv(n + 1, i);
        }

    }
}



