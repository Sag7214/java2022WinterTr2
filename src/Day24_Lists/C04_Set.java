package Day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]
        isimler.set(1,"Seckin");   // yusuf yerine seckin geldi
        System.out.println(isimler);   //  [Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek

         List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));

       System.out.println(isimler); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); // [Ilker]





        List<String> meyve = new ArrayList<>();    // ben yaptim calisma
        meyve.add("elma");
        meyve.add("armut");
        System.out.println(meyve);//[elma, armut]

        meyve.set(0,"uzum");
        System.out.println(meyve);//[uzum, armut]

        List<String> logListesi2 = new ArrayList<>();

       logListesi2.add(meyve.set(1,"nar"));  // degistilen elemani listede tutmak icin log kullanilir log=kutuk
        System.out.println(meyve);
        System.out.println(logListesi2);




    }
}
