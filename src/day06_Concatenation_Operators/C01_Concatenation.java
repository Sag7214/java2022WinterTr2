package day06_Concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;
        System.out.println(str1+sayi1+str2);  //java5guzel
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2); // 2guzel15
        // java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //java22
        //53guzel
        System.out.println(sayi1+sayi2+str2);  //8guzel
        System.out.println(sayi1+(sayi2+str2));  //53guzel
        System.out.println(""+sayi1+sayi2+str2);  // 53guzel
        // eger tamamen sayilardan olusan bir string varsa ve biz bunu int a cevirmek istersek
        //  Integer.valueOf(str)
        // bir sayiyi String e cevirmek istersek ""+sayi
    }
}
