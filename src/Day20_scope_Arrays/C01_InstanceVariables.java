package Day20_scope_Arrays;

public class C01_InstanceVariables {


    int  sayi;
    String bransIsmi=" Java ";
    boolean okuldaMi;


    public static void main(String[] args) {

        //  sayi=10;   sayi variable i static olmadigi icin main method dan direk kullanilamz
        // instance variable lara static method lardan ulasabilmek icin obje olusturmamiz gerekir.

        C01_InstanceVariables obje1= new C01_InstanceVariables();
        System.out.println(obje1.sayi);   //  0
        obje1.sayi=10;
        System.out.println(obje1.sayi);   //  10
        obje1.bransIsmi="SQL";
        System.out.println(obje1.okuldaMi); //deger atnmadigi icin class degrden boolen icin defauld degri olan false verir

        C01_InstanceVariables obj2= new C01_InstanceVariables();
        System.out.println(obj2.sayi);   //  0  defold deger yazar yukrida deger verilmedigi icin
        System.out.println(obj2.bransIsmi);   //  java

        obje1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);  // yinne deger atamasi yok yine false verir (default degeri)
    }
}
