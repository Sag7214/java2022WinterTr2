import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.print("girdiginiz yaricap:"+yaricap);
        System.out.print("cemberin cevresi:"+2*3.14*yaricap);
        System.out.print("girdiginiz yaricap:"+3.14* yaricap*yaricap);


    }
}
