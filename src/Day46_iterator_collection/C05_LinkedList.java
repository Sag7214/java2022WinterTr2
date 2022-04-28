package Day46_iterator_collection;

import java.util.LinkedList;

public class C05_LinkedList {

    public static void main(String[] args) {

        // hem list hem de Queue nin child clasidir

        LinkedList<Integer> list= new LinkedList<>();
        list.add(5);
        list.add(10); // add methodu listen geldigi icin hep sona ekler
        list.addFirst(11);   // addFirst deque den gelir  / basa ekler first=ilk =oncelikli demek
        list.addLast(12);   // addLast deque den gelir  sona ekler last= son

        System.out.println(list); // [11, 5, 10, 12]

        list.add(2,25);  // [11, 5, 25, 10, 12]  Araya ekleme yapmak 2. indexe ekleme yaptik

        System.out.println(list);

    }
}
