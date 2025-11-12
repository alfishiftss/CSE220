public class SingleLL {
    static class Node{
        int val;
        Node next;
        Node prev;

        Node(int a){
            this.val=a;
            this.next=null;
            this.prev=null;
        }
    }
    public Node head = null;
    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        Node temp = head;
        if( head == null){
            head = newNode;
            return;
        }
        while( temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public Node NodeAt( int idx){
        Node temp = head;
        int c =0;
        while(idx!=c){
            c++;
            temp=temp.next;
        }
        return temp;
    }
    public void InsertAt(int idx,int val ){
        Node newNode = new Node(val);
        if( idx == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node prev = NodeAt(idx-1);
            Node store = prev.next;
            newNode.next = store;
            prev.next = newNode;
        }
    }
    public void delAt(int idx){
        if( idx == 0){
            head = head.next;
        }else{
            Node prev = NodeAt(idx-1);
            Node store = prev.next.next;
            prev.next = store;
        }
    }
    public void reverse(){
        Node prev = null;
        Node cur = head;
        while( cur != null){
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        this.head = prev;
    }
    public void delSame() {
        Node cur = head;

        while (cur != null) {
            Node runner = cur;

            while (runner.next != null) {
                if (runner.next.val == cur.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            cur = cur.next;
        }
    }




    public void print(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.val );
            temp = temp.next;
        }
    }
}
