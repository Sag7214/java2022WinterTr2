package Day14_stringManipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C05_sifreKontrol {
    public static void main(String[] args) {

        // soru6) kullanicidan bir sifre girmesini isteyin.
        //asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi"
        // sartlari saglamazsa Islem basarisiz , Lutfen yeni bir sifre girin" yazdirin.
        // - Ilk harf buyuk olmali.
        // - Son harf kucuk olmali.
        // - Sifre bosliuk icermemeli.
        // - Sifre uzunlugu en az 8 karakter olmali.

        String sifre = "Asdf12345a";

        boolean ilkHarf = false;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali ");

        }

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarf = true;

        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

         boolean bosluk=false;
        if (!sifre.contains(" ")){
            bosluk=true;

        }else {
            System.out.println("sifre bosluk icermemeli");

        } boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;

        }else {
            System.out.println(" Sifre en az 8 karakter olmali");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }

    }
    }

