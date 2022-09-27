package Day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin.


        String arr[]={"A" , "B" , "C"};
        List<String> arraydenList= Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add() , remove(), clear() gibi method'lar calistirmak
        // istedigimizde Exception olusur.

        //arraydenList.add("J"); //UnsupportedOperationException(desteklenmeyen exception(istisna) orn:j yi ekleyemedik

        System.out.println("19.satirda list :" + arraydenList);   // [A, B, C]
        arr[1]="F";

       System.out.println("23.satirda Array : " + Arrays.toString(arr));  //  [A, F, C]
        System.out.println("24.satirda list :" + arraydenList);    //  [A, F, C]


       arraydenList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));   //  [Y, F, C]
       System.out.println("29.satirda list :" + arraydenList);   //  [Y, F, C]
    }
}
