package Day32_dateTame;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-04-02T11:30:55.127620200

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        // 2025-06-12 T 16:37:16.084501600
    }
}
