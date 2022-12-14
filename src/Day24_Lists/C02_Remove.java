package Day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println(isimler);   // [Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) method'u istenen elementi kaldirip
        // bize true/false doner.
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method'u boolean bir variable'a atayabilirsiniz

        boolean sonuc = isimler.remove("Oguzhan");  // true

        // sonucu kullaniciya yazdirmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yazabilirsiniz


        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");

        } else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }

        System.out.println(isimler);

        isimler.remove("Berk");

        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");

        } else {

        }

        System.out.println("istediginiz isim listede olmadigi icin silinemedi");


        // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elemneti doner

        isimler.remove(1);


        System.out.println(isimler); // Yusuf'u siler ve

        // delil olarak Yusuf ismini bize dondurur
        // yazdirsak da yazdirmasak da liste degisti ve 1.index'deki element silindi

        // [Aykut, Ilker]

        isimler.remove(0); //

        System.out.println(isimler);  // [Ilker]



    }

        }




