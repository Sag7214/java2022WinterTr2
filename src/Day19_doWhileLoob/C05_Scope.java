package Day19_doWhileLoob;

public class C05_Scope {

// 1- bir method icinde olusturulan variable ller sadece olusturulduklari method ta kullanilabilir
    // baska method larda kullanilamazlar
    // 2- tum method larin kullnmasini istedigimiz variable leri clas level da olusturmamiz gerekir
    // clas leevel da olusturdugumuz variable yi
    // -----static yaparsak tum method lar kullanabilir
    // ---- static olmazsa (instance( o zaman sadec statixc olmayan method lar kullanilabilir
    // 3- loob icinde olusturulan variable ler loob icinde kullanilabilir
    // ama loob un disinda kullanilamazlar

    static String kurs="Java";
    int level = 10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi = 10;
      //  isim = "Vali Yan";

        System.out.println(kurs);
       // System.out.println(level);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loobSayi=20;
            
        }
       // System.out.println(i);
        //loobSayi=30,

        int sayi2;
        sayi4++;  // clas seviyesinde olusturup deger atanmadigim sayi 4 e java itiraz etmiyor
       // sayi2++;   // ama main method icnde olusturup deger atamadigim sayiyi atrtirmmama java izin vermiyor
    }

             public static void method1(){
       // sayi=20;
        String isim= "Ali Can";
        System.out.println(kurs);
              //   System.out.println(level);

        }

        public void method2(){
      //  sayi=30;
        //isim=" Ayse San";
            System.out.println(kurs);
            System.out.println(level);

    }
}
