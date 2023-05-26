// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TDAList<Integer> l = new ListLinked<Integer>();

        l.insertLast(40);
        System.out.println(l);
        l.insertFirst(50);
        System.out.println(l);
        l.insertLast(2);
        System.out.println(l);
        System.out.println(l.search(50));


    }
}
