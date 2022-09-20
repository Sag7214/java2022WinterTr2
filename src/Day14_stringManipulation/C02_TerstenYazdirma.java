package Day14_stringManipulation;

import java.util.Locale;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        // soru5 kullanicidan 4 harfli  bir kelime isteyin.
        // ve girilen kelimeyi  tersten yazdirin.

        String input="AHme";

        String tersStr=input.substring(3).toUpperCase()+
                       input.substring(2,3).toLowerCase()+
                       input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);

    }
}
