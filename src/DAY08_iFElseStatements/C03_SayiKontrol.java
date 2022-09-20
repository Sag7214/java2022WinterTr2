package DAY08_iFElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        // kullanicidan 2 sayi isteyin sayilarin 2 si de pozitif ise sayilarin toplamini yazdirin
        //  sayilarin 2 si de pozitif ise sayilarin toplamini yazdirin
        //  sayilarin 2 si de negatif ise sayilarin carpimini yazdirin
        //  sayilarin 2 si farkli ise "farli sayilarla islem yapamazsin " yazdirin
        //sayilardan sifira esit olan varsa  "sifir carpmaya gore yutan elemandir" yazdirin
        //

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println( "girdiginiz iki sayi da pozitif oldugunda toplamlari="+(sayi1+sayi2));

        } else if(sayi1 < 0 && sayi2 < 0) {
            System.out.println("girdiginiz iki sayi da negatif oldugunda carpimlari=" + (sayi1 *sayi2));

        } else if (sayi1*sayi2<0) {
            System.out.println(" farkli isartlerde sayiyla islem yapamazsin");

        }  else {
            System.out.println("varsa sifir carpmaya gore yutan elemandir");
        }

    }
}
