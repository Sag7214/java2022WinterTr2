package day50_maps;

import day49_mabs.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        //  siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);  // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */
        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList.get(0));

        // Simdi de value leri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);





        // her bir value birden fazla bilgiyi iceriyor onun icin
        // value leri multidimensional bir arrey e atmak mantikli duruyor
        //  ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner array larin boyutunu bulmak biraz daha kompleks olaaacak
        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;


        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j] = temp[j];


            }

        }

        System.out.println(Arrays.deepToString(valueMDArr));

        // bu satira kadar key'leri index ile ulasabildigim keyList' e atadim
        // value'leri valueMDArr'e atadim
        // simdi bu key ve value'leri istedigim gibi manuple edebilirim

        System.out.println("Numara  Isim   Soyisim  Brans  D.Tarihi");
        System.out.println("=======================================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }
            System.out.println("");


        }
    }
}
