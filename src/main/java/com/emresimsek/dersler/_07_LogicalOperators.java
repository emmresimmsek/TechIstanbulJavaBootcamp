package com.emresimsek.dersler;

public class _07_LogicalOperators {
    public static void main(String[] args) {



        int a = 40, b = 20, c = 10;

        // Her iki koşul doğruysa sonuç "true" döner
        if (a > b  &&  c < b ) {

            System.out.println( "DOĞRU");

        } else {

            System.out.println("YANLIŞ");
        }

        int age = 25;
        boolean isStudent = true;

        // En az bir koşul doğruysa sonuç "true" döner.
        if (age < 18 || isStudent) {
            System.out.println("Koşul doğru!"); // Çıktı: Koşul doğru!
        }


        boolean isRaining = true;

        // NOT operatörü sonucu tersine çevirir
        if (!isRaining) {
            System.out.println("Hava güzel!"); // Bu çalışmaz
        } else {
            System.out.println("Yağmur yağıyor!"); // Çıktı: Yağmur yağıyor!
        }















    }
}
