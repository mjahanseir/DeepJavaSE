import java.util.*;

public class Exercise25_14 {
  public static void main(String[] args) {
  	BSTWithBFT<String> tree = new BSTWithBFT<>(); 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter strings: ");
    for (int i = 0; i < 6; i++) {
      String s = input.next();
      tree.insert(s.trim());
    }
    tree.breadthFirstTraversal();
    
    BSTWithBFT<String> tree1 = new BSTWithBFT<>(new String[]
      {"Tom", "George", "Jean", "Jane", "Kevin", "Peter", "Susan", 
        "Jen", "Kim", "Michael", "Michelle"});
    System.out.println();
    tree1.breadthFirstTraversal();
    
    BSTWithBFT<Integer> tree2 = 
      new BSTWithBFT<>(new Integer[]{50, 45, 35, 48, 59, 51, 58}); 
    System.out.println();
    tree2.breadthFirstTraversal();
  }
}

class BSTWithBFT<E> extends BST<E> {
  /** Create a default BST with a natural order comparator */
  public BSTWithBFT() {
    super();
  }

  /** Create a BST with a specified comparator */
  public BSTWithBFT(java.util.Comparator<E> c) {
    super(c); 
  }

  /** Create a binary tree from an array of objects */
  public BSTWithBFT(E[] objects) {
    super(objects);
  }	

  /** Displays the nodes in breadth-first traversal */
  public void breadthFirstTraversal() {
    java.util.LinkedList<TreeNode<E>> queue = 
      new java.util.LinkedList<TreeNode<E>>();
    
    if (root == null) 
      return;
    
    queue.add(root);
    
    while (!queue.isEmpty()) {
      TreeNode<E> node = queue.removeFirst();
      
      System.out.print(node.element + " ");
      if (node.left != null)
        queue.add(node.left);
      if (node.right != null)
        queue.add(node.right);
    }
  }
}