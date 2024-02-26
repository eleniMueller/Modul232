package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        QuickSort qs = new QuickSort();

        //qs.sort(new int[] { 12, 6, 31, 83, 2 });

        reverseString rs = new reverseString();
        //System.out.println(rs.reverseString("sugus"));

        GroessterGemeinsamerTeiler ggt = new GroessterGemeinsamerTeiler();
        int result = ggt.berechneGGT(125,6);
        System.out.println(result);
    }
}
