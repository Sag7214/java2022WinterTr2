package Day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin.
        // mehmet@gmail.com.tr

        String email="mulkiyeayboy@gmail.com"; // com.tr yazimi kontrol edin olur // @tmail mail adresi girin olur
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){   // ! kullanilinca icermiyorsa oluyor(sadece boolean da kullanilir
            // yani true ve folse ifadelerinde
            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.lastIndexOf(arananMetin)== (email.length()-10)){ // @mail.com 10 karekter oldugu icin -10 yazilr
            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("lutfen yazimi kontol edin");
        }
}
}