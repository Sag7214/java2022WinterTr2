package Day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        // bu cumlede bosluk disindaki karakter sayiisini bulunuz
        System.out.println("space haric karakter sayisi :" + str.replace(" " ,"").length());
        // atama yapilmadigi surece orjinal string kalici olarak degismez sadece o satir icin
       // degisiklik yapilip sonuc yazdirimis olur
        System.out.println("orjinal str karakter sayisi :" +str.length());

        // str de kalici degisiklik yapalim
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz yapalim  ama kalici olarak yapilacak
        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra : " + str);

        str.replace("ne cok","ne az");
        System.out.println(str);
        // boyle calistirinca yine ayni seyi yazdirir kalici degisiklik icin
        // tek tek atama yapmak gerekir yukardaki gibi
    }
}
