package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {


        // kulanicidan 4 basamakli bir sayi alin.
        // girdigi sayi 5 e bolunuyorsa son rakamini kontrol edin
        // son rakami 0 ise ekrana "5 e bolunen cift sayi "yazdirin
        // son rakami 0 degil ise " 5 e bolunen tek sayi " yazdirin
        // girdigi pasword 5 e bolunmuyorsa ekrana " tekrar deneyin " yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamaakli bir pozitif tamsayi giriniz");
        int sayi = scan.nextInt();


        if (sayi < 1000 || sayi > 9999) {  // istenmeyen durumu yaziyoruz
            System.out.println("lutfen 4 basamakli sayi giriniz");


        } else if (sayi %5 == 0) { // 4 basamakli ve sayi 5 e tam bolunuyor
            if (sayi %10 == 0) {  // 4 basamakli 5 ile bolunebilen ve son rakami 0 olan
                System.out.println("5 e bolunebilen cift sayi");

            } else { // 4 basamakli 5 ile bolunebilen ve son rakami 0 olmayan
                System.out.println("5 e bolunen tek sayi");

            }
                    System.out.println("tekrar deneyin");
                }
            }

        }

