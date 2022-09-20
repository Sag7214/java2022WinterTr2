package Day11_stringManipulation;

import java.util.Locale;

public class C01_tolowerCase_toUpperCase {
    public static void main(String[] args) {

        String str= "java Guzeldir";
        // biz string metod larini arka arkaya kullnabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        str.charAt(5);   // boyle yazdigimizda sonuc artik String degil char olacaktir.
        // dolayisiyla String de yapmak istedigimiz tum degisiklikleri
        // once yapip sonra charAt() metodunu kullanmaliyiz.

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("fr")));

    }
}
