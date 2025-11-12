package tree;

import java.util.*;
import tree.Node;
public class removeMax(Node root) {
    if( root == null ){
        return;
    }
    if( root.left==null && root.right == null){
        root.elem = null;
    }
    return removeMax(root.right);

}
