package day09_ternary_Switch;

public class C03_ternary {
    public static void main(String[] args) {

        int sayi=-140;

        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // // ve sonucu yazdiran bir ternary yapin

        String sonuc=sayi>=100 ? " Sayi 3 basamakli veya daha buyuk" : " sayi negatif veya 3 basamaktan kucuk";

        //  ternary bize sonuc dondurdugu ici
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable ye atama yapabiliriz

        System.out.println(" girdiginiz sayi analizi :" + sonuc);
    }
}
