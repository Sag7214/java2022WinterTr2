package day06_Concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);  // false
        boolean sonuc1=5>4 &&  7<9 &&  6+3==9 &&  5+2!=8;
        System.out.println(sonuc1);  // true
        boolean sonuc2= 5>4 && 7>9 && 6+3==9  && 5+2!=8;  // false
        boolean sonuc3= 5>4 & 7>9 & 6+3==9  & 5+2!=8;  // false
        System.out.println(sonuc2);
        System.out.println(sonuc3);

        // && ile & arasindaki fark; cift && ilk hatada durur,tek  & hepsine bakar sonra durur fazla zaman harcar
        // yoksa sonuc ayni ikisinde de false

        int sayi3= 15 ;
        System.out.println(10<sayi3   &&   sayi3<20);  // true
        // sayi3 un 10 ile 20 araliginda oldugunu true diyerek dondurelim
        // java uclu karsilastirmalar kabul etmez
        // ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz

        int  sayi4=5;
        //  sayi 4 un 10 ile 20 arasinda olmadigini true diyerek dondurelim
        System.out.println(sayi4<10 || sayi4>20); // true








    }
}
