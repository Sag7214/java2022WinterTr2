package day05_matemetikselislemler;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanicidan aldiginiz 4 basanmakli bir sayinin basamaklar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tamsayi giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10; // 2
        rakamlarToplami +=rakam; // 2
        sayi/=10; // 753

        rakam=sayi%10; // 3
        rakamlarToplami +=rakam;  // 5
        sayi /=10;  // 75

        rakam=sayi%10;  // 5
        rakamlarToplami +=rakam; //10
        sayi/=10; // 7

        rakam=sayi%10;  // 7
        rakamlarToplami+=rakam;   //17
        sayi/=10; // 0

        // bu islemi basamak sayisinca yapiyoruz 4 rakamli is e4 kere; 6  rakamli ise 6 kere gibi bu onemli
        // yani rakam ,  rakamlar toplami, sayi  islemini

        System.out.println("girdiginiz sayinin rakamlar toplami" +rakamlarToplami);




















    }
}
