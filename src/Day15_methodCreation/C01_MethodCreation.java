package Day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str ="Java ogrenmek cok zevkli";
        // str in ilk 4 harfini almak istersek
        str.substring(0,4);
        // bir program yaparken daha kisa ve anlasilabilir olmasi icin
        // surekli kullanabillecegimiz kod bloklarini
        // hazir olarak bir yere koyar ve ihtiyacimiz oldukca kullaniriz

        // method lar robotlara benzer
        // method olusturmak bazen o methodun yapacagi isi yapmaktan zor olabilir
        // bir islemi sadec bir kere yapacaksak method kullanmamiza gerek olmayabilir
        // ancak  cok kullanacagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu islemi hazir olarak yapan hazir bir method olusturmak cok daha pratiktir

        // bazen bir clasin icerisinde cok uuzun kodlar yazarsak
        // tum clasin anlasilmasi zorlasabilir
        // bunun yerine kodun belli kisimlarini ayri methodlar olarak olusturup
        // main method icerisinden istedigimiz zaman alip kullanabiliriz

    }
}
