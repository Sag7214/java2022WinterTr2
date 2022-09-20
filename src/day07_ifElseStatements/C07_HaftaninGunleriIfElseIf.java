package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");
        }

        else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");
        } else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");

        }
        // eger if else if ....... statement else ile bitiyorsa
        // olasiliklardan dasece bir tanesi mutlaka calisir
        // java ilk buldugu true a ait  sonucu yazdiri
        // ve kalan sartlara bakmaz
        // if else .... cumlelleri else ile bitmese de calisir
        // ancak bu durumda sadece bir olasilik calisabilir veya hic bir islem yapilmayabilir
    }
}
