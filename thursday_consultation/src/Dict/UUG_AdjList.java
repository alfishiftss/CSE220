package Dict;

class edge{
    int ver;
    edge next;
    int weight;
    edge(int a, int b){
        this.ver = a;
        next = null;
        this.weight = b;
    }
}

public class UUG_AdjList {

    public static void addEdge(edge[] arr, int src, int dest, int weight){
        edge temp = arr[src];
        edge newedge = new edge(dest,weight);
        newedge.next = temp;
        arr[src] = newedge;
    }
    public static void printAdjList(edge[] adjList) {
        for (int i = 0; i < adjList.length; i++) {
            System.out.print(i + " : ");
            edge temp = adjList[i];
            while (temp != null) {
                System.out.print(temp.ver);
                if (temp.next != null) {
                    System.out.print(" , ");
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static int countDegree(edge[] arr){
        int max = 0;

        for( int i=0; i<arr.length; i++){
            int count =0;
            edge temp = arr[i];

            while( temp != null ){
                count++;
                temp = temp.next;
            }
            if( count >= max ){
                max = count;
            }
        }
        return max;
    }
    public static edge[] modded(edge[]arr){
        int n = arr.length;
        edge[] newarr = new edge[n];

        for( int i=0; i<n ; i++){
            edge temp = arr[i];
            while( temp != null){
                addEdge(newarr,i, temp.ver, temp.weight);
                addEdge(newarr, temp.ver, i, temp.weight);
                temp = temp.next;
            }
        }
        return newarr;
    }

    public static int maxOutDegree(edge[] arr) {
        int maxDegree = 0;
        int vertex = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            edge temp = arr[i];
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            if (count > maxDegree) {
                maxDegree = count;
                vertex = i;
            }
        }
        System.out.println("Vertex with max out-degree = " + vertex + " , Degree = " + maxDegree);
        return vertex;
    }


    public static int maxOutWeight(edge[] arr) {
        int maxWeight = 0;
        int vertex = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            edge temp = arr[i];
            while (temp != null) {
                sum += temp.weight;
                temp = temp.next;
            }
            if (sum > maxWeight) {
                maxWeight = sum;
                vertex = i;
            }
        }
        System.out.println("Vertex with max outgoing weight sum = " + vertex + " , Sum = " + maxWeight);
        return vertex;
    }

    public static void main(String[] args) {
        edge[] arr = new edge[7];
        addEdge(arr,0,1,2);
        addEdge(arr,0,4,4);
        addEdge(arr,1,2,6);
        addEdge(arr,1,5,7);
        addEdge(arr,2,3,3);
        addEdge(arr, 2, 4 ,5);
        addEdge(arr,4,5,1);
        addEdge(arr,4,1,2);
        printAdjList(arr);
        System.out.println(countDegree(arr));
        maxOutDegree(arr);
        maxOutWeight(arr);
       edge[] finals = modded(arr);
        System.out.println(finals);
    }
}
