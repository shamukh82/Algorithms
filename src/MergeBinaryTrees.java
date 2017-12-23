/**
 * Created by smukherjee5 on 12/19/17.
 */
public class MergeBinaryTrees {
public static void main(String[] args){
//    TreeNode node1 = new TreeNode(1);
//    TreeNode node12 = new TreeNode(3);
//    node1.left=node12;
//
//
//    TreeNode node13 = new TreeNode(2);
//    TreeNode node21 = new TreeNode(5);
//
//    node1.right=node13;
//    node12.left=node21;
//
//    System.out.println(node1.val);
//    print(node1);
//
//
//    TreeNode nodeNext1 = new TreeNode(2);
//    TreeNode nodeNext2 = new TreeNode(1);
//    TreeNode nodeNext3 = new TreeNode(4);
//    TreeNode nodeNext4 = new TreeNode(3);
//    TreeNode nodeNext5 = new TreeNode(7);
//
//    nodeNext1.left=nodeNext2;
//    nodeNext2.right=nodeNext3;
//
//    nodeNext1.right=nodeNext4;
//    nodeNext4.right=nodeNext5;
//    System.out.println("*******");
//    System.out.println(nodeNext1.val);
//    print(nodeNext1);
//
//    System.out.println("*******");
//    TreeNode merged =mergeTrees(node1,nodeNext1);
//    System.out.println(merged.val);
//    print(merged);

    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.left.left = new TreeNode(3);
    System.out.println(root1.val);
    print(root1);

    System.out.println("*******");
    TreeNode root2 = new TreeNode(1);
    root2.right = new TreeNode(2);
    root2.right.right = new TreeNode(3);
    System.out.println(root2.val);
    print(root2);

    System.out.println("*******");
    TreeNode merged =mergeTrees(root1,root2);
    System.out.println(merged.val);
    print(merged);

}

static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    TreeNode temp=null;

    if (t1==null && t2==null){
        return temp;
    }

    if(t1 != null && t2 == null){
        temp = new TreeNode(t1.val);
        temp.left = mergeTrees(t1.left,null);
        temp.right = mergeTrees(t1.right,null);

        return temp;
    }
    if(t1 == null && t2 != null){
        temp = new TreeNode(t2.val);
        temp.left = mergeTrees(null,t2.left);
        temp.right = mergeTrees(null,t2.right);

        return temp;
    }
    if(t1!=null && t2!=null){
         temp = new TreeNode(t1.val+t2.val);

        temp.left = mergeTrees(t1.left,t2.left);
        temp.right = mergeTrees(t1.right,t2.right);
    }

    return temp;

}

 static void print(TreeNode rootNode){

    if(rootNode==null){
        return;
    }

    if (rootNode.left!=null && rootNode.right!=null)
    {
        System.out.println(rootNode.left.val+"   "+rootNode.right.val);

        print(rootNode.left);

        print(rootNode.right);

    }

     if (rootNode.left!=null && rootNode.right==null) {

         System.out.println(" "+rootNode.left.val);
         print(rootNode.left);
    }

     if (rootNode.left==null && rootNode.right!=null) {

         System.out.println("    "+rootNode.right.val);
         print(rootNode.right);
     }

//     if(rootNode!=null){
//         print(rootNode.left);
//         System.out.println(rootNode.val);
//         print(rootNode.right);


     }



}


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }