package day07_ifElseStatements;

public class C02_ifStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){

            System.out.println(" isteginiz gerceklesecek");
            System.out.println("bady icindeki  tum kodlar  calisir");
        }

        if (a<0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz if bady sini {} icine yazmalisiniz
        // bady yi {} icine yazmazsak  da if cumlesi calisir ancak ilk ; gordugunde if cumlesi bitmis olur





        // 24. satirdaki kod 15. satirdaki if dogru olsa da calisir false olsa da calisir
        System.out.println(" 2. satirda calisti");


    }
}
