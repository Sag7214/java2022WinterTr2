package day05_matemetikselislemler;

import java.util.Locale;

public class C04_WrapperClas {
    public static void main(String[] args) {

        // prpmitive  data turu ile nan - primitive arasindaki farklar nelerdir?

        String str="java";
        System.out.println(str.toUpperCase(Locale.ROOT));  // JAVA
        System.out.println(str);  // java

        // str yazip . koyunca secenekler cikiyor buyuk harfe cevir buyuk harfe cevir gibi
        // nan  - primitive data turleri data depolamak disinda bircok faydali metoda sahiptir
        // ancak primitive data turleri sadece degerleri saklarlar (container)
        // prpmitive data turleri icin de bazi metodler gerekli oldugunda java ara bir cozom uretmistir
        // java her bir prpmitive data turu icin n-p olarak kullnabilmek icin ozel clas lar olusturmus ve bunlara
        // Wrapper Clas adini vermistir

        double  sayi2=20.5;
        // sayi2 p oldugundan sayi2 . dedigimizde hic secenek gelmez
         Double sayi3=15.2;
         // sayi3 wrapper clas olan Double clasini kullandigindan bircok method gelir



    }
}
