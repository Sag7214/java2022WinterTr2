package Day32_dateTame;

public class C06_Varargs {
    public static void main(String[] args) {

       // verilen iki sayiyi toplayan bir method olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        // bir de 3 sayiyi toplayan method olusturalim
        toplaGel();  // 0
        toplaGel(sayi1); // 10
        toplaGel(sayi1,sayi2); //30
        toplaGel(sayi1,sayi2,sayi3);  // 60
        toplaGel(sayi1,sayi2,sayi3,sayi4);  // 100
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5); //150
    }
    private static void toplaGel(int... sayi) {
        int toplam=0;
        for (int each: sayi) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
    }





