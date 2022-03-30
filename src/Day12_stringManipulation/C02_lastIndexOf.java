package Day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

         // kullanicidan bir cumle veya bir kelime isteyin,
        // kelimenin cumlede kullanimina bakarak
        // girilen cumlede kullanilmamis
        // girien cumlede 1 kere kullanilmis
        // girilen cumlede 1 den fazla kullanilmis

        String cumle= "Java ogren , yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";
        int ilkKullanim=cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)){
            System.out.println("girilen cumlede kullanilmamis.");
        }else if (ilkKullanim==sonKullanim){
            System.out.println("girien cumlede 1 kere kullanilmis.");
        } else {
            System.out.println( "girilen cumlede 1 den fazla kullanilmis.");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4)); // 4 dahil



    }
}
