package Day18_nestedForLoob;

import java.util.Scanner;

public class C08_ForLoobVsWhileLoob {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);


        int sayi = 0;
        int toplam = 0;
        /*
        for (int i = 1; i < 100000; i++) {

            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();

            if (sayi==0){
                break;
            }else {
            toplam+=sayi;
            }

        }



        System.out.println(toplam);
        // while ile yaparsak
 */
        sayi=1;
        toplam=0;

        while (sayi!=0) {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
            System.out.println(toplam);

         // baslangic, bitis  ve degisim degerleri net olan durumlarda for loob daha avantajlidir
            // ama bu sorudaki gibi adim sayisi belli olmayan durumlarda while loob daha avantajlidir


    }
}






