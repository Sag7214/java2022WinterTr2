package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);
        System.out.println(sayi);
        sayi=sayi+10;
        System.out.println(sayi);
        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);
        System.out.println(sayi+=10);
        System.out.println(sayi);
        // bir variable nin degerini kalici ollark artirmak veya azaltmak isterseniz assigment sattir
        System.out.println("30.satir : " +sayi++);
        System.out.println("31.satir: " +sayi);
    }
}
