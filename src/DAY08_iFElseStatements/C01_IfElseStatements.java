package DAY08_iFElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // girilen bir karekterin , harf olup olmadigini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutefen bir karakter girimiz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')  || ( karakter>='a' && karakter<='z')){

            System.out.println("Girdiginiz karakter bir harf");
        } else System.out.println("Gırdıgınız karakter harf degıl");
        

    }
}
