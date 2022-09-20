package Day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // concatenation yapmak icin 2 ihtimal var
        // istersel daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya string clasindan gelen concat metodunu kullanabiliriz  farki yok

        String str1= "java" ;
        String str2="candir";
        // java candir yazdiralim
        System.out.println(str1 + "" + str2);
        String cumle= str1.concat(str2);   // javaCandir

        cumle=str1.concat( "   ") .concat(str2);
        System.out.println( cumle);

        // concat icine String degil de syi veya boolean deger yazsak ? olur mu
        // concat metodu icine string parametre ister
        // string disinda bir data turu yazdiginizda onu string haline getirmelisiniz

        cumle=str1.concat(""+5);
        cumle=str1.concat(true+"");


    }
}
