package Day17_ForLoob;

public class C06_ForLoob {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran bir kod yaziniz

        char ilkHarf='a';
        char sonHarf='z';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " ");
        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin

        for (double i = baslangic; i <= bitis; i+= artis) {
            System.out.print(i+" ");
        }

    }
}
