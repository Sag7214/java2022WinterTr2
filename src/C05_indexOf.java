import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('J'));  //0

        // istersek char olarak verdigimiz bir harfin indexini bize dondurur
        // istersek bir harf yada metin olarak vedigimiz String index ini dondurur

        System.out.println(str1.indexOf('l')); // 19

        System.out.println(str1.length()-1);  //19
        System.out.println(str1.indexOf("aska"));//10

        // ayni harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexsini dondurur
        System.out.println(str1.indexOf('b' ,5));
        // bu metotda java aramaya fromIndex olarak yazdigimiz indexden baslar
        // (inclusive)
        //  verilen string deki ikinci a harfinin insx sini bulalim

        int ilkIndex= str1.indexOf('a');  // 1
        System.out.println(str1.indexOf('a' ,ilkIndex+1));  // 3

        int ilkbIndex= str1.indexOf("b");
        System.out.println(str1.indexOf("b" , ilkbIndex +1));  // 9

        // 20. index ten sonra guzel bulalim
        System.out.println(str1.indexOf("guzel",20));  //31

        // strin de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));  //  y yok demesi  lazim ama return type i index
         // yok demenin sayisal karsiligi olarak  java -1 dondurmeyi tercih etmistir
        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mail iniz kabul edildi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen mailinizi yazin");
        String mail= scan.next();

        if (mail.indexOf("@") == (-1)){
            System.out.println("gecersiz");

        } else {
            System.out.println("mailiniz kabul edildi");

            //  OZET : indexOf metodu icine yazilan string veya char in
            // metinde hangi index te oldugunu bize dondurur
            // eger aradigimiz metin veya char yoksa olmadiginin delili olrak bize
            // -1 dondurur

        }


    }
}

