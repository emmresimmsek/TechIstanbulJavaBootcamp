package com.emresimsek.dersler;

public class _04_ArithmeticOperators {
    public static void main(String[] args) {


        int x = 10;
         int y = 5;

         // Addition (Toplama)
         System.out.println( x + y);

         // Subtraction (Çıkarma)
        System.out.println( x - y);

         // Multiplication (Çarpma)
        System.out.println( x*y);

         // Division (Bölme)
        System.out.println(x/y);

         //Modulus (Kalan Bulma)
        System.out.println(x%y);

        // (++) ve (--)
        int z = 5;

        System.out.println("Postfix Kullanımı: " + z++); // Önce 5 yazdırılır, sonra x = 6 olur
        System.out.println("Şu anki x değeri: " + z); // x artık 6 oldu
        System.out.println("Prefix Kullanımı: " + ++z);

        int number = 10;

        System.out.println("Postfix Kullanımı:" + number--); // 10
        System.out.println(number); //9
        System.out.println("Prefix Kullanımı:" + --number); // 8














    }
}
