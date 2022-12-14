package Day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]= {{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);     // 7
        System.out.println(arr[1][1]);    // 10

          // ilk inner array'in tum elementlerini yazdirin.

        System.out.println(arr[0]);       // [I@2133c8f8  (arr[0] bir array oldugundan direk yazdirilamaz)
        System.out.println(Arrays.toString(arr[0]));    //  [3, 1, 7]

        System.out.println(Arrays.toString(arr));     // [[I@2133c8f8, [I@43a25848]

        // MDArray'de tum elementleri bir array olarak yazdirmak istersek,

        System.out.println(Arrays.deepToString(arr));    // [[3, 1, 7], [6, 10, 2]]



    }



    }

