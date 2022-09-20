package Day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

        // soru2) String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = "$13.99"
        // String str2 = "$10.55"
        // ipucu : Double.parseDouble() metodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D",""); // 1399 ama String olarak.
        str2=str2.replaceAll("\\D","");  // 1055 ama String olarak.

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);

        double sonuc=(str1Sayi+str2Sayi)/100;
        System.out.println("verilen String sayilarinin toplami : $"+ sonuc );


        }
    }

