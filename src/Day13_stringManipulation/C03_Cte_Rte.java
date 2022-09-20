package Day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

        // int sayi="ali Can";  // hata int degere string yazilmaz( hemen hata verir)
        // syntax hatalarini java yazdigimizda gorur ve altini kirmizi cizer
        // tum projede alti cizili bir kod varsa
        // projede hic bir kod calismaz....

        String str = "javada hersey zamanla oturur";
        System.out.println(str.substring(100));  // -4972 hatasini verir  (burada ise calistirinca anlar)


    }
}
