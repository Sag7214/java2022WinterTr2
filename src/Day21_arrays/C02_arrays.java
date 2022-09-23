package Day21_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String arr1[]= { " ali","veli","ayse"};  // array icindeki elementlere ulasmamiz icin index kullaniriz
        System.out.println(arr1[0]);    //Ali

        arr1[1]= "Esila";
        System.out.println(arr1[1]);  // esila  (olarak degistirdik)
        // array 'in icindeki index' i kullanarak  , elementlere ulasabilir ve update edebiliriz.

        int arr2[]=new int[4];
        System.out.println(arr2[1]);     // 0
        System.out.println(arr2[3]);     // 0
        //System.out.println(arr2[5]);    // ArrayIndexOutOfBoundsException

        // arrayin tamamini yazdirmak istersek
        System.out.println(arr2);    // [I@2133c8f8   // array'ler non- primitive olduklarindan
                                                       // direk yazdirmak istersek
                                                          //  java referans bilgisini yazdirir

        for (int i = 0; i<4; i++) {
            System.out.print(arr2[i]+" ");

            System.out.println("");

        }
          // array i yazdirmak icin javadaki arrays clasindan toString()'i kullaniriz.
        System.out.println(Arrays.toString(arr2));   //  [0, 0, 0, 0]

        arr2[1]= 11;
        arr2[3] = 22;
        System.out.println(Arrays.toString(arr2));    // [0, 11, 0, 22]
        System.out.println(Arrays.toString(arr1));    // [ ali, Esila, ayse]

    }
}
