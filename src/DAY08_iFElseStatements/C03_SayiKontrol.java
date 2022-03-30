package DAY08_iFElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println( "girdiginiz iki sayi da pozitif oldugunda toplamlari="+(sayi1+sayi2));

        } else if(sayi1 < 0 && sayi2 < 0) {
            System.out.println("girdiginiz iki sayi da negatif oldugunda carpimlarilari=" + (sayi1 *sayi2));

        } else if (sayi1*sayi2<0) {
            System.out.println(" farkli isartlerde sayiyla islem yapamazsin");

        }  else {
            System.out.println("varsa sifir carpmaya gore yutan elemandir");
        }

    }
}
