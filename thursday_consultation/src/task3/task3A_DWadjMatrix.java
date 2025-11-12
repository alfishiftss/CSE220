package task3;

public class task3A_DWadjMatrix {

    public static void addEdge(int[][] arr, int src, int dest, int weight) {
        arr[src][dest] = weight;
    }

    public static void printAdjMatrix(int[][] adjMatrix) {
        int n = adjMatrix.length;


        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.print("   ");
        for (int j = 0; j < n; j++) {
            System.out.print("--");
        }
        System.out.println();


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

    public static int outDegree(int[][] arr) {
        int max = 0;
        int row = 0;
        while (row < arr.length) {
            int count = 0;

            for (int i = 0; i < arr[row].length; i++) {
                count += arr[row][i];
            }

            if (count >= max) {
                max = count;
            }
            row++;

        }
        return max;
    }

    public static int maxDegree(int[][] arr) {
        int ver;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }

            if (count >= maxi) {
                maxi = count;
                ver = i;
            }

        }
        return maxi;

    }

    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        addEdge(arr, 0, 1, 2);
        addEdge(arr, 0, 4, 4);
        addEdge(arr, 1, 2, 6);
        addEdge(arr, 1, 5, 7);
        addEdge(arr, 2, 3, 3);
        addEdge(arr, 2, 4, 5);
        addEdge(arr, 4, 5, 1);
        addEdge(arr, 4, 1, 2);
       // printAdjMatrix(arr);
       // System.out.println(inDegree(arr, 4));
        System.out.println("Sum of highest Edge Weight");
        System.out.println(outDegree(arr));
        System.out.println("Maximum amount of degree");
        System.out.println(maxDegree(arr));
    }
}
