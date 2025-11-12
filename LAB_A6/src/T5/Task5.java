package T5;

// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        Integer lsum = lefsum(root.left);
        Integer rsum =ritsum(root.right);

        private static Integer lefsum(BTNode root){
            if( root == null ){
                return 0;
            }
            return lefsum(root.left) + lefsum ( root.right ) + (Integer)root.elem;
        }
        private static Integer ritsum(BTNode root){
            if( root == null ){
                return 0;
            }
            return ritsum(root.left) + ritsum(root.right) + (Integer)root.elem;
        }
        return (lsum-ritsum);
    }
    //============================================================================

}
