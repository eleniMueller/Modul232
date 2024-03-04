package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * M232_rekursiv_ausprobieren
 * org.example
 *
 * @author Eleni
 * @version 04.03.2024
 */
public class UngeradeZahlenBisN {
    public static void main(String[] args) {
        int n = 13;
     //  ungeradeZahlenBisN(n);
        System.out.println(ungeradeZahlenRekursiv(10));
    }

//   public static int ungeradeZahlenBisN(int n) {
//       for (int i = 0; i <= n; i++) {
//           if (i % 2 != 0) {
//               System.out.println(i);
//           }
//       }
//       return n;
//   }

    public static int ungeradeZahlenRekursiv(int n){
        if (n == 0){
            return 0;
        }
        if (n % 2 != 0){
            System.out.println(n);
        }
        return ungeradeZahlenRekursiv(n-1);
    }
}
