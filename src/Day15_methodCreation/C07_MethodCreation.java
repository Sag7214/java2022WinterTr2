package Day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

            // string'i yazdiran method olusturalim.
           // hosgeldiniz diyen bir method olusturun.
          // kapanma mesaji yazan bir method olusturalim.

        hasgeldinYazdir();
    }
       public static void hasgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur");
    }
    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }
    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();

    }
}