public class Doubly {

    public class Node {
        Integer val;
        Node next;
        Node prev;

        Node(int a) {
            this.val = a;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addFirst(int a) {
        Node newNode = new Node(a);
         if( head == null){
             head = newNode;
         }else{
             newNode.next = head;
             head.prev = newNode;
             head = newNode;
         }
    }
    public Node NodeAt(int idx){
        Node temp = head;
        int c=0;
        while ( idx != c ){
            temp = temp.next;
            c++;
        }
        return temp;
    }


    public void Insert(int a, int idx){
        Node newNode = new Node(a);
        if( idx == 0 ){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else {
            Node pre = NodeAt(idx - 1);
            Node store = pre.next;
            pre.next = newNode;
            newNode.next = store;
            store.prev = newNode;
            newNode.prev = pre;
        }
    }

    public void remove(int idx){
        if(idx == 0){
            head = head.next;
            head.prev = null;
        }else{
            Node pre = NodeAt(idx-1);
            Node store = pre.next.next;
            store.prev = pre;
            pre.next = store;
        }
    }

    public void print(){
        Node temp = head;
        while( temp!= null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
