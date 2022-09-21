package Day18_nestedForLoob;

public class C03_NestedForLoob {
    public static void main(String[] args) {

        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //      *
        //      * *
        //      * * *
        //      * * * *
        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1 ; j<=i;j++){

                // nested for loob dikdortgen veya ucgen formatinda olabilir.
                // dikdortgen istedigimizde iki loob icinde end point belirleriz.
                // ucgen sekli vermek icin inner loob un end point'ini outer degiskene bagli yapariz.

                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
