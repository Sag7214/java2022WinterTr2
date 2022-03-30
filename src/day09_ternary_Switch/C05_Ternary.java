package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        // bazen ternary deki iki sonucun data turler farkli olabilir
        // verilen sayi 100 den buyukse sayinin karesini alip yazdiralim
        // yuzden kucukse sayi 100 den buyuk olmali yazdiran
        // bir ternary olusturalim

        int sayi= 150;
        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degisken atamaliyiz
        // eger sonuclar farkli data turlerinde ise
        // atama yapacagimiz variable nin data turu tek olacagindan  atama yapamayiz
        //  sadece direk yazdirabiliriz
        System.out.println(sayi>100 ?  sayi*sayi  : "sayi 100 den buyuk olmali");

    }
}
