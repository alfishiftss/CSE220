package tree;

public class Node {
    int elem;
    Node left;
    Node right;
    Node root;

    Node(int a) {
        this.elem = a;
        this.left = null;
        this.right = null;
    }


    public static int findsum(Node root, int lvl) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && lvl % 2 == 0) {
            sum = sum + root.elem;
        }
        sum = sum + findsum(root.left, lvl + 1);
        sum = sum + findsum(root.right, lvl + 1);
        return sum;
    }

}

