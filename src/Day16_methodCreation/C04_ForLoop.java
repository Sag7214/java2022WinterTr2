package Day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

            // verilen string i tersten yazdiran bir kod yaziniz.

        String str= "java cok zevkli";

        for (int i =str.length()-1; i>= 0; i--) {
            System.out.print(str.substring(i,i+1));

        }
        String str2="Adil gull";   // ben yaptim
        for (int i=str2.length()-1; i >=0 ; i--) {
            System.out.println(str2.substring(i,i+1));

        }
    }
}
