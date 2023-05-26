public class ListLinked <E>implements TDAList<E>{
    private Node<E> head;
    private int count;

    public ListLinked() {
        this.head = null;
        this.count=0;
    }

    @Override
    public void insertFirst(E x) {
        this.head = new Node<E>(x,this.head);
        this.count++;
    }

    @Override
    public void insertLast(E x) {
        if (isEmpty()) {
            insertFirst(x);
        } else {
            Node<E> aux = this.head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node<E>(x));
            this.count++;
        }
    }
    @Override
    public boolean search(Object x) {
        Node<E> aux = this.head;
        while (aux !=null && !aux.getData().equals(x)){
            aux = aux.getNext();
        }
        return aux!=null;
    }

    @Override
    public void remove(Object x) {

    }

    @Override
    public int length() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public E searchKesimo(int k) throws ExceptionNoFound {
        if(k<0 || k+1>length()){
            throw new ExceptionNoFound("INDICE INVALIDO");
        }
        Node<E> aux = this.head;
        for (int i = 0; i < k; i++) {
            aux = aux.getNext();
        }
        return aux.getData();
    }

    public String toString(){
        String str="";
        for (Node<E> aux= this.head ; aux!=null ; aux = aux.getNext()){
            str += aux.toString() + ",";
        }
        return str;
    }
}
