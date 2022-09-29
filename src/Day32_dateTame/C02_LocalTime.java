package Day32_dateTame;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 21:10:01.017511

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz.

        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }

        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi); // 11:21:31.437719100

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1) + " nanosaniyede bitti");


        // ileri veya geriye gidebiliriz.
        System.out.println(tm.plusHours(10));     // 10 saat sonra 21:21:31.437719100

        System.out.println(tm.plusMinutes(1000));  // 04:03:09.301362700  1000 dk sonrasi
        System.out.println(tm.minusHours(1));     // 09:24:16.912343900  2 saat once

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz.

    }
}



