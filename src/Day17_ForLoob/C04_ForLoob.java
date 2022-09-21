package Day17_ForLoob;

public class C04_ForLoob {
    public static void main(String[] args) {

        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin.

        for (int i = 10; i <= 29; i++) {
            System.out.print(i + ", ");
        }
            System.out.println(30);  // boyle olabilir.


            int baslangic = 15;
            int bitis = 20;
            for (int i = baslangic; i <= bitis; i++) {

                if (i < bitis) {
                    System.out.print(i + ", ");  // boyle daha iyi olur cunku baslangic ve bitis degerlerini
                } else {                         // istedigimiz gibi kolayca degistirebiliriz
                    System.out.println(i);
                }
            }
        }
    }


