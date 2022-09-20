package day03scanner;

import org.w3c.dom.ls.LSOutput;

public class C01_Variables {
    public static void main(String[] args) {

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='H';
        System.out.println(ilkHarf);

        int sayi1=10 , sayi2=20;
        System.out.println(sayi1+sayi2);

        String isim="Nezir";
        String soyIsim="Yildiz";
        System.out.println("Isminiz : " +isim);
        System.out.println("soyisminiz: "+soyIsim);

        short sayi3=20;
        double sayi4=30.5;
        System.out.println("iki sayinin toplami :"+(sayi3 + sayi4));

        char ozelKarakter='&';
        System.out.println(ozelKarakter);

        int sayı5=20;
        char harf='a';
        System.out.println(sayı5+harf);  // char degerinin askii degerini kullanir(20+97=117 olur)
        int sayi6='a';  // a nin ascii degeri 97 dir
        System.out.println(sayi6);





    }



}
