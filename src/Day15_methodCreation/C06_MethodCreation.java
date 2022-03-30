package Day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // iki variablenin degerlerini toplayan bir method olusturalim
        // 1. adim method adini yazalim
        // 2. adim method a gondermem gereken argument var mi?
        
ikiSayiTopla(25,50);

C04.dortHarfiTersineCevir("sema");

    }
// bir methodu olusturmak calismasi icin yeterli degildir
    // method ancak cagrilirsa calisir
    // ayni veya farkli clas ta olmasinin hic bir onemi yoktur
    // java main method da yukardan asagiya calisir
    // ve geldigi satiri calistirir

    public static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami:"+(a+b));
    }
}
