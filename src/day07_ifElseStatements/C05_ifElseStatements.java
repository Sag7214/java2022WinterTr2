package day07_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {

        // gun pazar veya cumartesi ise ==== hafta sonu
        //  gun pazartesi veya sali ise ===== hafta ici

        // String case sensitive dir
        // yani pazar , PAZAR , Pazar bunlar hep farkli kelimelerdir

        // bu durumda String method larindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("girdiginiz gun hafta sonu");
            {
                System.out.println("girdiginiz gun hafta ici");
            }
        }
        else {System.out.println("girdiginiz gun hafta ici");

        }
    }}





