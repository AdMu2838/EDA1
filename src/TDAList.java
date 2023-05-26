public interface TDAList <E>{
    void insertFirst(E x);
    void insertLast (E x);

    boolean search (E x);
    void remove(E x);
    int length();
    boolean isEmpty();
    E searchKesimo (int k) throws ExceptionNoFound;
}
