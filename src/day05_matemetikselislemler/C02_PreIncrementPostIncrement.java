package day05_matemetikselislemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2= sayi1++;
        System.out.println(sayi1 +"," +sayi2+ " ," + sayi3);  //  11,10,30

        sayi3=++sayi1;
        System.out.println(sayi1 +" ," + sayi2 +  " ," + sayi3);  // 12, 10,12
        System.out.println(sayi3++);  // 12
        System.out.println(--sayi2);  // 9
        System.out.println(++sayi1); // 13
        System.out.println(++sayi3);  // 14



    }
}
