package Day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
public class C02_LinkedList {
    public static void main(String[] args) {

        // List'den gelen ozellikleri biliyoruz.
        // onun icin Deque'den gelen ozelliklere bakalim.

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); // basa element ekler

        ll1.addLast(20); // sona element ekler, add() gore daha hizlidir.
        System.out.println(ll1);  // [10, 20]

        System.out.println(ll1.element()); //  10  ilk elementi silmeden bize dondurur.
        // ilk element yoksa exception firlatir.
        System.out.println(ll1);  //  [10, 20]

        System.out.println( ll1.getLast() ); //  20  son elementi silmeden bize dondurur.
        System.out.println( ll1.getFirst() ); // 10  ilk elementi silmeden bize dondurur.

        ll1.offer(30); // sona ekler ama bize birsey dondurmez.
        System.out.println(ll1);   // [10, 20, 30]

        ll1.offerLast(40); // // sona ekler ve bize true dondurur.
        System.out.println(ll1);//[10, 20, 30, 40]

        ll1.offerFirst(50);
        System.out.println(ll1);  // [50, 10, 20, 30, 40]

        System.out.println(ll1.peek());//  50 ilk elementi silmeden bize dondurur,bulamazsa null dondurur.

        System.out.println(ll1.poll());  // 50  bastaki elementi donduruyor.

        ll1.poll();

    }
}
