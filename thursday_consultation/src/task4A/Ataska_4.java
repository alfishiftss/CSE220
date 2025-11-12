package task4A;

public class Ataska_4 {

    public static void addEdge(int[][] arr, int src, int dest, int weight) {
        arr[src][dest] = weight;
    }

    public static void printAdjMatrix(int[][] adjMatrix) {
        int n = adjMatrix.length;

        // Print column headers
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Print separator
        System.out.print("   ");
        for (int j = 0; j < n; j++) {
            System.out.print("--");
        }
        System.out.println();

        // Print rows with row labels
        for (int i = 0; i < n; i++) {
            System.out.print(i + " | "); // Row label
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int inDegree(int[][] arr, int ver) {
        int count = 0;
        for (int i = 0; i < arr[ver].length; i++) {
            count += arr[i][ver];
        }
        return count;
    }

    public static int outDegree(int[][] arr, int ver) {
        int count = 0;
        for (int i = 0; i < arr[ver].length; i++) {
            count += arr[ver][i];
        }
        return count;
    }

    public static int[][] modit(int [][] arr){
        for( int i=0; i<arr.length; i++){
            for( int j=0; j<arr[i].length; j++){
                if( arr[i][j] != 0 ){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        addEdge(arr,0,1,2);
        addEdge(arr,0,4,4);
        addEdge(arr,1,2,6);
        addEdge(arr,1,5,7);
        addEdge(arr,2,3,3);
        addEdge(arr, 2, 4 ,5);
        addEdge(arr,4,5,1);
        addEdge(arr,4,1,2);
        addEdge(arr,3,4,4);
        printAdjMatrix(arr);
        //System.out.println(inDegree(arr, 4));
       // System.out.println(outDegree(arr, 4));
         modit(arr);
        printAdjMatrix(arr);

    }
}