package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);  // 30 sayiyi 10 yazdirdim burada artirmadim
        System.out.println(sayi);  // 20  eger atama yapmazsak yaptigimiz artirma ve azaltma kaydedilmez

        sayi=sayi+10;  // atama yaptik yaparsak en son tamayi verir atamazsak eski degeri verir
        System.out.println(sayi); // 30 oldu ve artirma yaptik yani atadik

        System.out.println(sayi=sayi+=10);// 40 oldu // burad hem atama yaptik hem de 10 daha atadik
        System.out.println(sayi);  // 40 OLUR son deger 40 olur

        System.out.println(sayi+=10);  // 50

        System.out.println(sayi);  // 50

        // bir variable nin degerini kalici ollark artirmak veya azaltmak isterseniz assigment saRttir
        System.out.println("21.satir : " +sayi++);  // 50
        System.out.println("22.satir: " +sayi); // 51

        System.out.println("24.satir: " + ++sayi); // 52
        System.out.println("25.satir: " +sayi); // 52
    }
}
