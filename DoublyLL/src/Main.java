public class Main{
    public static void main(String[] args) {
        Doubly list = new Doubly();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.Insert(25,2);
        list.Insert(5,0);
        list.remove(0);
        list.remove(1);

        list.print();
    }
}
