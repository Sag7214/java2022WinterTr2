package day03scanner;

public class C02_Swap_Variables {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap tan once sayi1: " + sayi1 + ", sayi2 :"+sayi2);

        int temp=sayi1; // temp=10
        sayi1= sayi2;  // sayi1=20
        sayi2=temp;    // sayi2 = 10
        System.out.println("Swap tan sonra sayi1: " + sayi1 + ", sayi2 :"+sayi2);

    }
}
