package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // 1.adim bir scannir olusturulur

        System.out.println("Lutfen Isminizi Giriniz"); // kullanicidan aciklayici bir bolgi yazdirin

        String kullaniciIsmi= scan.next(); //kullanicinin girdiigi degere uygun bir variable olustur
        //String kullaniciIsmi= scan.nextLine(); //

        // scan.next  = sadece ilk kelimeyi alir ilk bosluga kadar
        // scan.nextLine = butun satiri alir
        System.out.println("Kullanicinin girdigi isim :" + kullaniciIsmi);





    }
}
