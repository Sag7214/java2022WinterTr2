package Day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {

        List<Integer> sayilarList= new ArrayList<>();

        sayilarList.add(5);   // [5]
        sayilarList.add(8);    // [5, 8]
        sayilarList.add(0,7);    // [7, 5, 8]
        sayilarList.add(2,7);    // [7, 5, 7, 8]

        System.out.println(sayilarList.get(2));    //  7
        System.out.println(sayilarList);    // [7, 5, 7, 8]

        //ben ekledim
        System.out.println(sayilarList.get(3));  // 8
        System.out.println(sayilarList);// [7, 5, 7, 8]





    }
}
