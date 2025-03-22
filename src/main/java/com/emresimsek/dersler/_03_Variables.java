package com.emresimsek.dersler;

public class _03_Variables {
    public static void main(String[] args) {

        // Değişken, bir değeri bellekte saklayan bir isimlendirmedir.
        // Her değişken bir veri türüne bağlıdır.

        int age = 25;        // "age" bir değişkendir, türü "int"


        // Değişken isimlerdirme kuralları nelerdir?
        // A- Best Practices
        // Java'da değişken isimlendirme için camelCase yöntemi kullanılır. Değişken adları küçük harf ile başlar ve eğer birden fazla kelime içeriyorsa, sonraki kelimelerin ilk harfi büyük yazılır.
        int studentAge = 18;  // Geçerli ve okunabilir


        // B- Syntax
        // - Boşluk kullanılamaz.
        // - Rezerve edilmiş anahtar kelimeler kullanılamaz.
        // - Büyük/küçük harfler farklı karakterler olarak kabul edilir. myVariable ve MyVariable farklı değişkenlerdir.
        // - İsimlerin uzunluğu ile ilgili sınırlama yoktur, ancak çok uzun isimlerden kaçınılmalıdır.
        // -Harf, Rakam, Alt Çizgi veya Dolar işareti kullanılabilir.  Ancak bir rakam ile başlayamaz.

        int myVariable = 5;  // Geçerli
        int $value = 10;     // Geçerli
        int _number = 15;    // Geçerli
        // int 1count = 20;  // HATALI - Rakam ile başlayamaz








    }
}
