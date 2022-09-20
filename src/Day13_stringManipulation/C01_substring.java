package Day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));  // ile IT cok guzel

        // mehmet hoca ile IT cok guzel
        System.out.println(str.replaceAll("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca"+str.substring(5));

        System.out.println(str.substring(9)); // yazilan index inclusive
        // eger bir index ten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazamak gerekir str.substring (baslangicIndexi , bitisIndexi
        // bitis indexi==> inclusive/dahil
        // bitisIndexi==>eclusive/haric

        System.out.println(str.substring(0,5));  //   Java
       System.out.println(str.substring(0,1));  // J


       String harf=str.substring(5,6); //// bana 6.karakteri string olarak bulun  // i
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));  // hiclik dondurur

       //System.out.println(str.substring(5,2));   // hata verir cunku bitis index i baslangic index inden kucuk olamaz

        System.out.println(str.substring(str.length()-1));  // son harfi verir yani //r
        System.out.println(str.substring(str.length()-5));  // son 5 hrfi yazdiralim // siyor
        System.out.println(str.substring(str.length()));   // son harften sonraki kismi yani hiclik verir
    }
}
