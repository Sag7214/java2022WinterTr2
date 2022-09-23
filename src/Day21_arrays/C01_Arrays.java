package Day21_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        // array' i nasil deklare ederiz. (tanitmak gibi)
        // data turu arrey ismi ve koseli parantez yazarak array deklare edilir.

        int arr1[]= {1,3,5};
        int[]arr2={1,2,3};
        int []arr3={1,4,5};

        double arr4[]={10.2,40.2,32.1};
        String arr5[]= { " ali " , " veli" ,"  deli"};

        // assing mecburi midir? (atamak)
        int sayi;
        int arr6[];     // kabul etti ama kullanmadan once mutlaka deger atamasi yapmamiz gerekir
                         // hem declare edip  hem atama yapacaksak
                  // 1- declare edip esitligin sagina suslu parantez icerisinde degerleri yazabiliriz

        String arr7[]= { " ali " , " veli" ,"  deli"};

                   //2- icine deger atmadan olusturmak isterseniz , boyutunu belirlememiz gerekir

        int arr8[]= new int[5];   // java icinde 5 tane default deger olan bir array olusturur
                              // [0,0,0,0,0]

    }
}
