package MinHeapAss;

class MinHeap{
    private int [] arr;
    private int size;
    private int cap;
    MinHeap(int m){
        arr = new int[m];
        this.cap = m;
        this.size = 0;
    }

    public void insert(int val){
        if( this.size >= cap){
            System.out.println("this arr is full");
            return;
        }
        this.arr[size] = val;

        swim(this.size);
        this.size = this.size+1;
    }

    public void swim( int idx ) {
        int parentidx = (idx - 1) / 2;
        if (idx == 0) {
            return;
        }
        if (arr[parentidx] > arr[idx]) {
            int temp = arr[parentidx];
            arr[parentidx] = arr[idx];
            arr[idx] = temp;
            swim(parentidx);
        }
    }

        public int removemin(){
            if( size <=0 ){
                System.out.println(" No elements to be removed");
            }
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = 0;
            size = size-1;
            heapify(0);
            return temp;
        }

        public void heapify( int idx ){
        int left = 2*idx+1;
        int right = 2*idx+2;
        if( left>= size ){
            return ;
        }

        int smallest = left;
        if( right<size && arr[smallest] > arr[right]){
            smallest = right;
        }
        if( arr[idx] > arr[smallest]){
            int temp = arr[idx];
            arr[idx] = arr[smallest];
            arr[smallest] = temp;
            heapify(smallest);
        }
    }
    public int[] getHeapArray() {
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    static int[] assigned(int m, int[] task){
        MinHeap h1 = new MinHeap(m);
        for( int i=0; i<m; i++){
            h1.insert(0);
        }
       // int[] result = new int[m];
        for( int i=0; i< task.length; i++){
            int temp = h1.removemin();
            int temp2 = temp+task[i];
            h1.insert(temp2);

        }
        return h1.getHeapArray();

    }
}

public class alfiMinHeap {
    public static void main(String[] args) {

        // MinHeap heap = new MinHeap(4);
        int m = 4;
        int[] tasks = {2, 4, 7, 1, 6};
        int[] newt = MinHeap.assigned(4, tasks);
        System.out.print("Final heap: ");
        for (int i=0;i< newt.length; i++) {
            System.out.print(newt[i] + " ");

        }
    }
}


