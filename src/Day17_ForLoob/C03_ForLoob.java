package Day17_ForLoob;

public class C03_ForLoob {
    public static void main(String[] args) {

        // ekrana 10 kez "Java guzeldir" yazdirin

        /*

        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        System.out.println("java guzeldir");
        */
       String str = "java guzeldir";
        for (int i =1; i <=10 ; i++) {
            System.out.println(i+"-" +str);
            System.out.println("-----------------------------");

        }
        for (int i = 1; i <=11 ; i++) {
            System.out.println(i+"- java guzeldir");

        }
    }
}
