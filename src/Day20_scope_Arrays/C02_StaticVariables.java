package Day20_scope_Arrays;

public class C02_StaticVariables {

       /* instance variable ler obje ye baglidir ve her obje farkli degerler alir
         ogrnci notlari gibi
          bir objeye ait bir varioable nin son degerini bulmak icin sadece o objeyi dikkate aliriz
            static variable ler ise class(static) variable olarak tanimlanir
             ve tum class uyeleri icin aynidir . okul ismi gibi
               eger static variable in degeri degistirilirse herkes icin degisir.

     */

    static String  okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;



    public static void main(String[] args) {
        System.out.println(okulIsmi);  //  yildiz koleji
        System.out.println(okulNo);  // 0  default degeri
        okulNo=102;
        System.out.println(okulNo);   // 102
        System.out.println(okulAcikMi);  // false  default degeri

        staticMethod();

        System.out.println(okulNo);  // 200

    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);  // 200

    }
}
