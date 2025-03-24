package com.emresimsek.dersler;

public class _08_MathKütüphanesi {
    public static void main(String[] args) {

        //Math.min() ve Math.max() Kullanımı
        System.out.println("En küçük " + Math.min(10, 20)); //İki sayıdan küçük olanı döndürür
        System.out.println("En büyük " + Math.max(10, 20)); //İki sayıdan büyük olanı döndürür

        // Math Sınıfındaki Sabitler
        System.out.println("Pi Sayısı: " + Math.PI);
        System.out.println("Euler Sayısı: "+ Math.E);

        // Rastgele Sayı Üretme
        System.out.println(Math.random()); //0.0 ile 1.0 arasında rastgele sayı üretir

        //Mutlak Değer
        System.out.println(Math.abs(-10));

        //Yuvarlama İşlemleri
        System.out.println(Math.floor(10.5)); // Aşağı yuvarlama
        System.out.println(Math.ceil(4.3)); // Yukarı  yuvarlama

        //Üs ve Karakök Alma
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(16));









    }
}
