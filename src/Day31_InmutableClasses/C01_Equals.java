package Day31_InmutableClasses;

public class C01_Equals {
    public static void main(String[] args) {

        String str1 = "Eren";
        String str2 = "Eren"; //yeni obje olusturma veya bir islem yapma yoksa
        // java String havuzunu kontrol eder.bir tam uyusma bulursa ayni referansi verir.
        // ama str3 ve str4 farkli referans oldugu icin false verir.

        String str3 =new String("Eren");

        String str4 = str1+"";

        System.out.println(str1.equals(str2));    // true  sadece degerlere baktigi icin true olur
        System.out.println(str1.equals(str3));  // true
        System.out.println(str1.equals(str4));   // true

        System.out.println(str1==str2);  // true
        System.out.println(str1==str3);  // false   == > referansa da baktigi icin false olur
        System.out.println(str1==str4);  // false
    }
}
