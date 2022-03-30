package Day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        // kullanicidan bir cumle veya bir kelime isteyin,
        // kelimenin cumlede kullanimina bakarak
        // girilen cumlede kullanilmamis
        // girien cumlede 1 kere kullanilmis
        // girilen cumlede 1 den fazla kullanilmis

        String cumle= "Java ogren , yeni program ile yeni bir sayfa ac";
        String kelime= "adil";   // girilrn kelime cumlede kullanilmamis // yeni olsa girilen kelime birden fazla kullanilmis

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index
        int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");

        } else if (ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        } else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis" );

    }}

}
