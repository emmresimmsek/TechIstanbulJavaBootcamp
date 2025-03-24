 # Java ile Yazılım Geliştirme Bootcamp Programı 
 *İstanbul Büyükşehir Belediyesi* - *Eğitmen: Hamit Mızrak* - *2025*

[Github](https://github.com/emmresimmsek/TechIstanbulJavaBootcamp.git) - 
[IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows)


## 1: PascalCase
**PascalCase**, birden çok kelimeden oluşan adların birleştirilirken her kelimenin baş harfinin büyük yazıldığı bir yazım stilidir.
Java'da sınıflar bu şekilde adlandırılır. 

Örneğin; MyClassName, CalculateTotal

## 2: Yorumlar
Java'da yorumlar, kodun herhangi bir kısmı için açıklama yazmak veya kodun çalışmasını engellemeden notlar almak için kullanılır. Java'da **üç çeşit yorum** bulunmaktadır:
### a. Tek Satırlık Yorumlar 
Bu yorum türü, yalnızca bir satır üzerinde yorum yazmak için kullanılır. `//` ile başlayan bir yorum, satırın sonuna kadar devam eder ve derleyici tarafından dikkate alınmaz
### b. Çok Satırlı Yorumlar
Birden fazla satırda yorum yapmak gerektiğinde kullanılır. Çok satırlı yorumlar `/*` ile başlar ve `*/` ile biter. Aradaki tüm metinler yorum olarak kabul edilir.
### c. Belgelendirme Yorumları 
Bu yorum türü, **JavaDoc** belgeleri oluşturmak için kullanılır. `/**` ile başlar ve `*/` ile biter. Bu tür yorumlar, sınıfları, metotları veya değişkenleri açıklamak için kullanılır ve genellikle Java'nın belge üretme aracı olan `javadoc` ile kullanılarak API dokümantasyonu oluşturulur.

## 3: Veri Türleri (Data Types)
Java'da veri türleri (**data types**) iki ana kategoriye ayrılır: **ilkel (primitive) veri tipleri** ve **referans (reference) veri tipleri**. Bu veri tipleriyle değişkenlerin türlerini tanımlar ve bellek kullanımı ile işlemleri optimize ederiz.

## 4: Variables (Değişkenler)
**Değişken**, **bir değeri bellekte saklayan bir isimlendirmedir**.
Değişkenler, veri tutmak için kullanılır ve bir **veri türü ile tanımlanır**. Yani her değişken **bir veri türüne bağlıdır.**
Veri tipi, değişkenin saklayabileceği verinin türünü belirler ve bellekte o veri için rezerv edilen alanın büyüklüğünü tanımlar.


(veri_türü) (değişken_adi) = değer;
- veri_türü: Değişkenin hangi türde veri tutacağını belirtir.
- değişken_adı: Değişken adı, veriyi saklayacağınız isimdir.
- değer: Değişkene atanan değerdir.


Veri türü ve değişken, farklı sorumluluklar taşır ancak birlikte kullanılarak programın temel taşlarını oluştururlar.

## 5: Operators (Operatörler)
### a. Aritmetic Operators 
Java'da aritmetik operatörler, matematiksel işlemler yapmak için kullanılır. Bunlar, toplama (+), çıkarma (-), çarpma (*), bölme (/) ve modül (%) gibi işlemleri içerir.
Bu operatörlere ilave olarak (++) ve (--) operatörleri bulunur.
### b. Assignment Operators
Java'da **atama operatörleri** bir değişkene değer veya başka bir ifadeden oluşan bir sonuç atamak için kullanılır. En temel **atama operatörü** **`=`** operatörüdür
### c. Comparison Operators
Java'da **karşılaştırma operatörleri**, iki değer arasında karşılaştırma yapmak için kullanılır. Bu operatörler genellikle **koşullu ifadelerde** (if-else gibi) ya da döngülerde kullanılır. Bu karşılaştırmaların sonucu ya **`true`** ya da **`false`** (boolean veri tipi) olur.
==, != , > , < , >= , <= operatörleri karşılaştırma operatörleridir.
### d. Logical Operators
Mantıksal operatörler, birden fazla koşulun veya ifadelerin bir arada değerlendirilmesine olanak sağlar. Java'da **mantıksal operatörler** genelde **koşul ifadelerinde** (if-else) kullanılır ve sonucu genelde bir **`boolean`** değer (**true** ya da **false**) olur.
AND Operatörü (`&&`) , OR Operatörü (`||`), NOT Operatörü (`!`)

## 6: Java'da Math Kütüphanesi
Java'da **`Math`** sınıfı, matematiksel işlemleri gerçekleştirmek için kullanılabilecek hazır yöntemler (methods) ve sabitler (constants) içerir. Bu sınıf, `java.lang` paketinde yer aldığı için varsayılan olarak tüm projelere dahildir ve ayrıca bir import işlemi yapmaya gerek yoktur.
`Math` sınıfı içerisindeki tüm yöntemler **static** olduğu için, bu yöntemleri doğrudan çağırabiliriz
## 7: Java'da Yaygın Kullanılan Escape Karakterleri
Java'da escape (kaçış) karakterleri, özel karakterleri string içinde göstermek veya özel işlevlere sahip karakterleri kullanmak için kullanılır. Escape karakterleri, ters eğik çizgi \ (backslash) ile başlar.
## 8: Scanner Sınıfı
Java'da Scanner sınıfı, kullanıcıdan giriş almak için kullanılan bir sınıftır. Bu sınıf, genellikle konsol uygulamalarında, kullanıcıdan veri talep etme ve alınan veriyi işleme amacıyla kullanılır
java.util.Scanner paketinde bulunur ve klavyeden, dosyalardan veya diğer veri kaynaklarından giriş almak için kullanılır.
Bu sınıfı kullanmak için import işlemi gereklidir. Aksi takdirde hata alınır.
## 9: Wrapper Class
**Wrapper Class (Sarmalayıcı Sınıf)**, Java'da **ilkel veri tiplerini (primitive types)**, **nesneler (objects)** haline getiren sınıflardır. Java'nın nesne yönelimli olması nedeniyle bazı durumlarda, ilkel veri tiplerini bir nesne olarak kullanmanız gerekebilir. Bu tür durumlar için Java, her bir ilkel veri tipi için karşılık gelen bir **Wrapper Class** sağlamıştır.










