package Day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

         int arr[]= {3,5,6,1,9,45,25,4,9,0};

        // sort method u olmadan yapalim

        int enKucukSayi= Integer.MAX_VALUE;       //[arr[0];
        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<enKucukSayi){
            enKucukSayi=arr[i];

        }

        if (arr[i]>enBuyukSayi){
            enBuyukSayi=arr[i];
            }
        }
        System.out.println("Array deki en kucuk Sayi:"+ enKucukSayi);
        System.out.println("Array deki en buyuk Sayi:"+ enBuyukSayi);



        Arrays.sort(arr);
        System.out.println("Array'deki en kucuk sayi : " + arr[0]);
        System.out.println("Array'deki en buyuk sayi : " + arr[arr.length-1]);

}

         }








