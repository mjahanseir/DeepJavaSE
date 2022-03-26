import java.util.Scanner;

public class Exercise25_06 {
  public static void main(String[] args) {
  	BSTWithNumberOfLeaves<String> tree = new BSTWithNumberOfLeaves<>();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter six strings: ");
    for (int i = 0; i < 6; i++) {
      String s = input.next();
      tree.insert(s.trim());
    }
    System.out.println("The number of leaves in the tree is " + tree.getNumberOfLeaves());
  }
}

class BSTWithNumberOfLeaves<E> extends BST<E> {
  /** Create a default BST with a natural order comparator */
  public BSTWithNumberOfLeaves() {
    super();
  }

  /** Create a BST with a specified comparator */
  public BSTWithNumberOfLeaves(java.util.Comparator<E> c) {
    super(c); 
  }

  /** Create a binary tree from an array of objects */
  public BSTWithNumberOfLeaves(E[] objects) {
    super(objects);
  }	
  
  /** Displays the leaf nodes */
  public int getNumberOfLeaves() {
    return getNumberOfLeaves(root);
  }

  /** Returns the number of leaf nodes */
  private int getNumberOfLeaves(TreeNode<E> root) {
    if (root == null)
      return 0;
    else if (root.left == null && root.right == null)
      return 1;
    else
      return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
  }
}