package Day10_Switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        // String de herhangi bir karakteri almak istedigimizde
        // o harfin index ini kullanarak
        // str.charAt (istenenIndex) yazabiliriz

        String str= "Java Cok Guzel";
        System.out.println(str.charAt(0));
         // eger g 'yi yazdirmak istiyorsam

        System.out.println(str.charAt(9));
        // va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3)); //va

        // cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));
        // son harfi yazdir
// string de 14 harf var onun icin 0 dan basladigi icin son harfin index i 14-1 = 13 tur
        System.out.println(str.charAt(14-1)); // uzunluk -1
        System.out.println(str.charAt(12)); // uzunluk -1

        // eger  uzunlugu index olarak girersek
       // System.out.println(str.charAt(14));  // hata verir 14 uzunluk olmadigi icin
    }
}
