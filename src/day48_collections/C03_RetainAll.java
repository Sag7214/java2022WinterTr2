package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {

    public class c03RetainAll {
        public void main(String[] args) {

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer>set3=new HashSet<>();  // ben yazdim calisma
            set1.add(10);
            set1.add(20);

            set2.addAll(set1);
            set2.add(25);
            set2.add(30);

            System.out.println(set1); // [20, 10]
            System.out.println(set2); // [20, 25, 10, 30]

            System.out.println(set2.retainAll(set1)); // true
            System.out.println(set1); // [20, 10]
            System.out.println(set2); // [20, 10]
        }
    }
}
