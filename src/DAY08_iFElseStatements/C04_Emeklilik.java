package DAY08_iFElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

// eger calisan kadinsa 60 yasindan buyuk oldugunda
        // erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz" + "\n kadin icin K \nerkek icin E \n harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz ");
        double yas = scan.nextDouble();


        if (cinsiyet == 'K' & cinsiyet == 'E'
        ) {

            if (yas < 0 || yas > 120) ;
            {
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            }

        } else if (yas < 60) {
            System.out.println("emekli olamazsin \ndaha" + (60 - yas) + "yil calisman gerekir ");
        } else if (yas > 120) {
            System.out.println("emekli olabilirsin");
        } else if (yas < 65) {
            System.out.println("emekli olamazsin \ndaha" + (65 - yas) + "yil calisman gerekir ");
        } else {
            System.out.println("emekli olabilirsin");
        }

    }
}



