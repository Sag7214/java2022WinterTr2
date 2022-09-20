package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2 = 4;
        System.out.println(sayi1/sayi2);  // 2

        sayi2=3;
        System.out.println(sayi1/sayi2); //2.6666666 // 2  verir

        sayi1=22;
        System.out.println(sayi1/sayi2); // 7.33333333  // 7 verir
        // java 2 int sayiyi bolerse sonuc int olur virgulden sonraki sayilari siler

        sayi1=4786;
        sayi2=10;
        System.out.println(sayi1/sayi2);  // 478

        sayi1=sayi1/sayi2;
        System.out.println(sayi1/sayi2);  //47.8   // 47

        sayi1=sayi1/sayi2;
        System.out.println(sayi1/sayi2); // 4.7   //4

        sayi1=sayi1/sayi2;
        System.out.println(sayi1/sayi2);  //0.4   // 0

        sayi1 = 4895;
        double sayi3=10;

         // sol taraf int sag taraf double olacagi icin kucuk buyuge esitlenemez sigmaz yani
        // sayi1=sayi1/sayi3;   // jaava iki farlkli data sayi data turunu koydugumuzda autoWidening yapar
        // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder

        System.out.println(sayi1/sayi3);  //498.5
        System.out.println(sayi3/sayi1);  //0.0020429009193054137



    }
}
