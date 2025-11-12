package task2;

public class UWG_AdjMatrix {


        public static void addEdge(int[][] arr, int src, int dest, int weight) {
            arr[src][dest] = weight;
            arr[dest][src] = weight;
        }

        public static void printmatrix(int[][] arr) {
            int n = arr.length;

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
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int countDegree(int[][] arr) {

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


        public static void main(String[] args) {
            int[][] arr = new int[7][7];
            addEdge(arr, 0, 5, 4);
            addEdge(arr, 0, 4, 6);
            addEdge(arr, 0, 2, 8);
            addEdge(arr, 5, 4, 2);
            addEdge(arr, 5, 1, 3);
            addEdge(arr, 1, 4, 5);
            addEdge(arr, 2, 4, 7);
            addEdge(arr, 2, 3, 1);
            addEdge(arr, 5, 6, 9);

            printmatrix(arr);

            System.out.println("Mximum weigthted Degree");
            System.out.println(countDegree(arr));
        }
    }

