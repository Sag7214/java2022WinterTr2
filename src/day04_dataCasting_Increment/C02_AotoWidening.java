package day04_dataCasting_Increment;

public class C02_AotoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;
       // String dogruMu=true;  // sol taraf string sag boolean olunca kabul etmiyor

        byte sayi1 = 44 ;
        System.out.println(sayi1);  // 44


        short sayi2 = sayi1;  // esitligin solu short , sagi  byte olmasina ragmen java etiraz etmiyor
        // deger olarak data turu varable data turunden kucuk oldugu icin java sorun yapmaz
        System.out.println(sayi2);  //44

        double sayi3 = sayi2;  // 44.0
        System.out.println(sayi3);


    }
}
