package org.example;

/**
 * M232_rekursiv_ausprobieren
 * org.example
 *
 * @author Eleni
 * @version 26.02.2024
 */
public class reverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}