package Day10_Switch_StringManipulation;

import java.util.Scanner;

public class C1_SwitchCase {
    public static void main(String[] args) {

        // kulanicidan sayi olarak kacinci ay oldugu alip
        // istenen ay ismini yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine Switch case yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println(" ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

                //  switch icine yazilan variable nin degerine gore ilgili  case yi bulur
                // ve   break gorene kadar kodu calistiri
                // eger break yoksa ilgli case den asgi dogrru hepsini yazdirir
                // if else deki gibi geriye kalan durumlri tamamen kapsaycak bir satir daha ekleyebiliriz


        }
    }
}
