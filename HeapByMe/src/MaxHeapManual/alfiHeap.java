package MaxHeapManual;

 class maxHeap {
    private int[] harr;
    private int size;
    private int cap;

    maxHeap( int cap){
        this.harr = new int[cap];
        this.size = 0;
        this.cap = cap;
    }
    public void insert(int val){
        if( this.size >= cap ){
            System.out.println("this arr is full");
            return;
        }
        this.harr[size] = val;
        swim(this.size);
        this.size = this.size+1;
    }

    public void swim( int idx ){
        int parentidx = (idx-1)/2;
        if( idx == 0 ){
            return;
        }
        if( harr[parentidx] < harr[idx] ){
            int temp = harr[parentidx];
            harr[parentidx] = harr[idx];
            harr[idx] = temp;
            swim(parentidx);
        }
    }
    public void printHeap(){
        for( int i=0; i<this.size; i++){
            System.out.println(this.harr[i] + " ");
        }
        System.out.println();
    }

    public int removeMax() {
        if (size <= 0) {
            System.out.println("No elements to remove");
            return -1;
        }
        int temp = harr[0];
        this.harr[0] = this.harr[size - 1];
        this.harr[size - 1] = 0;
        this.size = this.size - 1;
        heapify(0);
        return temp;
    }

    public void heapify( int idx ){
        int left = 2*idx+1;
        int right = 2*idx+2;
        if (left >= size) {
            return;
        }
        int large = left;
        if( right < this.size && harr[large]<harr[right]){
            large = right;
        }
        if(harr[idx] < harr[large]){
            int temp = harr[idx];
            harr[idx] = harr[large];
            harr[large] = temp;
            heapify(large);
        }
    }

         }

class TopKElements {
    public static int[] findtopk(int[] nums, int k) {
        maxHeap heap = new maxHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.removeMax();

        }
        return result;

    }
}

   public class alfiHeap {
       public static void main(String[] args) {
           int[] nums = {4,10,2,8,6,7};
           int k = 3;

            int[] findk = TopKElements.findtopk(nums,k);
            for( int i=0; i<k; i++){
                System.out.print(findk[i] + " ");
            }


       }
   }
