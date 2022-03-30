package day05_matemetikselislemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String strl1="12345";
        String strl2="123456";
        // verilen iki str deki sayilari toplayin
        System.out.println( strl1 +  strl2  ); //12345123456
        System.out.println(Integer.valueOf(strl1)+ Integer.valueOf(strl2) ); //35801

        // integer.valueOf(str1) metodu sadece sayisal deger iceren String lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa java hata verir

    }
}
