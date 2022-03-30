package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // soru1  kullanicidan bir tam sayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println(" girilen sayi cift sayidir");
        }

        if (sayi%2 != 0) {
            System.out.println("girilen sayi tek sayidir");
        }

        //  normalde bir sayi ya tektir veya cifttir 3. bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil if else ile tek statement te yapmak daha guzel olur
        // ====== if else ile  cozum ======

        if (sayi%2==0) {
            System.out.println("girdiginiz sayi cift sayidir");
        }
            else {
                System.out.println("girdiginiz sayi tek sayidir");
            }

    }
}
