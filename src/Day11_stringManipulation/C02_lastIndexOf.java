package Day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        // kullanicidan bir cumle veya bir kelime isteyin,
        // kelimenin cumlede kullanimina bakarak
        // girilen cumlede kullanilmamis
        // girien cumlede 1 kere kullanilmis
        // girilen cumlede 1 den fazla kullanilmis

    String cumle = "Java ogren ,yeni program ile yeni bir sayfa ac";
    String kelime = "yeni";

    int ilkKullanim=cumle.indexOf(kelime);
    int sonKullanim=cumle.lastIndexOf(kelime);




    }
}
