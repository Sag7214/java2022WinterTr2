package Day10_Switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {


        // kullanicidan kacinci ay oldugunu aldirip kacinci mevsim oldugunu yazdiran bir switch olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12 :
            case 1:
            case 2:
                System.out.println("kis");
break;
            case 3:

            case 4:

            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("yaz");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");
        }
    }
}
