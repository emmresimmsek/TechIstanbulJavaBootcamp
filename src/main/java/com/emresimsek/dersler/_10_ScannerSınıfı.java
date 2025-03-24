package com.emresimsek.dersler;
import java.util.Scanner;  // Scanner sınıfını içe aktar

public class _10_ScannerSınıfı {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Scanner nesnesi oluştur


        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();  // Kullanıcıdan sayı al

        scanner.nextLine();// **TAMPONU TEMİZLEMEK İÇİN EKLENDİ!**

        System.out.print("Aldığınız eğitimi girin: ");
        String edu = scanner.nextLine();

        System.out.println("Aldığınız eğitim: " + edu  );
        System.out.println("Girdiğiniz sayı: " + sayi);


        scanner.close();  // Scanner'ı kapat



    }
}
