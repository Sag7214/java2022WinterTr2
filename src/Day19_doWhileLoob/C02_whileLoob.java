package Day19_doWhileLoob;

public class C02_whileLoob {
    public static void main(String[] args) {

          // Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin.

        int input=16;
        int rakam = 0;
        int rakamlarToplami=0;

        while (input>0){
            rakam= input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
