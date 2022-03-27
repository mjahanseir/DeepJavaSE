package LiangExcercise10thAll.Exercise_25.Exercise_25_04;

import LiangExcercise10thAll.Exercise_25.Exercise_25_05.Tree;

public abstract class AbstractTree<E>
		implements Tree<E> {
	@Override /** Inorder traversal from the root */
	public void inorder() {
	}

	@Override /** Postorder traversal from the root */
	public void postorder() {
	}

	@Override /** Preorder traversal from the root */
	public void preorder() {
	}

	@Override /** Return true if the tree is empty */
	public boolean isEmpty() {
		return getSize() == 0;
	}
}