package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


//  kullanicidan ismini alip ; ismin bas harfini yazdirma

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz...");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi:"+ ilkHarf);

        // charAt (index) methodu parametre olarak yazdigimiz index deki char i bize verir
        // string de index 0 dan baslar

    }
}
