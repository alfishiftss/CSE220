public class Main {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
       // list.addLast(40);
        list.addLast(40);
       // list.addLast(10);
        list.addLast(50);
        //list.delSame();

        //list.dedAF(60);
        //list.dedAF(70);
        //list.dedAF(80);

        list.print();
       // System.out.println(list.NodeAt(2).val);
    }
}
