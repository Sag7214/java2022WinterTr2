package Day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str="   Siz ne derseniz deyin, Java bildigini okur.      ";
        str.trim();  //  Siz ne derseniz deyin,Java  bildigini okur  bosluklu  yazdirir.
        System.out.println(str.length()); //52

        str=str.trim();
        System.out.println(str);  //Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length()); // 43



    }
}
