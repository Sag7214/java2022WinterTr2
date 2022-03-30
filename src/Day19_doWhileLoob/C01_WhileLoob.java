package Day19_doWhileLoob;

public class C01_WhileLoob {
    public static void main(String[] args) {

        int input=30;

        // for loob ile de yapabiliriz cumku arligi belli
        // ama biz while loob ile yapacagiz

        int bolen=1;
        int sayac=0;

        while (bolen<=input) {

            if (input % bolen == 0) {
                System.out.println(bolen + " ");
                sayac++;

            }
            bolen++;
        }
            System.out.println("");
            System.out.println(input +" sayisini bolen"+sayac+"sayi vardir");

    }
}
