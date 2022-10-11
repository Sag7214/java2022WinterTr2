package Day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();
        System.out.println(ll1.peek());  // null  bosken kullanilinca null dondurur

        // System.out.println(ll1.element());   bosken kullanirsak exception firlatir

        System.out.println(ll1.poll());  // bosken kullanilinca null dondurur yoksa bastaki elementi donduruyor
        System.out.println(ll1.pollFirst());  //null  bos oldugu icin  yoksa bastaki elementi donduruyor
        System.out.println(ll1.pollLast());  //null  bos oldugu icin yoksa sondakini donduruyor

       //  ll1.pop();   // ilk elementi silip bize dondurur burda bos oldugu icin exception firlatiyor.

        ll1.push(30); // listenin basina element ekler.
        ll1.push(20);  // listenin basina element ekler.
        System.out.println(ll1);   // [20, 30]

        System.out.println(ll1.remove());  //  20  ilk elementi siler ve bize dondurur ilk
        // elementi bulamazsa exception firlatir.

        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);  // object olarak 50 yi siler  [30, 40, 30]
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);   // [40, 30]

        System.out.println(ll1.iterator().next());
        System.out.println(ll1.iterator().hasNext());





    }
}
