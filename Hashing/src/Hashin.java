public class Hashin {
    private Node[] arr;

    class Node{
        int key;
        String value;
        Node next;
        Node(int id, String name){
            this.key = id;
            this.value = name;
        }
    }
    int a =0;
    class hashTable{
        Node [] arr;
        hashTable(int size){
            arr = new Node[size];
            //this.size = size;
            a = size;
        }
    }
    public void insert(int id, String name){
        Node std = new Node(id,name);
        int idx = hashFunction(id);
        Node temp = arr[idx];
        if(temp==null){
            arr[idx] = std;
        }else{
            while( temp.next != null ){
                temp = temp.next;
            }
            temp.next = std;
        }
    }

    private int hashFunction(int id){
        int indx = id%a;
        return indx;
    }
    public void print(){
        for( int i=0; i<arr.length; i++){
            Node temp = arr[i];
            while( temp!=null){
                System.out.println(temp.key + " " + temp.value);
            }
        }
    }

}
