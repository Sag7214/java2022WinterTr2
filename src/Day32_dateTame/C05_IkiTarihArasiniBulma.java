package Day32_dateTame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();

        LocalDate dogumGunu= LocalDate.of(1972,10,10);

        System.out.println(Period.between(dogumGunu , bugun));  //  P49 Y5M 23D

        System.out.println(Period.between(dogumGunu,bugun).getYears());  // 49

          // FIXME: 02/04/2022
    }

}
