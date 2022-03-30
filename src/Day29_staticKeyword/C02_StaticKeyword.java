package Day29_staticKeyword;

public class C02_StaticKeyword {
    public static <C01_Static> void main(String[] args) {

        // baska class'daki static class uyelerine
        // ulasabilmek icin sadece clasIsmi.staticUyeIsmi
        // yazmamiz yeterlidir

        System.out.println(C1_Static.okulTelefonu); // 3122563635
        C1_Static.okulTelefonu="3125474747";
        System.out.println(C1_Static.okulTelefonu); // 3125474747


        // Baska class'daki static olamayan class uyelerine
        // ancak o class'dan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C1_Static obj1=new C1_Static();
        C1_Static obj2=new C1_Static();

        System.out.println(obj2.okulIsmi); // Yildiz koleji
        obj2.okulIsmi="Sabir koleji";
        System.out.println(obj1.okulIsmi); // Yildiz koleji

        C1_Static.staticMethod();

        C1_Static ob3=new C1_Static();  //Statik method calisti
        ob3.staticOlmayanMethod();    //Static olmayan method calisti



    }
}
