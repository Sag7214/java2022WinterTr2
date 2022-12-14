package Day32_dateTame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);     // 2022-04-02T11:42:04.481587400

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        System.out.println(formatter.format(tarihSaat));   //  02/4/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("hh : mm : ss a");
        System.out.println(formatterSaat.format(tarihSaat));  //  11 : 55 : 05 AM


        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar.
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini
         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami
         YY : yilin son iki rakamini
         YYYY : Yilin tamamini
         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         hh :  12 saat dilimine gore 2 rakam olarak
         h : 12 saat dilimine gore tek rakam olanlari tek olarak
         m : minute tek rakamlari tek
         mm: tek rakamlari 08 gibi
         a yazarsak AM veya PM degerini yazar.
         */


    }
}
