package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        // gun pazar veya cumartesi ise ==== hafta sonu
        //  gun pazartesi veya sali ise ===== hafta ici

        // String case sensitive dir
        // yani pazar , PAZAR , Pazar bunlar hep farkli kelimelerdir

        // bu durumda String method larindan yardim aliriz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunIsmi=scan.next().toLowerCase();  // kullanici nasil girerse girsin biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar")|| gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");
        }
        if (gunIsmi.equals("pazartesi")  || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba")  ||gunIsmi.equals("persembe")  || gunIsmi.equals("cuma") ) {
            System.out.println("girdiginiz gun hafta ici");
        }


    }
}
