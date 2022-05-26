package day05_matemetikselislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi); // 11
        //sayi++;
       // System.out.println(sayi);  // 12
        //once artiri sonra artirirsak java yeni degeri yazdiirir.
        // ama once yazdirir sonra artirirsak eski degeri yazdirir.

        //System.out.println(sayi);  // 12 yine  12 kalir.
       // sayi++;

       // System.out.println(++sayi); // once artir sonra yazdir   13 olur
        //System.out.println(sayi);  // 13

        sayi++;
        System.out.println("pre-incrementten once " + sayi);  // 12
        System.out.println("preincrement satirinda"+ ++sayi);  // 13 once artir sonra yazdir
        System.out.println("pre-incrementten sonra "+ sayi);  // 13
        System.out.println("post-increment satirinda"+ sayi++);// 13 once yazdir sonra artir
        System.out.println("post-increment satirindan sonra "+sayi);  // 14







    }
}
