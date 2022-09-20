package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary  {
    public static void main(String[] args) {


        // trnary ile yapilan tum islemler if else ile de yapilabilir
        //  if else yerine  ternary secilmesi yapinin basit ve anlasilabilir olmasidir
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        //  soru :kullanicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayi cift");

        } else {
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? " SAYI cift" : "SAYI tek");


    }
}
